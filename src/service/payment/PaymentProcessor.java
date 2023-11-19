package service.payment;

public interface PaymentProcessor {
    void deductFromOrder(double amount, String userCurrency, double coffeeAmount);
}
