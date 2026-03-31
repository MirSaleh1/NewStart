package task;

import java.util.Scanner;

public class Task4PP {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        boolean polindrome=true;
        String input= sc.nextLine();
       for (int i=0 ; i<input.length();i++){
           if (input.charAt(i)!=input.charAt(input.length()-1-i))polindrome=false;
       }
       if (polindrome==true){
           System.out.println("is polindrome");
       }else{
           System.out.println("no");
       }
    }
}
