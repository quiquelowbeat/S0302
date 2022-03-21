package n2exercici1;

public class ShoeShop {
	
	void startPayment(PaymentCallback callback) {
		
		System.out.println("Procesando el pago...");
		
		callback.paymentProcess();
		
	}

}
