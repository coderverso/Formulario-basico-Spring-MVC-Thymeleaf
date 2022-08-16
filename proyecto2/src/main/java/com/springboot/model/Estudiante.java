package com.springboot.model;

public class Estudiante {
/*atributos*/
	private String nombre;
	private String apellido;
	private int nota1;
	private int nota2;
	
	/*Constructores*/
	public Estudiante() {
		
	}

	public Estudiante(String nombre, String apellido, int nota1, int nota2) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.nota1 = nota1;
		this.nota2 = nota2;
	}
    /*Metodos Get y set*/
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getNota1() {
		return nota1;
	}

	public void setNota1(int nota1) {
		this.nota1 = nota1;
	}

	public int getNota2() {
		return nota2;
	}

	public void setNota2(int nota2) {
		this.nota2 = nota2;
	}
	//Metodos de usuario
	
	public double Promedio() {
		return (nota1 + nota2 )/2.0;
	}
	
	public String Condicion() {
		if(Promedio() >= 11) {
			return "Aprobado";
		}
		else {
			return "Desaprobado";
		}
	}
	
    


}
