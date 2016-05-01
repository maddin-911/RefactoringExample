package refactoring;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Martin
 */
public class RentalTest {
    
    public RentalTest() {
    }
    
    @Test
    public void testGetDaysRented() {
        System.out.println("getDaysRented");
        Movie m1 = new Movie("movie1", 1);
        Rental instance = new Rental(m1,2);
        int expResult = 2;
        int result = instance.getDaysRented();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getMovie method, of class Rental.
     */
    @Test
    public void testGetMovie() {
        System.out.println("getMovie");
        Movie m1 = new Movie("movie1", 1);
        Rental instance = new Rental(m1,2);
        String expResult = "movie1";
        Movie result = instance.getMovie();
        String resultname=result.getTitle();
        assertEquals(expResult, resultname);
    }
    
}
