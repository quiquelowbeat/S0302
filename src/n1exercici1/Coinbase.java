package n1exercici1;

public class Coinbase extends Exchange {

	public Coinbase(BtcBroker broker) {
		
		this.broker = broker;
		this.broker.addNewSuscriber(this);
		
	}
	
	@Override
	public void update() {
		
		System.out.println("Coinbase -- BTC price: " + broker.getBtcPrice() + "$ -- Trend: " + broker.getTrend() + " -- Action: " + broker.getTakeAction());
		
	}

}
