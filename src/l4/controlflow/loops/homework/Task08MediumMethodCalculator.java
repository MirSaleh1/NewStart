package l4.controlflow.loops.homework;

import java.util.Scanner;

public class Task08MediumMethodCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("incude first number:");
            int firstnumber = sc.nextInt();
            System.out.println("incude second number:");
            int secondnumber = sc.nextInt();
            menu();
            System.out.println("incude operation:");
            sc.nextLine();
            String operator = sc.nextLine();
            int result=canculate(operator,firstnumber,secondnumber);

            if (result==0) break;
            else if (result==-1) continue;
            else {
                print(result);
            }
        }
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int mul(int a, int b) {
        return a * b;
    }

    public static int div(int a, int b) {
        return a / b;
    }

    public static void menu() {
        System.out.println("+. Add");
        System.out.println("-. Sub");
        System.out.println("*. Mul");
        System.out.println("/. Div");
        System.out.println("?.Exiting");

    }

    public static void print(int a) {
        System.out.println(a);
    }

    public static int canculate(String operator, int firstnumber, int secondnumber) {

        int result = switch (operator) {
            case "+" -> add(firstnumber, secondnumber);
            case "-" -> sub(firstnumber, secondnumber);
            case "*" -> mul(firstnumber, secondnumber);
            case "/" -> div(firstnumber, secondnumber);
            case "?" -> {
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
}