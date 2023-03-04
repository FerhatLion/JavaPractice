package day_21;

import java.util.Arrays;

public class Merge {


    public static void main(String[] args) {

        int[] arrayf1={30,10,20};
        int[] arrayf2={15,40,25,35};
        int[] arrayf3={8,9,17,5,4,1};

        int[] merge= new int[arrayf1.length+arrayf2.length+arrayf3.length];
        int j=0;

        for(int each1:arrayf1) {
            merge[j++] = each1;
        }
        for (int each2:arrayf2){
            merge[j++]=each2;
        }
        for(int each3:arrayf3){
            merge[j++]=each3;
        }

        System.out.println(Arrays.toString(merge));



    }
}
