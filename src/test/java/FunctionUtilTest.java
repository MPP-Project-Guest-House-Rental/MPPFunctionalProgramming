import Model.*;
import org.junit.Before;
import org.junit.Test;


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

    AppUser NatiH,DaveH,WondeH,MikyH,ZolaH,MerishH;
    AppUser NahomG,DagiG,NehemiaG,DerwG,FiyoG,BetiG;

    @Before
    public void setUp(){
        // create city
        AddisAbaba = TestFactory.createCity("AddisAbaba");
        FairField = TestFactory.createCity("FairField");
        DC = TestFactory.createCity("DC");
        London = TestFactory.createCity("London");
        Paris = TestFactory.createCity("Paris");
        Canada = TestFactory.createCity("Canada");
        //creat HostAppUser
        NatiH=TestFactory.createHost("NatiH","Teshome");
        DaveH=TestFactory.createHost("DaveH","Demelash");
        WondeH=TestFactory.createHost("WondeH","Kebe");
        MikyH=TestFactory.createHost("MikyH","Demeoz");
        ZolaH=TestFactory.createHost("ZolaH","Belayneh");
        MerishH=TestFactory.createHost("MerishH","Yonas");

        //Creat GustAppUser

        NahomG=TestFactory.createGuest("NahomG","Nahom");
        DagiG=TestFactory.createGuest("DagiG","Henok");
        NehemiaG=TestFactory.createGuest("NehemiaG","Wondeemu");
        DerwG=TestFactory.createGuest("DerwG","Bereket");
        FiyoG=TestFactory.createGuest("FiyoG","Belay");
        BetiG=TestFactory.createGuest("BetiG","Solomon");






        //



    }

    @Test
    public void testFun1(){

    }

}
