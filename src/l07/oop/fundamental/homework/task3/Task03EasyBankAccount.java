package l07.oop.fundamental.homework.task3;

public class Task03EasyBankAccount {

    public static void main(String[] args) {

        BankAccount user=new BankAccount("Saleh",123);
        user.deposit(2.75);
        user.deposit(15.5);
        user.printSummary();
    }
}
