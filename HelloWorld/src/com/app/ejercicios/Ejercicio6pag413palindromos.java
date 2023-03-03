package com.app.ejercicios;

public class Ejercicio6pag413palindromos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String palindromo = "aibofobia";
		String inverso = "";

		System.out.println(palindromo.charAt(palindromo.length()-1));
		System.out.println(palindromo.length()-1);

		for (int i = (palindromo.length()-1); i >=0; i--) {
		    inverso += palindromo.charAt(i);
		}
		System.out.println(inverso);
		System.out.println(palindromo);

		if (palindromo.equals(inverso)) {
			System.out.println("La variable palindromo: " + palindromo 
		    		+ " es un palindromo");
		} else {
			System.out.println("La variable palindromo: " + palindromo 
		    		+ " NO es un palindromo");
		}
	}

}