package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WritePrimeNumberFast {

    public List<Integer> getSearchedNumber(int size) throws ArrayIndexOutOfBoundsException {
        boolean[] arrayNumber = new boolean[size];

        Arrays.fill(arrayNumber, true);
        arrayNumber[0] = false;
        arrayNumber[1] = false;

        for (int i = 2; i < arrayNumber.length; i++) {

            if (arrayNumber[i]) {
                for (int j = 2; i * j < arrayNumber.length; j++) {
                    arrayNumber[i * j] = false;
                }
            }
        }

        List<Integer> searchedNumbers = new ArrayList<>();
        for (int i = 2; i < arrayNumber.length; i++) {

            if (arrayNumber[i]) {
                searchedNumbers.add(i);
            }
        }
        return searchedNumbers;
    }
}
