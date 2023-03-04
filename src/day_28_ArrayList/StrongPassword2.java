package day_28_ArrayList;

public class StrongPassword2 {

    public static void main(String[] args) {

        String password= "";

        int countUpperCase = 0;
        int countLowerCase = 0;
        int countDigits = 0;
        int countSpecialChar = 0;

        for (int i = 0; i < password.length(); i++) {
            char each = password.charAt(i);

            if(Character.isUpperCase(each)) {
                countUpperCase++;
            }else if(Character.isLowerCase(each)){
                countLowerCase++;
            }else if (Character.isDigit(each)){
                countDigits++;
            }else{
                countSpecialChar++;
            }

        }

        System.out.println("countLowerCase = " + countLowerCase);
        System.out.println("countUpperCase = " + countUpperCase);
        System.out.println("countSpecialChar = " + countSpecialChar);
        System.out.println("countDigits = " + countDigits);


        boolean hasUpperCase = countUpperCase > 0;
        boolean hasLowerCase = countLowerCase > 0;
        boolean hasDigits = countDigits > 0;
        boolean hasSpecialChar = countSpecialChar >0;

        boolean StrongPassword =  password.length() >=0 && !password.contains(" ") && hasDigits && hasUpperCase && hasLowerCase && hasSpecialChar;
        System.out.println("StrongPassword = " + StrongPassword);


    }
    }