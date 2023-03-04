package day_21;

public class CommonNumber {

    public static void main(String[] args) {


        int[] arrayf = {1, 2, 3, 4, 5};
        int[] arrayf2 = {4, 5, 6, 7, 8};

        String commons = "";
        for (int each : arrayf) {
            for (int single : arrayf2)
                if (each == single)
                    commons += each + " ";

        }

        System.out.println(commons);
    }


}
