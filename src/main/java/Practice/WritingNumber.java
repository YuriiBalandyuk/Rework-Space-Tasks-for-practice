package Practice;

import java.util.Scanner;


public class WritingNumber {
    public long writingNumber() throws NumberFormatException {
        Scanner scanner = new Scanner(System.in);
        long number = 0;
        boolean correctNumber = false;

        while (!correctNumber) {
            System.out.println("===========================================");
            System.out.print("Enter your number: ");
            String inputNumber = scanner.nextLine();
            try {
                number = Long.parseLong(inputNumber);
                if (number < 0 || number > 1000000000000L) {
                    System.out.println("===========================================");
                    System.out.println("Wrong number! Enter a number between 0 and 1,000,000,000,000.");
                    continue;
                }
                correctNumber = true;
            } catch (NumberFormatException e) {
                System.out.println("===========================================");
                System.out.println("Wrong number!");
            }
        }
        return number;
    }
}