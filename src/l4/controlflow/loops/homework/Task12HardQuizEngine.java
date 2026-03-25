package l4.controlflow.loops.homework;

import java.util.Scanner;

public class Task12HardQuizEngine {

    static   Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {

       boolean restart=true;
       while (restart){
           int score=0;
           if (askQuestion1()) score++;
           if (askQuestion2()) score++;
           if (askQuestion3()) score++;
           if (askQuestion4()) score++;
           if (askQuestion5()) score++;

           printFinalReport(score);

           System.out.print("\nYenidən başlamaq? (1-Hə / 0-Yox): ");
           int choice = sc.nextInt();
           restart = (choice == 1);
       }
    }
    private static void printFinalReport(int score) {
        if (score==5) System.out.println("A");
        else if(score>2) System.out.println("B");
        else if(score==2) System.out.println("C");
        else System.out.println("F");
    }
    public static boolean askQuestion1() {
        System.out.println("\nSual 1: Azərbaycanın paytaxtı haradır?");
        String answer = sc.next();
        return isCorrect(answer, "Baki");
    }

    public static boolean askQuestion2() {
        System.out.println("\nSual 2: 2 + 2 * 2 neçə edir?");
        String answer = sc.next();
        return isCorrect(answer, "6");
    }

    public static boolean askQuestion3() {
        System.out.println("\nSual 3: Java-da tam ədəd tipi hansıdır? (int/double)");
        String answer = sc.next();
        return isCorrect(answer, "int");
    }


    public static boolean askQuestion4() {
        System.out.println("\nSual 4: 'Break' komandası dövrü dayandırır? (He/Yox)");
        String answer = sc.next();
        return isCorrect(answer, "He");
    }
    public static boolean askQuestion5() {
        System.out.println("\nSual 5: java devolopersen? (He/Yox)");
        String answer = sc.next();
        return isCorrect(answer, "He");
    }
    public static boolean isCorrect(String userAnswer,String rightAnswer ){
        if(userAnswer.equalsIgnoreCase(rightAnswer))return true;
        return false;
    }
}