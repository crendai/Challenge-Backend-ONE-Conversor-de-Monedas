public class CurrencyConverter {
    public static double convert(String fromCurrency, String toCurrency, double amount) {
        double rate = ExchangeRateAPI.getExchangeRate(fromCurrency, toCurrency);
        return amount * rate;
    }
}
