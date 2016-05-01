package refactoring;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class MovieTest {
    
    @Test
    public void testGetPriceCode() {
        System.out.println("getPriceCode");
        Movie instance = new Movie("movie1",1);
        int expResult = 1;
        int result = instance.getPriceCode();
        assertEquals(expResult, result);
    }
    @Test
    public void testSetPriceCode() {
        System.out.println("setPriceCode");
        Movie instance = new Movie("movie1",1);
        int expResult = 2;
        instance.setPriceCode(2);
        int result = instance.getPriceCode();
        assertEquals(expResult, result);
    } 

    @Test
    public void testGetTitle() {
        System.out.println("getTitle");
        Movie instance = new Movie("movie1", 1);
        String expResult = "movie1";
        String result = instance.getTitle();
        assertEquals(expResult, result);
    }
    
}
