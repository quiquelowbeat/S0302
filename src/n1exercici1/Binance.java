package n1exercici1;

public class Binance extends Exchange {

	public Binance(BtcBroker broker) {
		
		this.broker = broker;
		this.broker.addNewSuscriber(this);
		
	}

	@Override
	public void update() {
		
		System.out.println("Binance -- BTC price: " + broker.getBtcPrice() + "$ -- Trend: " + broker.getTrend() + " -- Action: " + broker.getTakeAction());
		
	}

}
