package com.cursoceat.model;

public class Mecanico extends Empleado {

private enum ESPECIALIDAD {FRENOS,HIDRAULICA,ELECTRICIDAD,MOTOR}
private ESPECIALIDAD especialidad;

public Mecanico() {
	super();
	
}

public Mecanico(String nombre,String dni,String telefono,double sueldo,String especialidad){
	super(nombre, dni, telefono, sueldo);
	this.especialidad=ESPECIALIDAD.valueOf(especialidad);



}
	
	
	
	
}
