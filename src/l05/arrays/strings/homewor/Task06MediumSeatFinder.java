package l05.arrays.strings.homewor;

import java.util.Scanner;

public class Task06MediumSeatFinder {

    public static void main(String[] args) {

        String[][] seats = {
                {"A1", "A2", "A3"},
                {"B1", "B2", "B3"},
                {"C1", "C2", "C3"}
        };
        Scanner input = new Scanner(System.in);
        String searchSeat = input.nextLine();
        int column=-1;
        int row=-1;
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                if (searchSeat.equalsIgnoreCase(seats[i][j])){
                    column=j;
                    row=i;
                }
            }
        }   if (column==-1 && row==-1){
            System.out.println("Doesnt exist");
        }else {
            System.out.printf("your seat in colum %d ,row %d",column+1,row+1);
        }
    }
}
