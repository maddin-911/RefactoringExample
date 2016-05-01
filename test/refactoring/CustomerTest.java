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
public class CustomerTest {
    
    public CustomerTest() {
    }
    
    @Test
    public void testAddRental() {
        System.out.println("addRental");
        Movie movie1 = new Movie("Testfilm",2);
        Rental arg = new Rental(movie1,5);
        Customer instance = new Customer("peter");
        instance.addRental(arg);
        
    }

    /**
     * Test of getName method, of class Customer.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Customer instance = new Customer("peter");
        String expResult = "peter";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of statement method, of class Customer.
     */
    @Test
    public void testStatement() {
        System.out.println("statement");
        Customer instance = new Customer("joe");
        Movie m1 = new Movie("movie1", 1);
        Movie m2 = new Movie("movie2", 2);
        Rental r1 = new Rental(m1, 10);
        Rental r2 = new Rental(m2, 5);
        instance.addRental(r1);   instance.addRental(r2); 
        String expResult = 
"Rental Record for joe\n" +
"	Title		Days	Amount\n" +
"	movie1		10	30.0\n" +
"	movie2		5	4.5\n" +
"Amount owed is 34.5\n" +
"You earned 3 frequent renter points";
        String result = instance.statement();
        assertEquals(expResult, result);
    }
    
}
