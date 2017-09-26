package src;

public class CreadorConcreto2 extends Creador{

	@Override
	public Producto factoryMethod() {
		return new ProductoConcreto2();
	}

}
