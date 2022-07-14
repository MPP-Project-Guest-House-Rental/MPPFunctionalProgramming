import Model.*;
import org.junit.Before;

import java.util.Arrays;
import java.util.List;

public class DaveTest {

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

    Country Ethiopia,UnitedStates,Canada,UnitedKingdom,France;


    @Before
    public void setUp() {
        //Creat Country
        Ethiopia = TestFactory.createCountry("Ethiopia", "ETH");
        UnitedStates = TestFactory.createCountry("UnitedStates", "USA");
        Canada = TestFactory.createCountry("Canada", "CA");
        UnitedKingdom = TestFactory.createCountry("UnitedKingdom", "UK");
        France = TestFactory.createCountry("France", "FRA");
    }

}
