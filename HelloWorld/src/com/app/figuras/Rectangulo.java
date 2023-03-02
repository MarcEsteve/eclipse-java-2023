package com.app.figuras;

public class Rectangulo extends Figura implements Dibujable {
	//Constructores
	public Rectangulo() {
		super();
	}
	public Rectangulo(int base) {
		super();
		this.base = base;
	}
	public Rectangulo(int base, int altura) {
		super();
		this.base = base;
		this.altura = altura;
	}
	//Atributos
	private int base;
	private int altura;
	
	//Métodos
	@Override
	public double area() {
		return base*altura;
	}
	@Override
	public void dibujar() {
		System.out.println("Dibujando el rectangulo");
	}
	
	//Getters y setters
	
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
}