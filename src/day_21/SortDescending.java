package day_21;

import java.util.Arrays;

public class SortDescending {

    public static void main(String[] args) {


        int[] numbers = {3, 5, 6, 1, 2, 8, 0, 7, 9};

        Arrays.sort(numbers);

        for (int i = numbers.length - 1; i >= 0; i--) {

            System.out.print(numbers[i]);

        }


    }


}
