package service.payment;

public class CurrencyAdapter implements PaymentProcessor {
    private CurrencyConverter currencyConverter;

    public CurrencyAdapter(CurrencyConverter currencyConverter) {
        this.currencyConverter = currencyConverter;
    }
    @Override
    public void deductFromOrder(double userPayment, String userCurrency, double coffeeAmount) {
        double paymentInEuro = currencyConverter.convertToEuro(userPayment, userCurrency);
        double change = paymentInEuro - coffeeAmount;
        System.out.println("Change: " + change + " euros");
    }
}
