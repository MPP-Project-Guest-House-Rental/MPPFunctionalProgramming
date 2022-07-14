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

    City AddisAbaba,FairField,DC,London,Paris,Canada;



    @Before
    public void setUp() {
        // create city
        AddisAbaba = TestFactory.createCity("AddisAbaba");
        FairField = TestFactory.createCity("FairField");
        DC = TestFactory.createCity("DC");
        London = TestFactory.createCity("London");
        Paris = TestFactory.createCity("Paris");
        Canada = TestFactory.createCity("Canada");
        cities = Arrays.asList(AddisAbaba, FairField, DC, London, Paris, Canada);


        //creat HostAppUser
    }








        //


    @Test
    public void testFun1(){

    }

}
