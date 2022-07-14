import Model.*;
import org.junit.Before;
import org.junit.Test;


import java.util.List;

public class WendeTest {



    List<AppUser> guests;
    List<AppUser> hosts;
    List<Country> countries;
    List<HomeProperty> homeProperties;
    List<Property> properties;
    List<Reservation> reservations;
    List<City> cities;
    List<Payment> payments;

    City         Bucharest,Rochester,Lakewood,SanAntonio,Philadelphia,Denver,Quebec      ,SaltLakeity ,Lisbon   ,   ElPaso     , Newrleans  , Omaha   ,    Richmond  ,  Wien   ,     Bridgeport , SantaAna ,   Honolulu  ,  MorenoValley,Milwaukee ,  Fullerton;
    Country USA, Canada;
    AppUser Caydence,Carter,Hank,Nate,Chuck,Phillip,Noah,Alexander,Nick,Sabina,Hank1,Barney,Brad,Julian,Isabel,Hope,Candice,Tyson,Sarah,Hailey;
    AppUser Maia,Leroy,Fred,Martin,Ada,Clint,Chloe,Evelynn,Isabella,Bob,Bart,Lily,Carter1,Lexi,Anthony,Ruth,Tara,Anthony1,Benny, Hanna;


    @Before
    public void setUp(){
      USA = TestFactory.createCountry("United States", "US");
      Canada = TestFactory.createCountry("Canada", "Ca");

        //creat HostAppUser
        Caydence = TestFactory.createHost("Caydence" ,"Hall" );
        Carter1 = TestFactory.createHost("Carter" ,"Bailey" );
        Hank1 = TestFactory.createHost("Hank" ,"Martin" );
        Nate = TestFactory.createHost("Nate" ,"Warren" );
        Chuck= TestFactory.createHost("Chuck" ,"Leslie" );
        Phillip = TestFactory.createHost("Phillip" ,"Preston" );
        Noah= TestFactory.createHost("Noah" ,"Olson" );
        Alexander =TestFactory.createHost("Alexander" ,"Styles" );
        Nick= TestFactory.createHost("Nick" ,"Power" );
        Sabina= TestFactory.createHost("Sabina" ,"Bennett" );
        Hank= TestFactory.createHost("Hank" ,"Evans" );
        Barney=TestFactory.createHost("Barney" ,"Willis" );
        Brad=TestFactory.createHost("Brad" ,"Locke" );
        Julian= TestFactory.createHost("Julian" ,"Sherry" );
        Isabel=TestFactory.createHost("Isabel" ,"Victor" );
        Hope= TestFactory.createHost("Hope" ,"White" );
        Candice=TestFactory.createHost("Candice" ,"Hammond" );
        Tyson= TestFactory.createHost("Tyson" ,"Stuart" );
        Sarah =TestFactory.createHost("Sarah" ,"Abbot" );
        Hailey= TestFactory.createHost("Hailey" ,"Ellison" );

        //Creat GustAppUser

        Maia	    =TestFactory.createGuest("Maia	  ","Ryan");
        Leroy	    =TestFactory.createGuest("Leroy	   ","Cobb");
        Fred	    =TestFactory.createGuest("Fred	   ","Everett");
        Martin	    =TestFactory.createGuest("Martin	","Uttridge");
        Ada	        =TestFactory.createGuest("Ada	   ","Payne");
        Clint	    =TestFactory.createGuest("Clint	   ","Snell");
        Chloe	    =TestFactory.createGuest("Chloe	   ","Tailor");
        Evelynn	    =TestFactory.createGuest("Evelynn	","Beal");
        Isabella    =TestFactory.createGuest("Isabella","Fowler");
        Bob	        =TestFactory.createGuest("Bob	   ","Radley");
        Bart	    =TestFactory.createGuest("Bart	   ","Khan");
        Lily	    =TestFactory.createGuest("Lily	   ","Hill");
        Carter	    =TestFactory.createGuest("Carter	","Rosenbloom");
        Lexi	    =TestFactory.createGuest("Lexi	   ","Hardwick");
        Anthony	    =TestFactory.createGuest("Anthony	","Vangness");
        Ruth	    =TestFactory.createGuest("Ruth	   ","Bright");
        Tara	    =TestFactory.createGuest("Tara	   ","Murray");
        Anthony1	    =TestFactory.createGuest("Anthony","Bright");
        Benny	    =TestFactory.createGuest("Benny	   ","Olson");
        Hanna	    =TestFactory.createGuest("Hanna	   ","Richards");

        //Cities

        Bucharest=TestFactory.createCity("Bucharest");
        Rochester=TestFactory.createCity("Rochester");
        Lakewood=TestFactory.createCity("Lakewood" );
        SanAntonio=TestFactory.createCity("San Antonio");
        Philadelphia=TestFactory.createCity("Philadelphia");
        Denver=TestFactory.createCity("Denver");
        Quebec=TestFactory.createCity("Quebec");
        SaltLakeity=TestFactory.createCity("Salt Lake City");
        Lisbon=TestFactory.createCity("Lisbon");
        ElPaso=TestFactory.createCity("El Paso");
        Newrleans=TestFactory.createCity("New Orleans");
        Omaha=TestFactory.createCity("Omaha");
        Richmond=TestFactory.createCity("Richmond");
        Wien=TestFactory.createCity("Wien");
        Bridgeport=TestFactory.createCity("Bridgeport");
        SantaAna=TestFactory.createCity("Santa Ana");
        Honolulu=TestFactory.createCity("Honolulu");
        MorenoValley=TestFactory.createCity("Moreno Valley");
        Milwaukee=TestFactory.createCity("Milwaukee");
        Fullerton=TestFactory.createCity("Fullerton");

 }

    @Test
    public void testFun1(){

    }

}
