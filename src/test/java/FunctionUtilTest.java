import Model.*;
import org.junit.Before;
import org.junit.Test;


import java.util.Arrays;
import java.util.List;

public class FunctionUtilTest {

    List<Account> accounts;
    List<Address> addresses;
    List<AppUser> admins;
    List<AppUser> guests;
    List<AppUser> hosts;
    List<Country> countries;
    List<HomeProperty> homeProperties;
    List<Property> properties;
    List<Reservation> reservations;
    List<City> cities;
    List<Payment> payments;

    City city;
//    Country Ethiopia,UnitedStates,Canada,UnitedKingdom,France;
//    City AddisAbaba,FairField,DC,London,Paris,toronto;
    Country UnitedStates;
    City FairField,DC,Iowa,Dallas,Texas, Chicago, LosAngles, NewYork;


    @Before
    public void setUp() {
        // create city
//        AddisAbaba = TestFactory.createCity("AddisAbaba");
        FairField = TestFactory.createCity("FairField");
        DC = TestFactory.createCity("DC");
//        Texas =
//        London = TestFactory.createCity("London");
//        Paris = TestFactory.createCity("Paris");
        //Canada = TestFactory.createCity("Canada");

        cities = Arrays.asList(FairField,DC,Iowa,Dallas,Texas, Chicago, LosAngles, NewYork);

        //Creat Country
//        Ethiopia = TestFactory.createCountry("Ethiopia", "ETH");
        UnitedStates = TestFactory.createCountry("UnitedStates", "USA");
//        Canada = TestFactory.createCountry("Canada", "CA");
//        UnitedKingdom = TestFactory.createCountry("UnitedKingdom", "UK");
//        France = TestFactory.createCountry("France", "FRA");

        countries=Arrays.asList(Ethiopia,UnitedStates,Canada,UnitedKingdom,France);




        //creat HostAppUser
    }

        //


    @Test
    public void getNumberOfPropertiesInACityTest(){

        Long val = FunctionUtil.getNumberOfPropertiesInACity.apply(Ethiopia,AddisAbaba);

    }

}
