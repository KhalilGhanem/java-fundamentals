/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package inheritance;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    @Test void someLibraryMethodReturnsTrue() {
        Library classUnderTest = new Library();
        assertTrue(classUnderTest.someLibraryMethod(), "someLibraryMethod should return 'true'");
    }
    @Test void testRestaurant(){
        Restaurant rest1 =new Restaurant("McDonald");
        rest1.setStars(5);
        rest1.setPrice(5);
        assertEquals("Restaurant{name='McDonald', stars=5.0, price=$$$$$, reviews=[]}",rest1.toString(),"from test rest");
    }
    @Test void testReview(){
        Review rev= new Review("Ryan");
        rev.setBody("One of the Restaurant that i ever visit");
        rev.setStars(5);
        assertEquals("Review{body='One of the Restaurant that i ever visit', author='Ryan', stars=5.0}",rev.toString());
    }
    @Test void testSetReviews(){
        Restaurant rest=new Restaurant("McDonald");
        rest.setStars(5);
        rest.setPrice(5);
        Review rev= new Review("Ryan");
        rev.setBody("One of the Restaurant that i ever visit");
        rev.setStars(5);
        Review rev2= new Review("Raul");
        rev2.setBody("very bad");
        rev2.setStars(2);
        List<Review>reviewList=new ArrayList<Review>();
        reviewList.add(rev);
        reviewList.add(rev2);
        rest.setReviews(reviewList);
        assertEquals("Restaurant{name='McDonald', stars=5.0, price=$$$$$, reviews=[Review{body='One of the Restaurant that i ever visit', author='Ryan', stars=5.0}, Review{body='very bad', author='Raul', stars=2.0}]}",rest.toString());
    }
    @Test void testaddReview(){
        Restaurant rest=new Restaurant("KFC");
        rest.setStars(4);
        Review rev3=new Review("Khalil");
        rev3.setBody("good one");
        rev3.setStars(4);
        rest.addReview(rev3);
        assertEquals("Restaurant{name='KFC', stars=4.0, price=, reviews=[Review{body='good one', author='Khalil', stars=4.0}]}",rest.toString());
    }
    @Test void testRestaurantStars(){
        Restaurant rest=new Restaurant("KFC");
        rest.setPrice(5);
        rest.setStars(4);
        Review rev3=new Review("Khalil");
        rev3.setBody("good one");
        rev3.setStars(3);
        rest.addReview(rev3);
     assertEquals(3.5,rest.stars);

    }
    @Test void testShop(){
        Shop kareem=new Shop("Kareem","Very Good",400);
        assertEquals("Shop{name='Kareem', description='Very Good', singsNumber='$$$$', reviewAverage='0.0', reviews=[]}",kareem.toString());
    }
    @Test void tesShopReview(){
        Shop kareem=new Shop("Kareem","Very Good",400);
        Review rev3=new Review("Khalil");
        rev3.setBody("good one");
        rev3.setStars(4);
        kareem.addReview(rev3);
        assertEquals("Shop{name='Kareem', description='Very Good', singsNumber='$$$$', reviewAverage='4.0', reviews=[Review{body='good one', author='Khalil', stars=4.0}]}",kareem.toString());
    }
    @Test void testTheater (){
        Theater prime=new Theater("Prime");
        prime.addMovie("Rush Hour");
        prime.addMovie("BatMan");
        assertEquals("Theater{name='Prime', movies=[Rush Hour, BatMan], reviews=[], TheaterRate=0.0}",prime.toString());
    }
    @Test void testTheaterReview(){
        Theater prime=new Theater("Prime");
        prime.addMovie("Rush Hour");
        prime.addMovie("BatMan");
        Review rev5=new Review("Ryan","bad",2,"BatMan");
        Review rev6=new Review("khalil","very good",4,"Rush Hour");
        prime.addReview(rev5);
        prime.addReview(rev6);
        assertEquals("Theater{name='Prime', movies=[Rush Hour, BatMan], reviews=[Review{body='bad', author='Ryan', stars=2.0}, Review{body='very good', author='khalil', stars=4.0}], TheaterRate=3.0}",prime.toString());
    }

}
