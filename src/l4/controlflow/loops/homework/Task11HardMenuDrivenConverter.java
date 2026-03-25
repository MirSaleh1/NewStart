package l4.controlflow.loops.homework;

import java.util.Scanner;


public class Task11HardMenuDrivenConverter {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        boolean loop=true;

        while (loop) {
            menu();
            int choice = sc.nextInt();
           double result= canculate(choice);
           if(result==0.0) break;
           else System.out.println(result);
        }
    }

    public static void menu() {
        System.out.println("--- ÇEVİRİCİ MENYU ---");
        System.out.println("1. Celsius -> Fahrenheit");
        System.out.println("2. Kilometer -> Mile");
        System.out.println("3. Manat -> USD");
        System.out.println("0. Çıxış");
        System.out.print("Seçiminiz: ");
    }

    public static double canculate(int num) {

        double result = switch (num) {
            case 1 -> {
                double cel = sc.nextDouble();
               yield  celsiusToFahrenheit(cel);
            }
            case 2 -> {
                double km = sc.nextDouble();
               yield  toMile(km);
            }
            case 3 -> {
                double azn = sc.nextDouble();
               yield  toUsd(azn);
            }
            case 4 -> {
                System.out.println("Exiting...");
                yield 0;
            }
            default -> {
                System.out.println("Invalid operation");
                yield -1;
            }
        };
        return result;
    }

    public static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    public static double toMile(double km) {
        return km * 0.621371;
    }

    public static double toUsd(double azn) {
        return azn / 1.70;
    }
}
