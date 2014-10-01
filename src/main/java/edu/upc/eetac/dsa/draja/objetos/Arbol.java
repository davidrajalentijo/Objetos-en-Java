package edu.upc.eetac.dsa.draja.objetos;

public class Arbol {
	int altura;
	String nombre;
	
	Arbol (int altura)
	{
		this.altura = altura;
		System.out.println("Un árbol de " + altura + " metros");
		
	}
	Arbol (String nombre){
		this.nombre = nombre;
		System.out.println("Un " + nombre);
		
	}
	Arbol()
	{
		System.out.println("Un árbol genérico");
	}

	Arbol(String nombre, int altura){
		this.nombre = nombre;
		this.altura = altura;
		System.out.println("Un " + nombre + " de " + altura + " metros ");
	}
}
