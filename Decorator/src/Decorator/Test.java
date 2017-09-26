package Decorator;

public class Test {

	public static void main(String[] args) {

		ClienteSafeShop fede = new ClienteSafeShop(100, new ClientePosta(70, 30));
		ClientePromocion cli = new ClientePromocion(150, 9, new ClienteSafeShop(200, new ClientePosta(50, 500)));
		
		System.out.println(fede.getSaldo());
		fede.comprar(10);
		cli.comprar(200);
		
		
		System.out.println(cli.getSaldo());
		System.out.println(cli.getPuntosAcumulados());

		System.out.println(fede.getSaldo());
		
	}

}
