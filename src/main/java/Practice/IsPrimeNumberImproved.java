package Practice;

import java.math.BigInteger;
import java.util.Random;

public class IsPrimeNumberImproved {
    public boolean isPrimeNumber_improved(long number) {
        long r = number - 1;
        int d = 0;

        while (r % 2 == 0) {
            d += 1;
            r /= 2;
        }

        int k = 1;
        for (int i = 0; i < k; i++) {
            if (!millerRabinTest(r, number)) {
                return false;
            }
        }
        return true;
    }

    private boolean millerRabinTest(long first, long second) {
        Random rand = new Random();
        BigInteger x = BigInteger.valueOf(2).add(BigInteger.valueOf(rand.nextInt()).mod(BigInteger.valueOf(second - 2)));

        BigInteger y = x.modPow(BigInteger.valueOf(first), BigInteger.valueOf(second));

        if (y.equals(BigInteger.ONE) || y.equals(BigInteger.valueOf(second - 1))) {
            return true;
        }

        while (first != second - 1) {
            y = y.modPow(BigInteger.TWO, BigInteger.valueOf(second));
            first *= 2;

            if (y.equals(BigInteger.ONE)) return false;
            if (y.equals(BigInteger.valueOf(second - 1))) return true;
        }

        return false;
    }
}
