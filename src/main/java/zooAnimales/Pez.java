package zooAnimales;

import java.util.ArrayList;

public class Pez extends Animal{
	private static ArrayList<Pez> listado = new ArrayList<Pez>();
	public static int salmones;
	public static int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	
	//constructor
	public Pez() {
		listado.add(this);
	}
	
	public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas) {
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setHabitat(habitat);
		this.setGenero(genero);
		this.colorEscamas = colorEscamas;
		this.cantidadAletas = cantidadAletas;
		listado.add(this);
	}
	//metodos get
	public String getColorEscamas() {
		return(this.colorEscamas);
	}
	
	public int getCantidadAletas() {
		return(this.cantidadAletas);
	}
	
	//metodos set
	public void setColorEscamas(String color) {
		this.colorEscamas = color;
	}
	
	public void setCantidadAletas(int cantidadAletas) {
		this.cantidadAletas = cantidadAletas;
	}
	
	//metodos de la clase
	
	public static int cantidadPeces() {
		return(listado.size());
	}
	
	@Override
	public String movimiento() {
		return("nadar");
	}
	
	public static Pez crearSalmon(String nombre, int edad, String genero) {
		Pez salmon = new Pez(nombre, edad, "oceano", genero, "rojo", 6);
		salmones++;
		return(salmon);
	}

	public static Pez crearBacalao(String nombre, int edad, String genero) {
		Pez bacalao = new Pez(nombre, edad, "oceano", genero, "gris", 6);
		bacalaos++;
		return(bacalao);
	}
}
