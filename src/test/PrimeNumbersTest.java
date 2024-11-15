import main.PrimeNumber;
import org.junit.Test;

import static org.junit.Assert.assertTrue;
//import static org.junit.jupiter.api.Assertions.*;

public class PrimeNumbersTest {
     @Test
    public void testIsPrimeWithPrimeNumbers() {
        // Test known prime numbers
        assertTrue(PrimeNumber.isPrime(2));
        assertTrue(PrimeNumber.isPrime(3));

    }
}
