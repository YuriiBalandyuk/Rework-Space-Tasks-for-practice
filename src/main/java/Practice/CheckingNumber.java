package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CheckingNumber {
    public void getCheckingNumber(int numberEntered){
        WritePrimeNumberFast writePrimeNumberFast = new WritePrimeNumberFast();

        List<Integer> primesNumber = writePrimeNumberFast.getSearchedNumber(100);
        List<Integer> primesNumber1 = notPrimeNumber(100);

        if(numberEntered == 0 || numberEntered == 1){
            System.out.println("===========================================");
            System.out.print("This number is not prime!\n");
        }

        for(int i : primesNumber){
            if(numberEntered == i){
                System.out.println("===========================================");
                System.out.print("This number is prime!\n");
                break;
            }
        }

        for(int i : primesNumber1){
            if(numberEntered == i){
                System.out.println("===========================================");
                System.out.print("This number is not prime!\n");
                break;
            }
        }
    }

    public List<Integer> notPrimeNumber(int size){

        boolean[] arrayNumber = new boolean[size];

        Arrays.fill(arrayNumber,false);
        arrayNumber[0] = true;
        arrayNumber[1] = true;

        for (int i = 2; i < arrayNumber.length; i++) {
            for (int j = 2; i * j < arrayNumber.length; j++) {
                arrayNumber[i * j] = true;
            }
        }

        List<Integer> listForNotPrimeNumbers = new ArrayList<>();
        for (int i = 2; i < arrayNumber.length ; i++) {
            if(arrayNumber[i]) {
                listForNotPrimeNumbers.add(i);
            }
        }
        return listForNotPrimeNumbers;
    }
}
