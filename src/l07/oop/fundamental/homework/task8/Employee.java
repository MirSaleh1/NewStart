package l07.oop.fundamental.homework.task8;

public class Employee {
    private String name;
    private double baseSalary;
    private double bonus;

    public Employee() {}

    public Employee(String name, double baseSalary, double bonus) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    public String getName() {
        return name;
    }

    public double calculateNetSalary(double taxRate){
        if (baseSalary==0.0)throw new RuntimeException();
        if (taxRate < 0 || taxRate > 1) throw new RuntimeException();
        double totalGross=baseSalary+bonus;
        double netSalary = totalGross * (1 - taxRate);
        return netSalary;
    }
    public static void printReport(Employee person, double tax) {
        System.out.println("person: " + person.getName() + " | Ammout: " + person.calculateNetSalary(tax));
    }

}
