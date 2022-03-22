package n3exercici1;

public class Prices {
	
	private double[] prices = {567.54, 345.67, 67798, 234.12};
	private CurrencyConverter currency;
	
	public Prices(CurrencyConverter currency) {
		
		this.currency = currency;
		
	}
	
	public void showRegularPrices() {
		
		for(double p: prices) {
			
			System.out.println(p + "$");
			
		}
		
		System.out.println("\n");
		
	}
	
	public void showConvertedPrices() {
		
		for(double p: prices) {
			
			System.out.println((p * currency.getConvertingValue()) + currency.getCurrencySymbol().toString());
			
		}
		
		System.out.println("\n");
		
	}
	
}
