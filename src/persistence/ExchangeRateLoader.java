package persistence;

import java.util.ArrayList;
import model.Currency;
import model.ExchangeRate;

public class ExchangeRateLoader {
    ArrayList<String> currency;
    ArrayList<Double> rate;
    
    public ExchangeRate load(Currency from, Currency to) {
        setExchangeRate();
        return new ExchangeRate(from,to,calculateRate(from,to));
    }

    private void setExchangeRate() {
        addCurrency();
        addRate();
    }

    private void addCurrency() {
        currency = new ArrayList<>();
        currency.add("EUR");
        currency.add("GBP");
        currency.add("JPY");
        currency.add("USD");
    }

    private void addRate() {
        rate = new ArrayList<>();
        rate.add(1.0);
        rate.add(0.76391);
        rate.add(135.86957);
        rate.add(1.15650);
        
    }

    public double calculateRate(Currency from, Currency to) {
        return (1/rate.get(currency.indexOf(from.getCode()))) * rate.get(currency.indexOf(to.getCode()));
    }
    
}
