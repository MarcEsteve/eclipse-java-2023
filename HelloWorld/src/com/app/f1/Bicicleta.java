package com.app.f1;

public class Bicicleta implements Vehiculo {
	//Constructores
	public Bicicleta() {
		this.cambios= 15;
	}
	public Bicicleta(int cambios) {
		this.cambios = cambios;
	}
	//Atributo
	private int cambios;
	//Getters y setters
	public int getCambios() {
		return cambios;
	}
	public void setCambios(int cambios) {
		this.cambios = cambios;
	}
	@Override
	public void parar() {
		// TODO Auto-generated method stub
		System.out.println("Método de la bici");
	}
	@Override
	public void acelerar() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void desacelerar() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void girarIzquierda() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void girarDerecha() {
		// TODO Auto-generated method stub
		
	}
}
