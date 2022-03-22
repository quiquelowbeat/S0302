package n3exercici1;

public class Yen implements CurrencyConverter {

	private double convertingValue = 119.49542;
	private String symbol = "¥";
	
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
