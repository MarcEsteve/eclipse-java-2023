
public interface Vehiculo {
	//Atributos
	public static final float g = 9.8f;
//	protected float velocidad;
//	protected int asientos;
//	protected int ruedas;
	//Métodos
	public abstract void parar();
	public abstract void acelerar();
	public abstract void desacelerar();
	public abstract void girarIzquierda();
	public abstract void girarDerecha();
}
