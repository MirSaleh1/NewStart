package l10.homework.task5;

public class CardGateway implements PaymentGateway{
    @Override
    public boolean charge(double amount) {
        return false;
    }
}
