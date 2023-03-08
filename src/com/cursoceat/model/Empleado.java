package com.cursoceat.model;

public class Empleado {

    private static int id;
	protected String nombre;
	protected String dni;
	protected String telefono;
	protected double sueldo;

public Empleado() {
	asignarID();//creamos un constuctor y se le asigna un id
	}

public Empleado(String nombre, String dni, String telefono, double sueldo) {
	this.nombre = nombre;
	this.dni = dni;
	this.telefono = telefono;
	this.sueldo = sueldo;
    //id++;//esto es una manera
    asignarID(); // esta es la otra manera
    }
//en el caso de los static no hay que usar this.
	static private void asignarID() {
		id++;
	}

	public static int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public void mostrarDatos() {
	System.out.println("El id del empleado es: " + id);
	System.out.println("Su nombre es: " + this.nombre);
	System.out.println("Su dni es: " + this.dni);
	System.out.println("Su telefono: " + this.telefono);
	System.out.println("y su sueldo es: " + this.sueldo);
	
	
	}
	
}
