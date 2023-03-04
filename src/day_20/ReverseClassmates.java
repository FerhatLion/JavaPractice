package day_20;

public class ReverseClassmates {


    public static void main(String[] args) {

        String [] classmates= {"Ali One", "Veli Two", "Ahmet Three", "Mehmet Four","Mustafa Five",
                "Selim Six", "Necati Seven", "Ridvan Eight", "Necla Nine", "Meral Ten" };

        for (String classmate:classmates
             ) {
            String reverseClassmate="";
            for (int i = classmate.length()-1; i >=0 ; i--) {
                reverseClassmate += classmate.charAt(i);
            }
            System.out.println(reverseClassmate);
        }


    }

}
