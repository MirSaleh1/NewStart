package l4.controlflow.loops.homework;

import java.util.Scanner;

public class Task06MediumWeekdayConsole {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        boolean check=true;
        String include="";
        int dayCounter=0;
        while (check){

            if (include.equalsIgnoreCase("Exit"))break;;
            include= sc.nextLine();
            switch (include){
                case "1" -> System.out.println("Monday");
                case "2" -> System.out.println("Tuesday");
                case "3" -> System.out.println("Wednesday");
                case "4"-> System.out.println("Thursday");
                case "5" -> System.out.println("Friday");
                case "6"-> System.out.println("Saturday");
                case "7"-> System.out.println("Sunday");
                default -> {
                    System.out.println("Invalid day");
                    continue;
                }
            }
            dayCounter++;
        }
    }
}
