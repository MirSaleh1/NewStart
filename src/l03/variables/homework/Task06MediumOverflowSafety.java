package l03.variables.homework;

public class Task06MediumOverflowSafety {

    public static void main(String[] args) {

        int packAgeCounter1=Integer.MAX_VALUE-2;
        System.out.println(++packAgeCounter1);
        System.out.println(++packAgeCounter1);
        System.out.println(++packAgeCounter1);

        int packAgeCounter2=Integer.MAX_VALUE-2;
        packAgeCounter2=Math.addExact(packAgeCounter2,1);
        System.out.println(packAgeCounter2);
        packAgeCounter2=Math.addExact(packAgeCounter2,1);
        System.out.println(packAgeCounter2);
        packAgeCounter2=Math.addExact(packAgeCounter2,1);
        System.out.println(packAgeCounter2);

    }
}
