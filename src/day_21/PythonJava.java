package day_21;


import java.sql.SQLOutput;

public class PythonJava {

    public static void main(String[] args) {

        String sentence = "python java java java python java";

        String[] words = sentence.split(" ");

        int java = 0;
        int python = 0;

        for (String each : words
        ) {
            if (each.equals("java"))
                java++;
            else if (each.equals("python"))
                python++;

        }

        System.out.println(python + " python and " + java + " java");
    }


}
