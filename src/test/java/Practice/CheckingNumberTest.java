package Practice;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckingNumberTest {
    private CheckingNumber checkingNumber;

    @BeforeEach
    void setUp() {
        checkingNumber = new CheckingNumber();
    }

    @Test
    void testIsPrime() {

        assertTrue(checkingNumber.isPrime(2));
        assertTrue(checkingNumber.isPrime(3));
        assertTrue(checkingNumber.isPrime(5));
        assertTrue(checkingNumber.isPrime(7));
        assertFalse(checkingNumber.isPrime(1));
        assertFalse(checkingNumber.isPrime(4));
        assertFalse(checkingNumber.isPrime(9));
        assertFalse(checkingNumber.isPrime(15));
        assertTrue(checkingNumber.isPrime(101));
        assertFalse(checkingNumber.isPrime(1000000000000L));
    }
}