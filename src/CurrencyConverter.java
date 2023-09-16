import java.util.HashMap;
import java.util.Map;

class CurrencyConverter {
    private Map<String, Currency> currencies;

    public CurrencyConverter() {
        currencies = new HashMap<>();
        currencies.put("USD", new Currency("USD", 1.0));
        currencies.put("EUR", new Currency("EUR", 0.93));
        currencies.put("GBP", new Currency("GBP", 0.8));
        currencies.put("JPY", new Currency("JPY", 109.38));
        currencies.put("AUD", new Currency("AUD", 1.35));
        currencies.put("CAD", new Currency("CAD", 1.26));
        currencies.put("CHF", new Currency("CHF", 0.92));
        currencies.put("CNY", new Currency("CNY", 6.46));
        currencies.put("INR", new Currency("INR", 73.63));
        currencies.put("SGD", new Currency("SGD", 1.34));
        currencies.put("NZD", new Currency("NZD", 1.43));
    }

    public double convert(double amount, String fromCurrency, String toCurrency) {
        Currency sourceCurrency = currencies.get(fromCurrency);
        Currency targetCurrency = currencies.get(toCurrency);

        if (sourceCurrency == null || targetCurrency == null) {
            System.out.println("Invalid currency.");
            return -1.0;
        }

        double convertedAmount = amount * (targetCurrency.getExchangeRate() / sourceCurrency.getExchangeRate());
        return convertedAmount;
    }
}
