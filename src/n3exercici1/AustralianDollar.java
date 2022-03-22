package n3exercici1;

public class AustralianDollar implements CurrencyConverter {
	
	private double convertingValue = 1.3515501;
	private String symbol = "AUD";

	@Override
	public double getConvertingValue() {
		
		return convertingValue;
		
	}

	public void setConvertingValue(double convertingValue) {
		
		this.convertingValue = convertingValue;
		
	}

	@Override
	public String getCurrencySymbol() {
		
		return this.symbol;
		
	}	
	
}
