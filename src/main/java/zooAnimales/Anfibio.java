package zooAnimales;

import java.util.ArrayList;

public class Anfibio extends Animal{
	private static ArrayList<Anfibio> listado = new ArrayList<Anfibio>();
	public static int ranas;
	public static int salamandras;
	private String colorPiel;
	private boolean venenoso;
	
	//constructor
	public Anfibio() {
		
	}
	
	public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso) {
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setHabitat(habitat);
		this.setGenero(genero);
		this.colorPiel = colorPiel;
		this.venenoso = venenoso;
	}
	
	//metodos get
	public String getColorPiel() {
		return(this.colorPiel);
	}
	
	public boolean getVenenoso() {
		return(this.venenoso);
	}
	
	//metodos set
	public void setColorPiel(String color) {
		this.colorPiel = color;
	}
	
	public void setVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
	}
	
	//metodos de la clase
	public static int cantidadAnfibios() {
		return(listado.size());
	}
	
	@Override
	public String movimiento() {
		return("saltar");
	}
	
	public static Anfibio crearRana(String nombre, int edad, String genero) {
		Anfibio rana = new Anfibio(nombre, edad, "selva", genero, "rojo", true);
		listado.add(rana);
		ranas++;
		return(rana);
	}
	
	public static Anfibio crearSalamandra(String nombre, int edad, String genero) {
		Anfibio salamandra = new Anfibio(nombre, edad, "selva", genero, "negro y amarillo", false);
		listado.add(salamandra);
		salamandras++;
		return(salamandra);
	}
}
