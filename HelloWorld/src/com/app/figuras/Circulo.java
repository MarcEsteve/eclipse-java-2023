package com.app.figuras;

public class Circulo extends Figura implements Dibujable {
	//Constructores
	public Circulo() {
		super();
	}
	
	public Circulo(float radio) {
		super();
		this.radio = radio;
	}

	//Atributos
	 private float radio;
	

	//Métodos
	@Override
	public void dibujar() {
		// TODO Auto-generated method stub
		System.out.println("Dibujando el círculo");
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return pi * Math.pow(radio, 2);
	}
	//Getters y setters
	public float getRadio() {
		return radio;
	}

	public void setRadio(float radio) {
		this.radio = radio;
	}
	
}