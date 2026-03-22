package l03.variables.homework;

import java.math.BigDecimal;

public class Task05MediumInvoicePrecision {

    public static void main(String[] args) {

        double invoice1=19.99;
        double invoice2=5.75;
        double invoice3=2.40;
        double invoiceSum=invoice1+invoice2+invoice3;

        BigDecimal decimal1=new BigDecimal("19.99");
        BigDecimal decimal2=new BigDecimal("5.75");
        BigDecimal decimal3=new BigDecimal("2.40");
        BigDecimal decimalSum=decimal1.add(decimal2).add(decimal3);
        BigDecimal toDouble=new BigDecimal(Double.toString(invoiceSum));
        System.out.println(decimalSum.subtract(toDouble));


    }
}
