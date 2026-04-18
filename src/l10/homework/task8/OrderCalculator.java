package l10.homework.task8;

public class OrderCalculator {
    private DiscountPolicy dp;

    public OrderCalculator(DiscountPolicy dp) {
        this.dp = dp;
    }
    public double discount(int amount){
      return   dp.apply(amount);
    }
}
