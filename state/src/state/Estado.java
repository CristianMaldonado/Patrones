package state;

public interface Estado {
	public void come(Persona persona);
	public void duerme(Persona persona);
	public void trabaja(Persona persona);
}
