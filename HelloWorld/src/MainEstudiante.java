
public class MainEstudiante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Estudiante marc = new Estudiante();
		Estudiante cristina = new Estudiante(3,41);
		System.out.println(marc.getEdad());
		System.out.println(marc.getTelefono());
		System.out.println(cristina.getEdad());
		System.out.println(cristina.getId());
		marc.setEdad(37);
		System.out.println(marc.getEdad());

	}

}
