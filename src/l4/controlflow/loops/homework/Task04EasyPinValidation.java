package l4.controlflow.loops.homework;

import java.util.Scanner;

public class Task04EasyPinValidation {

    public static void main(String[] args) {

        String pinCode="12345678";
        int attemptCounter=0;
       boolean correctPin;
        Scanner sc=new Scanner(System.in);
        do {
            System.out.println("inculude pin:");
            String userIncludePin= sc.nextLine();
            correctPin=userIncludePin.equals(pinCode);
            if (correctPin) break;
            attemptCounter++;
        }while (attemptCounter<3);

        if (!correctPin){
            System.out.println("Account blocked");
        }else {
            System.out.println("Account correct");
        }
    }
}
