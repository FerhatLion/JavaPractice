package day_21;

public class CountEvenOdd {

    public static void main(String[] args) {

        int[] numbers = {2, 44, 3, 56, 78, 23, 11, 45, 67, 88, 98};

        int freqEven = 0;
        int freqOdd = 0;
        for (int each : numbers) {
            if (each % 2 == 0)
                freqEven++;
            if (each % 2 != 0)
                freqOdd++;
        }
        System.out.println(freqEven);
        System.out.println(freqOdd);

    }


}


