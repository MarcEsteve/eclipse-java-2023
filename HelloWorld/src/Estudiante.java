
public class Estudiante {
	//Constructores
	public Estudiante() {
		this.id=1;
		this.edad=36;
		this.telefono=654321987;
		this.numeroNotas=6;
		this.sumaNotas=36;
		this.notaMedia=sumaNotas/numeroNotas;
	}
	
	public Estudiante(int id) {
		this.id=id;
		this.edad=36;
		this.telefono=654321987;
		this.numeroNotas=6;
		this.sumaNotas=36;
		this.notaMedia=sumaNotas/numeroNotas;
	}
	public Estudiante(int id, int edad) {
		this.id=id;
		this.edad=edad;
		this.telefono=654321987;
		this.numeroNotas=6;
		this.sumaNotas=36;
		this.notaMedia=sumaNotas/numeroNotas;
	}
	public Estudiante(int id, int edad, int telefono) {
		this.id=id;
		this.edad=edad;
		this.telefono=telefono;
		this.numeroNotas=6;
		this.sumaNotas=36;
		this.notaMedia=sumaNotas/numeroNotas;
	}
	
	//Atributos
	private int id;
	private int edad;
	private int telefono;
	private int numeroNotas;
	private int sumaNotas;
	private float notaMedia;
	//Métodos
	public void mostrarInfo() {}
	public void agregarNuevaNote() {}
	public static Estudiante crearEstudiante() {
		return new Estudiante();
	}
	
	//Setters y getters
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
	public int getNumeroNotas() {
		return numeroNotas;
	}
	public void setNumeroNotas(int numeroNotas) {
		this.numeroNotas = numeroNotas;
	}
	public int getSumaNotas() {
		return sumaNotas;
	}
	public void setSumaNotas(int sumaNotas) {
		this.sumaNotas = sumaNotas;
	}
	public float getNotaMedia() {
		return notaMedia;
	}
	public void setNotaMedia(float notaMedia) {
		this.notaMedia = notaMedia;
	}
}
