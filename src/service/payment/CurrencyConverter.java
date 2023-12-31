package service.payment;

import java.util.HashMap;
import java.util.Map;

public class CurrencyConverter {
    private final Map<String, Double> exchangeRates;

    public CurrencyConverter() {
        exchangeRates = new HashMap<>();
        exchangeRates.put("euro", 1.0);
        exchangeRates.put("usd", 1.09);
        exchangeRates.put("kzt", 501.14);
        exchangeRates.put("rub", 96.77);
    }

    public double convertToEuro(double amount, String currency) {
        if (!exchangeRates.containsKey(currency.toLowerCase())) {
            throw new UnsupportedOperationException("Unsupported currency: " + currency);
        }
        return amount / exchangeRates.get(currency.toLowerCase());
    }
}
