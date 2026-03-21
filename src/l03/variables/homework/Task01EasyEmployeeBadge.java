package l03.variables.homework;

public class Task01EasyEmployeeBadge {

    public static void main(String[] args) {

        String name="Mir Saleh";
        int age= 5;
        String department="IT";
        int yearsOfService=5;
        boolean active=true;
        double hourlyRate=15.5;
        final String COMPANY="Az-Telecom";

        hourlyRate++;

        System.out.printf("%s\n" +
                "1-%s%n" +
                "2-%d%n" +
                "3-%s%n" +
                "4-%d%n" +
                "5-%b%n" +
                "6-%.2f",COMPANY,name,age,
                department,yearsOfService,active,hourlyRate);
    }
}
