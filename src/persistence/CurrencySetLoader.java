package persistence;

import model.Currency;
import model.CurrencySet;

public class CurrencySetLoader {
    private final CurrencySet currencySet;
    
    public CurrencySetLoader() {
        currencySet = new CurrencySet();
    }
    
    public CurrencySet load() {
        currencySet.add(new Currency("EUR","Euro","€"));
        currencySet.add(new Currency("GBP", "Great Britain Pound", "£"));
        currencySet.add(new Currency("JPY", "Japanese Yen", "¥"));
        currencySet.add(new Currency("USD", "United States Dollar", "$"));
        
        return currencySet;
    }
}
