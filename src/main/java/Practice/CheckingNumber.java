package Practice;

public class CheckingNumber {
    public void getCheckingNumber(long numberEntered) {
        if (isPrime(numberEntered)) {
            System.out.println("===========================================");
            System.out.println(numberEntered + " is a prime number!");
        } else {
            System.out.println("===========================================");
            System.out.println(numberEntered + " is not a prime number!");
        }
    }

    public boolean isPrime(long gotNumber) {
        if (gotNumber <= 1) { // If your number is
            return false;
        }
        if (gotNumber <= 3) {
            return true;
        }
        if (gotNumber % 2 == 0 || gotNumber % 3 == 0) {
            return false;
        }
        for (long i = 5; i * i <= gotNumber; i += 6) {
            if (gotNumber % i == 0 || gotNumber % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}
