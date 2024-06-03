package Practice;

/* Потрібно написати програму, яка перевірить вхідне число чи воно є простим числом. Доступна, .jar, (.git - прогрес відстеження),
перевірка стрічки(Exception Math, char, String), обмеження розрядності (+-?) 10^12, оптимізація коду (реалізація, як найкраще)
  gitHub - гілка, readMe, реліз з jar, тести */

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        WritingNumber writingNumber = new WritingNumber();
        CheckingNumber checkingNumber = new CheckingNumber();

        boolean nextTry = false;

        while (!nextTry){
            int numberEntered = writingNumber.writingNumber();
            checkingNumber.getCheckingNumber(numberEntered);

            int choiceNumber = chosenNumber();
            if(choiceNumber == 1){
                nextTry = true;
                System.out.println("===========================================");
                System.out.println("The task completed");
                System.out.println("===========================================");
            }
        }
    }

    public static int chosenNumber(){
        boolean nextTry = false;
        int choiceNumber = 0;

        while (!nextTry){
            System.out.println("===========================================");
            System.out.println("Do you want to continue or break?");
            System.out.print("Enter you answer (0 -> continue | 1 -> break): ");
            String choiceChair = scanner.nextLine();
            try {
                choiceNumber = Integer.parseInt(choiceChair);
                if(choiceNumber < 0 || choiceNumber > 2){
                    System.out.println("===========================================");
                    System.out.println("Wrong number!");
                    continue;
                }
                nextTry = true;
            }catch (NumberFormatException e){
                System.out.println("Wrong number!");
            }

        }
        return choiceNumber;
    }
}
