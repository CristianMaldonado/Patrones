package src;

public class Main {

	public static void main(String[] args) {
		
		Creador factory = new CreadorConcreto1();
		Creador factory2 = new CreadorConcreto2();
		
		factory.factoryMethod().meLlamo();
		factory2.factoryMethod().meLlamo();
		
		
		
	}

}
