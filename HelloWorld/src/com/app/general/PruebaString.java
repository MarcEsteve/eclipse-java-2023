package com.app.general;

import java.lang.String;

public class PruebaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char letra = 'a';
		String palabra = "Marc";
		int longitud= palabra.length();
		System.out.println(letra);
		System.out.println(palabra);
		for (int i=0; i<longitud; i++) {
			System.out.println(palabra.charAt(i));
		}
	}

}
