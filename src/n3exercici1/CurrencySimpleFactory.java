package n3exercici1;

public class CurrencySimpleFactory {
	
	public enum CurrencyType {EURO, AUSTRALIANDOLLAR, YEN};
	
	public CurrencyConverter createCurrency(CurrencyType type) {
		
		CurrencyConverter currency = null;
		
			if(type == CurrencyType.EURO) {
				
				return new Euro();
				
			} else if(type == CurrencyType.AUSTRALIANDOLLAR) {
				
				return new AustralianDollar();
				
			} else if(type == CurrencyType.YEN) {
				
				return new Yen();
				
			}
		
		return currency;
	}

}
