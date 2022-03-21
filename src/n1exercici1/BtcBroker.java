package n1exercici1;

import java.util.ArrayList;

public class BtcBroker {
	
	ArrayList<Exchange> exchangeList = new ArrayList<Exchange>();

	private double btcPrice;
	private String trend;
	private String takeAction;
	

	public double getBtcPrice() {
		
		return btcPrice;
		
	}

	public void setBtcPrice(double btcPrice) {
		
		this.btcPrice = btcPrice;
		
	}
	
	public String getTrend() {
		
		return trend;
		
	}

	public void setTrend(String trend) {
		
		this.trend = trend;
		
	}
	
	public String getTakeAction() {
		
		return takeAction;
		
	}
	
	public void setTakeAction(String takeAction) {
		
		this.takeAction = takeAction;
		
	}
		
	public void addNewSuscriber(Exchange exchange) {
		
		exchangeList.add(exchange);
		
	}
	
	public void notifyAllExchanges() {
		
		exchangeList.forEach(exchange -> exchange.update());
		
	}

}
