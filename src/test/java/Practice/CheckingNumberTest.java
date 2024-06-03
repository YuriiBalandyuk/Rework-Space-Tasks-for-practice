package Practice;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class CheckingNumberTest {
    private CheckingNumber checkingNumber;
    private IsPrimeNumberImproved isPrimeNumberImproved;

    @BeforeEach
    void setUp() {
        checkingNumber = new CheckingNumber();
        isPrimeNumberImproved = new IsPrimeNumberImproved();
    }

    @Test
    void isPrime_is_prime() {
        boolean primeNumber = checkingNumber.isPrime(53);
        Assertions.assertTrue(primeNumber);
    }

    @Test
    void isPrime_is_not_prime() {
        boolean notPrimeNumber = checkingNumber.isPrime(16);
        Assertions.assertFalse(notPrimeNumber);
    }

    @Test
    void isPrime_is_251() {
        boolean primeNumber = checkingNumber.isPrime(251);
        Assertions.assertTrue(primeNumber);
    }

    @Test
    void isPrime_is_67280421310721L() {
        boolean primeNumber = checkingNumber.isPrime(67280421310721L);
        Assertions.assertTrue(primeNumber);
    }

    @Test
    void isPrime_is_2000000000000L() {
        boolean primeNumber = checkingNumber.isPrime(2000000000000L);
        Assertions.assertFalse(primeNumber);
    }

    @Test
    void isPrimeNumber_improved_with_67280421310721L_() {
        boolean primeNumber = isPrimeNumberImproved.isPrimeNumber_improved(67280421310721L);
        Assertions.assertTrue(primeNumber);
    }

    @Test
    void isPrimeNumber_with_67280421310721L_() {
        boolean prime = checkingNumber.isPrime(67280421310721L);
        Assertions.assertTrue(prime);
    }

    @Test
    public void isPrimeNumber_with_67280421310721L_timed_here() {
        long[] executionTimes = new long[10];

        for (int i = 0; i < 10; i++) {
            long startTime = System.nanoTime();
            boolean primeNumber = checkingNumber.isPrime(67280421310721L);
            executionTimes[i] = System.nanoTime() - startTime;
            Assertions.assertTrue(primeNumber);
        }

        Arrays.sort(executionTimes);
        System.out.println("\nisPrimeNumber() Execution Times (nanoseconds):");
        System.out.println("Max: " + executionTimes[9] + " (" + executionTimes[9] / 1000000 + "ms)");
        System.out.println("Min: " + executionTimes[0] + " (" + executionTimes[0] / 1000000 + "ms)");
        System.out.println("Median: " + executionTimes[5] + " (" + executionTimes[5] / 1000000 + "ms)");
    }

    @Test
    public void isPrimeNumber_improved_with_67280421310721L_timed() {
        long[] executionTimes = new long[10];

        for (int i = 0; i < 10; i++) {
            long startTime = System.nanoTime();
            boolean primeNumber = isPrimeNumberImproved.isPrimeNumber_improved(67280421310721L);
            executionTimes[i] = System.nanoTime() - startTime;
            Assertions.assertTrue(primeNumber);
        }

        Arrays.sort(executionTimes);
        System.out.println("\nisPrimeNumber_improved() Execution Times (nanoseconds):");
        System.out.println("Min: " + executionTimes[0] + " (" + executionTimes[0] / 1000000 + "ms)");
        System.out.println("Max: " + executionTimes[9] + " (" + executionTimes[9] / 1000000 + "ms)");
        System.out.println("Median: " + executionTimes[5] + " (" + executionTimes[5] / 1000000 + "ms)");
    }

}