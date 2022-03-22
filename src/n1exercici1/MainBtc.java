package n1exercici1;

public class MainBtc {
	
	static BtcBroker btc_broker = new BtcBroker();
	
	public static void main(String[] args) { // PATRÓN OBSERVER
		
		new Coinbase(btc_broker);
		new Binance(btc_broker);
		new Kraken(btc_broker);
		
		sendNotification(43500, "Bullish", "HODL");
		sendNotification(39654, "Bearish", "Buy MORE");
		sendNotification(100000, "ULTRA BULLISH", "TO THE MOON - LAMBOOO");
	
	}
	
	public static void sendNotification(int btcPrice, String trend, String takeAction) {
		
		System.out.println("New price incoming...\n");
		btc_broker.setBtcPrice(btcPrice);
		btc_broker.setTrend(trend);
		btc_broker.setTakeAction(takeAction);
		btc_broker.notifyAllExchanges();
		System.out.println("\n");
		
	}

}
