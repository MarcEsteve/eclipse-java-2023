
public abstract class Persona {
	//Atributos
	protected int id;
	protected int edad;
	protected int telefono;
	//Métodos
	public void mostrarInfo() {}
	//Método abstracto
	public abstract void mostrarID();
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
}
