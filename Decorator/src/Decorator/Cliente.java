package Decorator;

public interface Cliente {
	
	public void comprar(int monto);
		
	public void pagarVencimiento(int monto);

	public int getSaldo();

	public int getPuntosAcumulados();

	public void sumarPuntos(int puntosAcumulados);

}
