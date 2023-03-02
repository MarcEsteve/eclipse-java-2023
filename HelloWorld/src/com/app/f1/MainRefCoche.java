package com.app.f1;

public class MainRefCoche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coche audi = new Coche();
		//Cambia a 2 asientos
		audi.setAsientos(2);
		System.out.println(audi.getAsientos());
		cambiarValor(audi);
		System.out.println(audi.getAsientos());
		
	}
	
	public static void cambiarValor(Coche audi) {
		//Cambia a 4 asientos
		audi.setAsientos(4);
	}

}
