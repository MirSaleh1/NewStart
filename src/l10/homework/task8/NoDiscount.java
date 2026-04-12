package l10.homework.task8;

public class NoDiscount implements DiscountPolicy{
    @Override
    public double apply(double amount) {
        return amount;
    }
}
