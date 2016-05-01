package refactoring;

import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ProgramTest {
    
    public ProgramTest() {
    }

    @Test
    public void testMain() {
        String result;
        String expected;
        Movie m1 = new Movie("movie1", 1);
        Movie m2 = new Movie("movie2", 2);
        Rental r1 = new Rental(m1, 10);
        Rental r2 = new Rental(m2, 5);
        Customer c1 = new Customer("joe");
        c1.addRental(r1);   c1.addRental(r2);   
        result = c1.statement();
        expected = "Rental Record for joe\n" +
"	Title		Days	Amount\n" +
"	movie1		10	30.0\n" +
"	movie2		5	4.5\n" +
"Amount owed is 34.5\n" +
"You earned 3 frequent renter points";
        assertEquals(expected, result);
    }
    
}
