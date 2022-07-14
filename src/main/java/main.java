import Model.*;
import Model.Enum.ReservationStatusEnum;

import java.time.LocalDate;
import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.time.Period;

public class main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println(
                "1. Wende 1\n" +
                "2. Wende2\n" +
                "3. Wende3\n" +
                "4. Nati1\n" +
                "5. Nati2\n" +
                "6. Nati3\n" +
                "7. Dave1\n" +
                "8. Dave2\n" +
                "9. Dave3\n" +
                "10. Zola1\n" +
                "11. Zola2\n" +
                "12. Zola3\n" +
                "13. Miky1\n" +
                "14. Miky2\n" +
                "15. Miky3\n");
        System.out.println("Enter the number you want to run the function of or exit to quit: ");
        while(true){
            String input = in.nextLine();
            int intInput = 0;
            if(input.equalsIgnoreCase("exit")){
                System.out.println("Thank you for using our system");
                break;
            }
            try {
                intInput = Integer.parseInt(input);
            }catch (Exception e){
                System.out.println("Enter only numbers please: ");
                continue;

            }
            switch (intInput){
//                ---Wendemagegn Kebede---
                case 1:
                    System.out.println("1");
                    canceledReservationsCount.apply(null,null);
                    break;
                case 2:
                    averagePerNightPriceInACity.apply(null,null);
                    break;
                case 3:
                    topKCitiesWithTheHighestNumberOfGuest.apply(null,null, null);
                    break;
//                ---------------
//                ---Natnael Teshome---
                case 4:
                    getNumberOfPropertiesInACity.apply(null,null);
                    break;
                case 5:
                    topKGuestsWithHighestReservation.apply(null,null);
                    break;
                case 6:
                    topKHostsWithHighestProperty.apply(null,null);
                    break;
//                ---------------
//                ---Dawit Demelash---somecode
                case 7:
                    some();
//                    hostAverageAgeInACountry.apply(null);
                    break;
                case 8:
                    some();
//                    hostAverageAgeInACountry.apply(null);
                    break;
                case 9:
                    some();
//                    hostAverageAgeInACountry.apply(null);
                    break;
//                ---------------
//                ---Zelalem Belayneh---
                case 10:
                    some();
//                    hostAverageAgeInACountry.apply(null);
                    break;
                case 11:
                    some();
//                    hostAverageAgeInACountry.apply(null);
                    break;
                case 12:
                    some();
//                            .apply(null);
                    break;
//                ---------------
//                ---Michael Demewoz---
                case 13:
                    getTheHighestPayment.apply(null, null);
                    break;
                case 14:
                    getHighestPriceInTheWorld.apply(null);
                    break;
                case 15:
                    hostAverageAgeInACountry.apply(null);
                    break;
                default:
                    System.out.println("Enter a valid number: ");
                    break;



            }
        }
    }

    static void some(){}

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
                    .collect(Collectors.groupingBy(Reservation::getProperty,
                            Collectors.summingDouble(reservation -> reservation.
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



    /**Helper Method Dave*/
    static Function<Country, DoubleSummaryStatistics>averagePerNightPriceInACountry = (country) ->
            getPropertyFromHost.apply(country)
                    .stream()
                    .mapToDouble(property -> property.getPricePerNight())
                    .summaryStatistics();




/**Dave 8 - Country that have The Highest average price per day in the world*/

    static Function<Country, Optional<Double>> highestAveragePriceInTheWorld= (country) ->
            Stream.of(country)
                    .flatMap(country1 -> country1.getCities().stream())
                    .flatMap(city1 -> city1.getUsers().stream())
                    .flatMap(user -> user.getRoles().stream())
                    .filter(role -> role instanceof Guest)
                    .map(role -> (Guest) role)
                    .flatMap(guest -> guest.getReservations().stream())
                    .collect(Collectors.groupingBy(reservation -> reservation.getGuest().getUser().getCity().getCountry(),Collectors.summingDouble(res->averagePerNightPriceInACountry.apply(country).getAverage())))
                    .entrySet()
                    .stream()
                    .sorted((s1,s2)->(int)(s2.getValue()-s1.getValue()))
                    .findFirst()
                    .map(higestPrice->higestPrice.getValue());

/**Dave 9  - Country that have The Lowest average price per day in the world*/


    static Function<Country, Optional<Double>> lowestAveragePriceInTheWorld= (country) ->
            Stream.of(country)
                    .flatMap(country1 -> country1.getCities().stream())
                    .flatMap(city1 -> city1.getUsers().stream())
                    .flatMap(user -> user.getRoles().stream())
                    .filter(role -> role instanceof Guest)
                    .map(role -> (Guest) role)
                    .flatMap(guest -> guest.getReservations().stream())
                    .collect(Collectors.groupingBy(reservation -> reservation.getGuest().getUser().getCity().getCountry(),Collectors.summingDouble(res->averagePerNightPriceInACountry.apply(country).getAverage())))
                    .entrySet()
                    .stream()
                    .sorted((s1,s2)->(int)(s1.getValue()-s2.getValue()))
                    .findFirst()
                    .map(lowestPrice->lowestPrice.getValue());

    /**Dave 11 Gust average age in the Country*/
    static Function<Country, Double> guestAverageAgeInACountry = (country) ->
            Stream.of(country)
                    .flatMap(country1 -> country1.getCities().stream())
                    .flatMap(city -> city.getUsers().stream())
                    .flatMap(user -> user.getRoles().stream())
                    .filter(role -> role instanceof Guest)
                    .map(role -> (Guest) role)
                    .mapToInt(guest -> guest.getUser().getAge())
                    .summaryStatistics()
                    .getAverage();


}
