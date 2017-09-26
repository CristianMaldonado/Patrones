package src;

public class CreadorConcreto1 extends Creador{

	@Override
	public Producto factoryMethod() {
		return new ProductoConcreto1();
	}

}
