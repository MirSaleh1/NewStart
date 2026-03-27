package l05.arrays.strings.homewor;

import java.util.Scanner;

public class Task12HardStudentAnalyticsConsole {
    static Scanner sc =new Scanner(System.in);
    public static void main(String[] args) {

        boolean done=true;
        String[] studentNames = {"Ali", "Aysel", "Murad"};
        int[][] grades = {
                {85, 90, 78},
                {92, 88, 95},
                {70, 65, 80}
        };
        while (done){
            printMenu();
            int choice= sc.nextInt();
            if (choice==0){
                    System.out.println("Proqramdan çıxılır...");
                    break;
            }
            switch (choice) {
                case 1 -> showAllAverages(studentNames, grades);
                case 2 -> showTopStudent(studentNames, grades);
                case 3 -> searchStudent( studentNames, grades);
                default -> System.out.println("Səhv seçim! Yenidən yoxlayın.");
            }
        }
    }

    private static void searchStudent( String[] studentNames, int[][] grades) {
        sc.nextLine();
        String name= sc.nextLine();
        for (int i = 0; i < grades.length; i++) {
            if (studentNames[i].equalsIgnoreCase(name)) {
                int temp = 0;
                for (int j = 0; j < grades[i].length; j++) {
                    temp += grades[i][j];

                }
                System.out.println(studentNames[i]+" "+temp);
                return;
            }

        }
        System.out.println("Dosent exist");
    }

    private static void showTopStudent(String[] studentNames, int[][] grades) {
        int max=-1;int count=-1;
        for (int i = 0; i < grades.length; i++) {
            int temp=0;
            for (int j = 0; j < grades[i].length; j++) {
                temp+=grades[i][j];

            } if (max<temp){
                max=temp;
                count=i;
            }
        }
        if (count==-1){
            searchStudent(studentNames,grades);
        }
        System.out.println(studentNames[count]+" "+ max);
    }

    private static void showAllAverages(String[] studentNames, int[][] grades) {
        for (int i = 0; i < grades.length; i++) {
            int temp=0;
            for (int j = 0; j < grades[i].length; j++) {
                temp+=grades[i][j];
            }
            System.out.println(studentNames[i]+" "+(double)temp/grades[i].length);
        }
    }

    public static void printMenu() {
        System.out.println("\n--- MENU ---");
        System.out.println("1 - Bütün tələbələr və ortalamalar");
        System.out.println("2 - Ən yüksək nəticəli tələbə");
        System.out.println("3 - Ada görə axtarış");
        System.out.println("0 - Çıxış");
    }
}
