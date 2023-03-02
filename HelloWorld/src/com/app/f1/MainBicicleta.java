package com.app.f1;

import com.app.f2.Bicicleta;

public class MainBicicleta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bicicleta orbea = new Bicicleta(30);
		System.out.println(orbea.getCambios());
		orbea.setCambios(23);
		System.out.println(orbea.getCambios());
	}

}
