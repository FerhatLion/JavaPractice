package day_20;

public class ArrayClassmates {

    public static void main(String[] args) {

    String [] classmates= {"Ali One", "Veli Two", "Ahmet Three", "Mehmet Four","Mustafa Five",
            "Selim Six", "Necati Seven", "Ridvan Eight", "Necla Nine", "Meral Ten" };

        for (String student:classmates
             ) {
            System.out.println(student.charAt(0) +"."+ student.charAt(student.indexOf(' ')+1));
        }
        /*
         create an array named classmates, and store 10 of your classmates' full names
            print the initials of each classmates in separate lines

         */


    }


}
