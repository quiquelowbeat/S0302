package n2exercici1;

public class Paypal implements PaymentCallback {

	@Override
	public void paymentProcess() {
		
		System.out.println("Pago realizado correctamente con Paypal.");
		
	}

}
