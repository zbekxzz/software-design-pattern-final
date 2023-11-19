package service.payment;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CurrencyAdapter implements PaymentProcessor {
    private CurrencyConverter currencyConverter;

    public CurrencyAdapter(CurrencyConverter currencyConverter) {
        this.currencyConverter = currencyConverter;
    }
    @Override
    public void deductFromOrder(double userPayment, String userCurrency, double coffeeAmount) {
        double paymentInEuro = currencyConverter.convertToEuro(userPayment, userCurrency);
        BigDecimal bd = new BigDecimal(paymentInEuro - coffeeAmount);
        double change = bd.setScale(2, RoundingMode.HALF_UP).doubleValue();
        System.out.println("Change: " + change + " euros");
    }
}
