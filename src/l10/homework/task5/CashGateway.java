package l10.homework.task5;

public class CashGateway implements PaymentGateway{
    @Override
    public boolean charge(double amount) {
        return false;
    }
}
