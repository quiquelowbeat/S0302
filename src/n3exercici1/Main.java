package n3exercici1;

public class Main {
	
	public static void main(String[] args) { // PATRÓN INYECCIÓN DE DEPENDENCIAS
		
		CurrencySimpleFactory currency = new CurrencySimpleFactory();
		
		Prices p1 = new Prices(currency.createCurrency(CurrencySimpleFactory.CurrencyType.EURO));
		Prices p2 = new Prices(currency.createCurrency(CurrencySimpleFactory.CurrencyType.AUSTRALIANDOLLAR));
		Prices p3 = new Prices(currency.createCurrency(CurrencySimpleFactory.CurrencyType.YEN));
		
		p1.showRegularPrices();
		
		p1.showConvertedPrices();
		p2.showConvertedPrices();
		p3.showConvertedPrices();
		
	}

}
