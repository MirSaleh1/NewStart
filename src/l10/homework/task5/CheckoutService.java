package l10.homework.task5;

public class CheckoutService {

    public void processOrder(double amount, PaymentGateway paymentGateway) {
        boolean isSuccess = paymentGateway.charge(amount);

        if (isSuccess) {
            System.out.println("nice");
        } else {
            System.out.println("Eror");
        }
    }
}
