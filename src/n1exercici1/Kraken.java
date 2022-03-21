package n1exercici1;

public class Kraken extends Exchange {

	public Kraken(BtcBroker broker) {
		
		this.broker = broker;
		this.broker.addNewSuscriber(this);
		
	}
	
	@Override
	public void update() {
		
		System.out.println("Kraken -- BTC price: " + broker.getBtcPrice() + "$ -- Trend: " + broker.getTrend() + " -- Action: " + broker.getTakeAction());
		
	}

}
