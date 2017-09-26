package src;

public class ConcreteFactory1 extends AbstractFactory{

	@Override
	public AbstractProductA crearProductoA() {
		return new ProductoA1();
	}

	@Override
	public AbstractProductB crearProductoB() {
		return new ProductoB1();
	}

}
