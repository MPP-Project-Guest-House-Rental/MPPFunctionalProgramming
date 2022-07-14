import Model.*;
import Model.Enum.Gender;
import org.junit.Assert.*;
import org.junit.Assert;
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

    AppUser Caydence,Carter,Hank,Nate,Chuck,Phillip,Noah,Alexander,Nick,Sabina,Hank1,Barney,Brad,Julian,Isabel,Hope,Candice,Tyson,Sarah,Hailey;
    AppUser Maia,Leroy,Fred,Martin,Ada,Clint,Chloe,Evelynn,Isabella,Bob,Bart,Lily,Carter1,Lexi,Anthony,Ruth,Tara,Anthony1,Benny, Hanna;

    Reservation r1,r2,r3,r4,r5,r6,r7,r8,r9;
    Property Addp1,Addp2,Addp3,Addp4,Addp5,Addp6,Addp7;
    Property Faip1,Faip2,Faip3,Faip4,Faip5,Faip6,Faip7,Faip8;
    Property Dcp1,Dcp2,Dcp3;
    Property Lonp1,Lonp2,Lonp3,Lonp4;
    Property Parp1,Parp2,Parp3,Parp4,Parp5,Parp6;
    Property torp1,torp2,torp3,torp4,torp5;

    @Before
    public void setUp() {
        FairField = TestFactory.createCity("FairField");
        DC = TestFactory.createCity("DC");
        Iowa = TestFactory.createCity("Iowa");
        Dallas = TestFactory.createCity("Dallas");
        Texas = TestFactory.createCity("Texas");
        Chicago = TestFactory.createCity("Chicago");
        LosAngles = TestFactory.createCity("LosAngles");
        NewYork = TestFactory.createCity("NewYork");

        cities = Arrays.asList(FairField,DC,Iowa,Dallas,Texas, Chicago, LosAngles, NewYork);


        //Creat Country
        UnitedStates = TestFactory.createCountry("UnitedStates", "USA");
        UnitedStates.setCities(cities);

        FairField.setCountry(UnitedStates);
        DC.setCountry(UnitedStates);
        Iowa.setCountry(UnitedStates);
        Dallas.setCountry(UnitedStates);
        Texas.setCountry(UnitedStates);
        Chicago.setCountry(UnitedStates);
        LosAngles.setCountry(UnitedStates);
        NewYork.setCountry(UnitedStates);

//        Roles


        //creat HostAppUser
        Caydence = TestFactory.createHost("Caydence" ,"Hall",21, Gender.MALE,DC);
        Carter1 = TestFactory.createHost("Carter" ,"Bailey",19, Gender.FEMALE,Dallas );
        Hank1 = TestFactory.createHost("Hank" ,"Martin",24, Gender.MALE,Texas );
        Nate = TestFactory.createHost("Nate" ,"Warren",28, Gender.FEMALE,NewYork );
        Chuck= TestFactory.createHost("Chuck" ,"Leslie" ,31, Gender.MALE,Chicago);
        Phillip = TestFactory.createHost("Phillip" ,"Preston" ,31, Gender.FEMALE,DC);
        Noah= TestFactory.createHost("Noah" ,"Olson" ,34, Gender.MALE,Dallas);
        Alexander =TestFactory.createHost("Alexander" ,"Styles" ,35, Gender.FEMALE,DC);
        Nick= TestFactory.createHost("Nick" ,"Power",40, Gender.FEMALE,Texas );


        //Creat GustAppUser

        Sabina= TestFactory.createGuest("Sabina" ,"Bennett" ,41, Gender.MALE,Dallas);
        Hank= TestFactory.createGuest("Hank" ,"Evans",42, Gender.MALE,FairField );
        Barney=TestFactory.createGuest("Barney" ,"Willis" ,45, Gender.FEMALE,Iowa);
        Brad=TestFactory.createGuest("Brad" ,"Locke" ,60, Gender.FEMALE,LosAngles);
        Julian= TestFactory.createGuest("Julian" ,"Sherry" ,51, Gender.MALE,Iowa);
        Isabel=TestFactory.createGuest("Isabel" ,"Victor" ,25, Gender.FEMALE,FairField);
        Hope= TestFactory.createGuest("Hope" ,"White" ,17, Gender.MALE,LosAngles);
        Candice=TestFactory.createGuest("Candice" ,"Hammond" ,50, Gender.FEMALE,NewYork);
        Tyson= TestFactory.createGuest("Tyson" ,"Stuart" ,48, Gender.MALE,Iowa);
        Sarah =TestFactory.createGuest("Sarah" ,"Abbot" ,30, Gender.FEMALE,Chicago);
        Hailey= TestFactory.createGuest("Hailey" ,"Ellison" ,31, Gender.MALE,DC);


        FairField.setUsers(Arrays.asList(Hank,Isabel));
        DC.setUsers(Arrays.asList(Caydence,Phillip,Alexander, Hailey));
        Iowa.setUsers(Arrays.asList(Barney,Julian,Tyson));
        Dallas.setUsers(Arrays.asList(Carter1,Noah, Sabina));
        Texas.setUsers(Arrays.asList(Hank1,Nick));
        Chicago.setUsers(Arrays.asList(Chuck,Sarah));
        LosAngles.setUsers(Arrays.asList(Brad,Hope));
        NewYork.setUsers(Arrays.asList(Nate,Candice));

        //create Reservation
        r1=TestFactory.createReservation(3l,2022);
        r2=TestFactory.createReservation(4l,2022);
        r3=TestFactory.createReservation(5l,2022);
        r4=TestFactory.createReservation(6l,2022);
        r5=TestFactory.createReservation(7l,2022);
        r6=TestFactory.createReservation(8l,2022);
        r7=TestFactory.createReservation(2l,2022);
        r8=TestFactory.createReservation(10l,2022);
        r9=TestFactory.createReservation(9l,2022);
        reservations=Arrays.asList(r1,r2,r3,r4,r5,r6,r7,r8,r9);

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


        Property CaydenceProperty = TestFactory.assignProperty(Caydence,Parp1);
        Property Carter1Property = TestFactory.assignProperty(Carter1,Parp2);
        Property Hank1Property = TestFactory.assignProperty(Hank1,Parp3);
        Property NateProperty = TestFactory.assignProperty(Nate,Parp4);
        Property ChuckProperty= TestFactory.assignProperty(Chuck,Parp5);
        Property PhillipProperty = TestFactory.assignProperty(Phillip,Parp6);
        Property NoahProperty = TestFactory.assignProperty(Noah,torp1);
        Property AlexanderProperty =TestFactory.assignProperty(Alexander,torp2);
        Property NickProperty = TestFactory.assignProperty(Nick,torp3);

        Reservation SabinaReservation= TestFactory.assignReservation(Sabina,CaydenceProperty,r1);
        Reservation HankReservation= TestFactory.assignReservation(Hank,Carter1Property,r2 );
        Reservation BarneyReservation=TestFactory.assignReservation(Barney,Hank1Property,r3);
        Reservation BradReservation=TestFactory.assignReservation(Brad,NateProperty,r4);
        Reservation JulianReservation= TestFactory.assignReservation(Julian,ChuckProperty,r5);
        Reservation IsabelReservation=TestFactory.assignReservation(Isabel,PhillipProperty,r6);
        Reservation HopeReservation= TestFactory.assignReservation(Hope,NoahProperty,r7);
        Reservation CandiceReservation=TestFactory.assignReservation(Candice,AlexanderProperty,r8);
        Reservation TysonReservation= TestFactory.assignReservation(Tyson,NickProperty,r9);
//        Reservation SarahReservation =TestFactory.assignReservation(Sabina,CaydenceProperty,r1);
//        Reservation HaileyReservation= TestFactory.assignReservation(Sabina,CaydenceProperty,r1);
    }

    //


    @Test
    public void getNumberOfPropertiesInACityTest(){

        List<Host> val = FunctionUtil.getHost.apply(UnitedStates);
        Assert.assertEquals(9, val.size());

    }

}
