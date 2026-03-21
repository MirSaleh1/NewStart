package l03.variables.homework;

public class Task02EasyCartTotals {

    public static void main(String[] args) {

        int intProduct1=15;
        double doubleProduct1=15.5;

        int intProduct2=12;
        double doubleProduct2=12.4;

        int intProduct3=17;
        double doubleProduct3=17.1;

        double subTotal=intProduct1*doubleProduct1;
        double subTotalForSecondProduct=intProduct2*doubleProduct2;
        double subTotalForthirdProduct=intProduct3*doubleProduct3;


        double deliveryFee=5.45;
        double platformFee=0.99;

        double total=subTotal+subTotalForthirdProduct+subTotalForthirdProduct
                +deliveryFee+platformFee;

        double coupon=(double) total*25/100;
        total-=coupon;

        System.out.println("our total cost: "+total);
    }
}
