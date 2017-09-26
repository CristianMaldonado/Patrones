package src;

public class Main {

	public static void main(String[] args) {

		AbstractFactory factory1 = new ConcreteFactory1();
		AbstractFactory factory2 = new ConcreteFactory2();
		
		factory1.crearProductoA().soy();
		factory1.crearProductoB().soy();
		factory2.crearProductoA().soy();
		factory2.crearProductoB().soy();
		
		
		
	}

}
