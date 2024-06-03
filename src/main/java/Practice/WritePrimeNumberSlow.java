package Practice;

import java.util.ArrayList;
import java.util.List;

public class WritePrimeNumberSlow {
    public List<Integer> getSearchedNumber(){
        List<Integer> searchedNumbers = new ArrayList<>();
        searchedNumbers.add(2);

        for (int i = 3; searchedNumbers.size() < 10; i += 2){
            if(getAnswer(i, searchedNumbers)){
                searchedNumbers.add(i);
            }
        }
        return searchedNumbers;
    }

    public boolean getAnswer(int countNumber, List<Integer> primeNumbers) {
        double SQRTNumber = Math.sqrt(countNumber);

        for(int selectNumber : primeNumbers){
            if(selectNumber > SQRTNumber){
                return true;
            }

            if(countNumber % selectNumber == 0){
                return false;
            }
        }
        return true;
    }
}
