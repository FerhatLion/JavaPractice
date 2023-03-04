package day_21;

import java.sql.SQLOutput;

public class Palindrom {

    public static void main(String[] args) {

    String[] palindrom = {"anna", "level", "Java"};

    int count=0;

    for(String words:palindrom){

        String sdrow="";

        for (int i=words.length()-1; i>=0; i--) {
            sdrow+=words.charAt(i);

        }

        if(words.equalsIgnoreCase(sdrow))
            count++;


    }
        System.out.println(count);




    }


}
