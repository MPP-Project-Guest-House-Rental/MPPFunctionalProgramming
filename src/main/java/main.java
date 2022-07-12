import Model.*;
import Model.Enum.ReservationStatusEnum;

import java.time.LocalDate;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.time.Period;

public class main {
    public static void main(String[] args) {

    }

    static Function<Country, List<Host>> getHost = (cou) ->
            Stream.of(cou)
                    .flatMap(country -> country.getCities().stream())
                    .flatMap(city -> city.getUsers().stream())
                    .flatMap(user -> user.getRoles().stream())
                    .filter(role -> role instanceof Host)
                    .map(role -> (Host) role)
                    .collect(Collectors.toList());

    static Function<Country, List<Guest>> getGuest = (cou) ->
            Stream.of(cou)
                    .flatMap(country -> country.getCities().stream())
                    .flatMap(city -> city.getUsers().stream())
                    .flatMap(user -> user.getRoles().stream())
                    .filter(role -> role instanceof Guest)
                    .map(role -> (Guest) role)
                    .collect(Collectors.toList());

    static Function<Country, List<Property>> getPropertyFromHost = (cou) ->
            getHost.apply(cou)
                    .stream()
                    .flatMap(host -> host.getProperties().stream())
                    .collect(Collectors.toList());

//    Miky number 4
    static BiFunction<Country, Integer,Double> getTheHighestPayment = (coun, year) ->
            getPropertyFromHost.apply(coun)
                    .stream()
                    .flatMap(property -> property.getReservations().stream())
                    .filter(reservation -> reservation.getStartDate().getYear() == year )
                    .collect(Collectors.groupingBy(Reservation::getProperty, Collectors.summingDouble(reservation -> reservation.
                            getProperty().
                            getPricePerNight()*
                            (Period.between(reservation.getStartDate(),reservation.getStartDate()).getDays())
                    )))
                    .entrySet()
                    .stream()
                    .sorted((p1, p2) -> (int)(p2.getValue() - p1.getValue()))
                    .map(property -> property.getValue())
                    .findFirst().get();

//    Nati number 5
    static BiFunction<Country, City, Long> getNumberOfPropertiesInACity = (count, ci) ->
        Stream.of(count)
                .flatMap(country -> country.getCities().stream())
                .filter(city -> city.getName().equals(ci))
                .flatMap(city -> city.getUsers().stream())
                .flatMap(user -> user.getRoles().stream())
                .filter(role -> role instanceof Host)
                .map(role -> (Host) role)
                .flatMap(host -> host.getProperties().stream())
                .count();

//    Wende number 2

    static BiFunction<Country,String , Long> canceledReservationsCount = (cou, cit) ->
            Stream.of(cou)
                    .flatMap(country -> country.getCities().stream())
                    .filter(city -> city.getName().equals(cit))
                    .flatMap(city -> city.getUsers().stream())
                    .flatMap(user -> user.getRoles().stream())
                    .filter(role -> role instanceof Guest)
                    .map(role -> (Guest) role)
                    .flatMap(guest -> guest.getReservations().stream())
                    .filter(reservation -> reservation.getReservationStatus().equals(ReservationStatusEnum.CANCELLED))
                    .count();

    static BiFunction<Country,String , Long> totalReservationsCount = (cou, cit) ->
            Stream.of(cou)
                    .flatMap(country -> country.getCities().stream())
                    .filter(city -> city.getName().equals(cit))
                    .flatMap(city -> city.getUsers().stream())
                    .flatMap(user -> user.getRoles().stream())
                    .filter(role -> role instanceof Guest)
                    .map(role -> (Guest) role)
                    .flatMap(guest -> guest.getReservations().stream())
                    .filter(reservation -> reservation.getReservationStatus().equals(ReservationStatusEnum.RESERVED))
                    .count();


    static BiFunction<Country, String, Double> getCancelationRateByCity = (cou,cit) ->
            canceledReservationsCount.apply(cou, cit) * 1.0
                    /totalReservationsCount.apply(cou, cit);


//    Miky Number 7
    static Function<Country, Double> getHighestPriceInTheWorld = (cou) ->
        getPropertyFromHost.apply(cou)
                .stream()
                .map(Property::getPricePerNight)
                .sorted((p1,p2) -> (int)(p2 -p1))
                .findFirst().get();
//    Nati number 13
    static BiFunction<Country,Long, List<Long>> topKGuestsWithHighestReservation = (coun, k) ->
        getGuest.apply(coun)
                .stream()
                .collect(Collectors.toMap(guest -> guest.getUser().getId(), guest -> guest.getReservations().size()))
                .entrySet()
                .stream()
                .sorted((value1, value2) -> (int)(value2.getValue() - value1.getValue()))
                .limit(k)
                .map(key -> key.getKey())
                .collect(Collectors.toList());

//    Wende number 2
    static BiFunction<Country,String, DoubleSummaryStatistics>averagePerNightPriceInACity = (coun,cit ) ->
        getPropertyFromHost.apply(coun)
                .stream()
                .mapToDouble(property -> property.getPricePerNight())
                .summaryStatistics();

//    Miky number 10
    static Function<Country, Double> hostAverageAgeInACountry = (cou) ->
        Stream.of(cou)
                .flatMap(country -> country.getCities().stream())
                .flatMap(city -> city.getUsers().stream())
                .flatMap(user -> user.getRoles().stream())
                .filter(role -> role instanceof Host)
                .map(role -> (Host) role)
                .mapToInt(host -> host.getUser().getAge())
                .summaryStatistics()
                .getAverage();

//    Nati number 14
static BiFunction<Country,Long, List<Long>> topKHostsWithHighestProperty = (coun, k) ->
        getHost.apply(coun)
                .stream()
                .collect(Collectors.toMap(host -> host.getUser().getId(), host -> host.getProperties().size()))
                .entrySet()
                .stream()
                .sorted((value1, value2) -> (int)(value2.getValue() - value1.getValue()))
                .limit(k)
                .map(key -> key.getKey())
                .collect(Collectors.toList());

// Wende number 15
    static TriFunction<Country, String,Long, List<String>> topKCitiesWithTheHighestNumberOfGuest = (coun, cit, k) ->
        getGuest.apply(coun)
                .stream()
                .collect(Collectors.groupingBy(
                        guest -> guest.getUser().getCity(), Collectors.counting()
                ))
                .entrySet().stream()
                .sorted((e1,e2)->(int)(e2.getValue()-e1.getValue()))
                .map(e -> e.getKey().getName())
                .limit(k)
                .collect(Collectors.toList());




}
