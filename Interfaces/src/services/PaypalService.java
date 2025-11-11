package src.services;

public class PaypalService implements OnlinePaymentService{
    private static final double PAYMENT_FEE_PERCENTAGE = 0.02;
    private static final double MONTHLY_INTEREST_RATE = 0.01;

    @Override
    public double paymentFee(double amount) {
        return amount * PAYMENT_FEE_PERCENTAGE;
    }

    @Override
    public double interest(double amount, int months) {
        return amount * MONTHLY_INTEREST_RATE * months;
    }
}
