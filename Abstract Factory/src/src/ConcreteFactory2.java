package src;

public class ConcreteFactory2 extends AbstractFactory{

	@Override
	public AbstractProductA crearProductoA() {
		return new ProductoA2();
	}

	@Override
	public AbstractProductB crearProductoB() {
		return new ProductoB2();
	}

}
