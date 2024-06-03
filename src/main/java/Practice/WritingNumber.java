package Practice;

import java.util.Scanner;

import java.util.Scanner;

public class WritingNumber {
    public int writingNumber(){
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        boolean correctNumber = false;

        while (!correctNumber){
            System.out.println("===========================================");
            System.out.print("Enter your number: ");
            String inputNumber = scanner.nextLine();
            try {
                number = Integer.parseInt(inputNumber);
                if(number < 0){
                    System.out.println("===========================================");
                    System.out.println("Wrong number!");
                    continue;
                }
                correctNumber = true;
            }catch (NumberFormatException e){
                System.out.println("===========================================");
                System.out.println("Wrong number!");
            }
        }
        return number;
    }
}