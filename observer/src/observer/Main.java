package observer;

public class Main {

	
	public static void main(String[] args) {
		
		
		Observable obs = new Observable();
		
		IncrementaContador inc = new IncrementaContador();
		AgregarALista alista = new AgregarALista();
		Imprime imp = new Imprime();
		
		obs.registrarObservador(inc);
		obs.registrarObservador(alista);
		obs.registrarObservador(imp);
	
		obs.notificarATodos(new Evento1());
		obs.notificarATodos(new Evento2());	
		obs.notificarATodos(new Evento1());
		obs.notificarATodos(new Evento2());
		obs.notificarATodos(new Evento1());
		obs.notificarATodos(new Evento2());
	
		System.out.println(inc.getEntero());
		System.out.println(alista.getLista());
		
		
		
	}
}
