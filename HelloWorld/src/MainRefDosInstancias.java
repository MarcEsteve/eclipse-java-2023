import com.app.f1.Coche;

public class MainRefDosInstancias {

	public static void main(String[] args) {
		Coche audi = new Coche();
		//Cambia a 2 asientos
		audi.setAsientos(2);
		System.out.println(audi.getAsientos());
		cambiarValor(audi);
		System.out.println(audi.getAsientos());
		
	}
	
	public static void cambiarValor(Coche audi) {
		audi = new Coche();
		//Cambia a 4 asientos
		audi.setAsientos(4);
	}

}
