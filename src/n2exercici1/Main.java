package n2exercici1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		ShoeShop shop = new ShoeShop();
		
		Scanner entrada = new Scanner(System.in);
		
		int menu = 0;
		
		do {
			System.out.println("Vamos a proceder a realizar el cobro de tus zapatos nuevos.");
			System.out.println("Por favor introduce el método de pago:"
					+ "\n1- Tarjeta"
					+ "\n2- Paypal"
					+ "\n3- Deuda bancaria"
					+ "\n4- Salir");
			
			menu = entrada.nextInt();
			
			switch(menu) {
			
				case 1: 
					
					shop.startPayment(new Card());
				
					break;
					
				case 2: 
					
					shop.startPayment(new Paypal());
					
					break;
					
				case 3:
					
					shop.startPayment(new BankDebt());
					
					break;
					
				case 4: 
					
					System.out.println("Bye.");
					break;
				
			}
			
			entrada.close();
			
		} while (menu > 4 || menu < 1);

	}

}
