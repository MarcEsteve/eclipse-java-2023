package com.app.general;

public class MainReferencias {

	public static void main(String[] args) {
		int valor1 = 5;
		//6
		MainReferencias.cambiarValor(valor1);
		//5
		System.out.println(valor1);
	}
	
	public static void cambiarValor(int valor1) {
		valor1 = 6;
		//6
		System.out.println(valor1);
	}

}
