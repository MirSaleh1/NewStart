package task;

import java.util.Scanner;

public class TaskApp1 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String intput=sc.nextLine();
        String output=reverse(intput);
        System.out.println(output);
    }
    public static String reverse(String a){
        //String result="";
        StringBuilder rev=new StringBuilder();
        if (a.strip().equalsIgnoreCase(""))return "doesnt exsist";
        for (int i = a.length()-1; i >=0 ; i--) {
            rev.append(a.charAt(i));
        }
        return String.valueOf(rev);
    }
}
