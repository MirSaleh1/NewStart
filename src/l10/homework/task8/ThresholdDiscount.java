package l10.homework.task8;

public class ThresholdDiscount implements DiscountPolicy{
    @Override
    public double apply(double amount) {
        if (amount>100){
            return amount-(amount*20)/100;
        }
        return amount;
    }
}
