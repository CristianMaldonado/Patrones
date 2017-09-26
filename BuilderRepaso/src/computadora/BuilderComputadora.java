package computadora;

public class BuilderComputadora {

	private Computadora computadora;

	public Computadora getComputadora() {
		return computadora;
	}

	public void setComputadora(Computadora computadora) {
		this.computadora = computadora;
	}
	
	public BuilderComputadora() {
		this.nuevaComputadora();
	}
	
	public void nuevaComputadora() {
		this.computadora = new Computadora();
	}
	
	
	public BuilderComputadora setCpu(Cpu cpu) {
		this.computadora.setCpu(cpu);
		return this;
	}
	
	public BuilderComputadora setDisco(Disco disco) {
		this.computadora.setDisco(disco);
		return this;
	}
	
	public BuilderComputadora setFuente(Fuente fuente) {
		this.computadora.setFuente(fuente);
		return this;
	}
	
	public BuilderComputadora setMemoria(Memoria memoria) {
		this.computadora.setMemoria(memoria);
		return this;
	}
	
	public BuilderComputadora setMother(Mother mother) {
		this.computadora.setMother(mother);
		return this;
	}
	
	public BuilderComputadora setMouse(Mouse mouse) {
		this.computadora.setMouse(mouse);
		return this;
	}
	
	public BuilderComputadora setParlante(Parlante parlante) {
		this.computadora.setParlante(parlante);
		return this;
	}
	
	public BuilderComputadora setTeclado(Teclado teclado) {
		this.computadora.setTeclado(teclado);
		return this;
	}
	
	public BuilderComputadora setMonitor(Monitor monitor) {
		this.computadora.setMonitor(monitor);
		return this;
	}
	
	
	public Computadora build() {
		return this.computadora;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
