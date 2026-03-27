package l4.controlflow.loops.homework;

import java.util.Scanner;

public class Task05MediumATMDecision {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        double accountBalance= sc.nextDouble();
        double withdrawalAmount;
        System.out.println("how much do you want to take");
        withdrawalAmount= sc.nextDouble();

        if (accountBalance<=0){
            System.out.println("you don't have money");
        }else if (withdrawalAmount<=0){
            System.out.println("Invalid");
        } else if (withdrawalAmount>accountBalance) {
            System.out.println("winthdraw can't be more than amount");
        }else if(withdrawalAmount>500){
            System.out.println("OTP ");
        }
        else {
            System.out.println("done");
        }
    }
}
