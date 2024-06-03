package Practice;

/* Потрібно написати програму, яка перевірить вхідне число чи воно є простим числом. Доступна, .jar, (.git - прогрес відстеження),
перевірка стрічки(Exception Math, char, String), обмеження розрядності (+-?) 10^12, оптимізація коду (реалізація, як найкраще)
  gitHub - гілка, readMe, реліз з jar, тести */

import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
            WritingNumber writingNumber = new WritingNumber();
            CheckingNumber checkingNumber = new CheckingNumber();

            boolean nextTry = false;

            while (!nextTry) {
                int choiceNumber = 0;
                System.out.println("===========================================");
                int numberEntered = writingNumber.writingNumber();
                checkingNumber.getCheckingNumber(numberEntered);

                System.out.println("\n===========================================");
                System.out.println("Do you want to continue or break?");
                System.out.print("Enter you answer (0 -> continue | 1 -> break): ");
                choiceNumber = scanner.nextInt();

                if (choiceNumber == 1) {
                    nextTry = true;
                    System.out.println("===========================================");
                    System.out.println("The application completed");
                    System.out.println("===========================================");
                }


            }
    }
}
