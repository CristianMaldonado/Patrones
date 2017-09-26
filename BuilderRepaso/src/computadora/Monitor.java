package computadora;

public class Monitor {
	
	private String marca;
	private int pulgadas;
	
	public Monitor(String marca, int pulgadas) {
		this.setMarca(marca);
		this.setPulgadas(pulgadas);
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getPulgadas() {
		return pulgadas;
	}

	public void setPulgadas(int pulgadas) {
		this.pulgadas = pulgadas;
	}

}
