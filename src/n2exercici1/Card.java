package n2exercici1;

public class Card implements PaymentCallback {

	@Override
	public void paymentProcess() {
		
		System.out.println("Pago realizado correctamente con tarjeta.");
		
	}

}
