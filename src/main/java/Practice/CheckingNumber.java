package Practice;

import java.util.List;

public class CheckingNumber {
    public void getCheckingNumber(int numberEntered){
        WritePrimeNumberFast writePrimeNumberFast = new WritePrimeNumberFast();

        List<Integer> primesNumber1 = writePrimeNumberFast.getSearchedNumber(100);

        for(int i : primesNumber1){
            if(numberEntered == i){
                System.out.print("This number is prime!");
                break;
            }
        }

    }
}
