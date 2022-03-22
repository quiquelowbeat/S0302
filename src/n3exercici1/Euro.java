package n3exercici1;

public class Euro implements CurrencyConverter {
	
	private double convertingValue = 0.90784681;
	private String symbol = "€";
	
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
