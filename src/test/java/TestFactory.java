import Model.*;
import Model.Enum.ApprovedStatus;
import Model.Enum.Type;


import java.time.LocalDate;

import java.util.ArrayList;


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
            String lastName){
        AppUser appUser = new AppUser();
        appUser.setRoles(new ArrayList<>());
        Guest guest = new Guest();
        guest.setUser(appUser);
        appUser.getRoles().add(guest);
        appUser.setFirstName(firstName);
        appUser.setLastName(lastName);
        return appUser;
    }

    public static AppUser createHost(
            String firstName,
            String lastName){
        AppUser appUser = new AppUser();
        appUser.setRoles(new ArrayList<>());
        Guest host = new Guest();
        host.setUser(appUser);
        appUser.getRoles().add(host);
        appUser.setFirstName(firstName);
        appUser.setLastName(lastName);
        return appUser;
    }

    public static Reservation createReservation(Long dayDiff, int year){
        Reservation reservation = new Reservation();
        LocalDate baseTime = LocalDate.now().withYear(year);
        reservation.setStartDate(baseTime);
        reservation.setEndDate(baseTime.plusDays(dayDiff));
        return reservation;
    }

    public static Payment createPayment(){
        Payment payment = new Payment();
        return payment;
    }

    public static Property createProperty(
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

}
