package l10.homework.task8;

public class PercentDiscount implements DiscountPolicy{
    @Override
    public double apply(double amount) {
        double amoun10Present=(amount*10)/100;
        return amount-amoun10Present;
    }
}
