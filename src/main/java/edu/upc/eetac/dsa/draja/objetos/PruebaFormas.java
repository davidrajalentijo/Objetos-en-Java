package edu.upc.eetac.dsa.draja.objetos;

public class PruebaFormas {
	
	public static void main(String[] args) {
	Forma[] s = new Forma[3];
	s[0] = new Forma();
	// Circulo es tambien una Forma
	s[1] = new Círculo();
	// Cuadrado es tambien una Forma
	s[2] = new Cuadrado();
	for(int i = 0; i < s.length; i++)
	s[i].queEs();
	}
	}


