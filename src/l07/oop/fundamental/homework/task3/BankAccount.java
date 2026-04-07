package l07.oop.fundamental.homework.task3;

public class BankAccount {
    private String owner;
    private double balance;

    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }
    public void deposit(double amount){
        if (amount<=0){
            System.out.println("not posibly");
            return;
        }
        balance+=amount;
    }
    public void withdraw(double amount){
        if (amount<0 || balance<amount){
            System.out.println("you couldn't");
            return;
        }balance-=amount;
    }
    public void printSummary(){
        System.out.println(owner+" "+balance);
    }
}
