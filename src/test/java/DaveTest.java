import Model.*;
import Model.Enum.ApprovedStatus;
import Model.Enum.Type;
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
    City AddisAbaba,FairField,DC,London,Paris,toronto;
    AppUser NatiH,DaveH,WondeH,MikyH,ZolaH,MerishH;
    AppUser NahomG,DagiG,NehemiaG,DerwG,FiyoG,BetiG;

    Reservation r1,r2,r3,r4,r5,r6;
    Property Addp1,Addp2,Addp3,Addp4,Addp5,Addp6,Addp7;
    Property Faip1,Faip2,Faip3,Faip4,Faip5,Faip6,Faip7,Faip8;
    Property Dcp1,Dcp2,Dcp3;
    Property Lonp1,Lonp2,Lonp3,Lonp4;
    Property Parp1,Parp2,Parp3,Parp4,Parp5,Parp6;
    Property torp1,torp2,torp3,torp4,torp5;

    @Before
    public void setUp() {
        //Creat Country
        Ethiopia = TestFactory.createCountry("Ethiopia", "ETH");
        UnitedStates = TestFactory.createCountry("UnitedStates", "USA");
        Canada = TestFactory.createCountry("Canada", "CA");
        UnitedKingdom = TestFactory.createCountry("UnitedKingdom", "UK");
        France = TestFactory.createCountry("France", "FRA");

        countries=Arrays.asList(Ethiopia,UnitedStates,Canada,UnitedKingdom,France);

        // create city
        AddisAbaba = TestFactory.createCity("AddisAbaba");
        FairField = TestFactory.createCity("FairField");
        DC = TestFactory.createCity("DC");
        London = TestFactory.createCity("London");
        Paris = TestFactory.createCity("Paris");
        toronto = TestFactory.createCity("Canada");

        cities = Arrays.asList(AddisAbaba, FairField, DC, London, Paris, toronto);

        //creat HostAppUser
//        NatiH=TestFactory.createHost("NatiH","Teshome");
//        DaveH=TestFactory.createHost("DaveH","Demelash");
//        WondeH=TestFactory.createHost("WondeH","Kebe");
//        MikyH=TestFactory.createHost("MikyH","Demeoz");
//        ZolaH=TestFactory.createHost("ZolaH","Belayneh");
//        MerishH=TestFactory.createHost("MerishH","Yonas");
//
//        hosts=Arrays.asList(NatiH,DaveH,WondeH,MikyH,ZolaH,MerishH);
//
//
//
//
//        //Creat GustAppUser
//
//        NahomG=TestFactory.createGuest("NahomG","Nahom");
//        DagiG=TestFactory.createGuest("DagiG","Henok");
//        NehemiaG=TestFactory.createGuest("NehemiaG","Wondeemu");
//        DerwG=TestFactory.createGuest("DerwG","Bereket");
//        FiyoG=TestFactory.createGuest("FiyoG","Belay");
//        BetiG=TestFactory.createGuest("BetiG","Solomon");
//
//        guests=Arrays.asList(NatiH,DagiG,NehemiaG,DerwG,FiyoG,BetiG);


        //create Reservation
        r1=TestFactory.createReservation(3l,2022);
        r2=TestFactory.createReservation(4l,2022);
        r3=TestFactory.createReservation(5l,2022);
        r4=TestFactory.createReservation(6l,2022);
        r5=TestFactory.createReservation(7l,2022);
        r6=TestFactory.createReservation(8l,2022);
        reservations=Arrays.asList(r1,r2,r3,r4,r5,r6);

        //Creat Property


        Addp1=TestFactory.creatProperty("Addp1",90.0,3);
        Addp2=TestFactory.creatProperty("Addp2",102.0,4);
        Addp3=TestFactory.creatProperty("Addp3",78.6,3);
        Addp4=TestFactory.creatProperty("Addp4",77.9,2);
        Addp5=TestFactory.creatProperty("Addp5",88.2,1);
        Addp6=TestFactory.creatProperty("Addp6",50.6,7);
        Addp7=TestFactory.creatProperty("Addp7",6.8,6);


        Faip1=TestFactory.creatProperty("Faip1",36.5,6);
        Faip2=TestFactory.creatProperty("Faip2",23.8,4);
        Faip3=TestFactory.creatProperty("Faip3",23.0,2);
        Faip4=TestFactory.creatProperty("Faip4",89.0,3);
        Faip5=TestFactory.creatProperty("Faip5",123.0,7);
        Faip6=TestFactory.creatProperty("Faip6",234.6,3);
        Faip7=TestFactory.creatProperty("Faip7",178.9,2);
        Faip8=TestFactory.creatProperty("Faip8",345.7,5);


        Dcp1=TestFactory.creatProperty("Dcp1",34.5,5);
        Dcp2=TestFactory.creatProperty("Dcp2",34.5,1);
        Dcp3=TestFactory.creatProperty("Dcp3",34.8,4);


        Lonp1=TestFactory.creatProperty("Lonp1",45.6,4);
        Lonp2=TestFactory.creatProperty("Lonp2",34.7,6);
        Lonp3=TestFactory.creatProperty("Lonp3",76.6,7);
        Lonp4=TestFactory.creatProperty("Lonp4",56.8,3);


        Parp1=TestFactory.creatProperty("Parp1",45.7,3);
        Parp2=TestFactory.creatProperty("Parp2",77.5,2);
        Parp3=TestFactory.creatProperty("Parp3",56.9,1);
        Parp4=TestFactory.creatProperty("Parp4",23.9,4);
        Parp5=TestFactory.creatProperty("Parp5",57.9,6);
        Parp6=TestFactory.creatProperty("Parp6",39.0,8);

        torp1=TestFactory.creatProperty("torp1",36.8,4);
        torp2=TestFactory.creatProperty("torp2",102.9,3);
        torp3=TestFactory.creatProperty("torp3",89.4,6);
        torp4=TestFactory.creatProperty("torp4",56.8,5);
        torp5=TestFactory.creatProperty("torp5",99.0,2);







    }
    //Creat Property

}
