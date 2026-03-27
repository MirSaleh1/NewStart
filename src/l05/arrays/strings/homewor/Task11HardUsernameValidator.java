package l05.arrays.strings.homewor;

import java.util.Scanner;

public class Task11HardUsernameValidator {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        String report=" ";

        if (!Character.isLetter(input.charAt(0)))report+=" INVALID-firts char ";
        if(input.length()<6 || input.length()>20){
            report+=" INVALID-size ";
        }

            if (input.contains(" ")){
               report+=" iNVALID- simvol ";
        }
        for (int i = 0; i < input.length(); i++) {
            if (Character.isLetterOrDigit(input.charAt(i))|| input.charAt(i) == '_') continue;
            report+="Invalid simvol2";
        }
    }
}
