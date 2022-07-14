import Model.*;
import Model.Enum.ApprovedStatus;
import Model.Enum.Gender;
import Model.Enum.Type;


import java.time.LocalDate;

import java.util.ArrayList;
import java.util.List;


public class TestFactory {
    static public Country createCountry(String name, String abbreviation){
        Country country = new Country();
        country.setName(name);
        country.setAbv(abbreviation);
        country.setCities(new ArrayList<>());
        return country;
    }

    public static City createCity(String name){
        City city = new City();
        city.setName(name);
        return city;
    }

    public static AppUser createGuest(
            String firstName,
            String lastName,
            int age,
            Gender gender,
            City city
    ){
        AppUser appUser = new AppUser();
        appUser.setRoles(new ArrayList<>());
        Guest guest = new Guest();
        guest.setUser(appUser);
        appUser.getRoles().add(guest);
        appUser.setFirstName(firstName);
        appUser.setLastName(lastName);
        appUser.setAge(age);
        appUser.setGender(gender);
        appUser.setCity(city);
        return appUser;
    }

    public static AppUser createHost(
            String firstName,
            String lastName,
            int age,
            Gender gender,
            City city
    ){
        AppUser appUser = new AppUser();
        appUser.setRoles(new ArrayList<>());
        Host host = new Host();
        host.setUser(appUser);
        appUser.getRoles().add(host);
        appUser.setFirstName(firstName);
        appUser.setLastName(lastName);
        appUser.setAge(age);
        appUser.setGender(gender);
        appUser.setCity(city);
        return appUser;
    }

    public static Reservation createReservation(Long dayDiff, int year){
        Reservation reservation = new Reservation();
        LocalDate baseTime = LocalDate.now().withYear(year);
        reservation.setStartDate(baseTime);
        reservation.setEndDate(baseTime.plusDays(dayDiff));
        return reservation;
    }

    static public Reservation assignReservation(AppUser person,Property property,Reservation reservation){
        Guest guest=person.getRoles().stream().filter(r->r instanceof Guest).map(r->(Guest)r).findFirst().get();
        property.getReservations().add(reservation);
        guest.getReservations().add(reservation);
        reservation.setGuest(guest);
        reservation.setProperty(property);

        return reservation;
    }

    public static Payment createPayment(){
        Payment payment = new Payment();
        return payment;
    }


    public static Property creatProperty(
            String title,
            Double pricePerNight,
            Integer capacity
    ){
        Property property = new Property();
        property.setTitle(title);
        property.setCapacity(capacity);
        property.setPricePerNight(pricePerNight);
        property.setApprovedStatus(ApprovedStatus.status());
        property.setAvailabiltyStatus(true);
        property.setType(Type.randomType());
        return property;
    }

    static public Property assignProperty(AppUser person,Property property){
        Host host=person.getRoles().stream().filter(r->r instanceof Host).map(r->(Host)r).findFirst().get();
        host.getProperties().add(property);
        property.setHost(host);
        return property;
    }

    public static Country assignCityToCountry(List<City> cities, Country country){
        country.setCities(cities);
        return country;

    }


}
