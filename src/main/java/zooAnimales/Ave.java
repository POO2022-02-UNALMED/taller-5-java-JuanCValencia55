package zooAnimales;

import java.util.ArrayList;

public class Ave extends Animal {
	private static ArrayList<Ave> listado = new ArrayList<Ave>();
	public static int halcones;
	public static int aguilas;
	private String colorPlumas;
	
	//constructor
	public Ave() {
		
	}
	public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas) {
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setHabitat(habitat);
		this.setGenero(genero);
		this.colorPlumas = colorPlumas;
	}
	//metodos get
	public String getColorPlumas() {
		return(this.colorPlumas);
	}
	
	//metodos set
	public void setColorPlumas(String color) {
		this.colorPlumas = color;
	}
	
	//metodos de la clase
	public static int cantidadAves() {
		return(listado.size());
	}
	
	@Override
	public String movimiento() {
		return("volar");
	}
	
	public static Ave crearHalcon(String nombre, int edad, String genero) {
		Ave halcon = new Ave(nombre, edad, "montanas", genero, "cafe glorioso");
		halcones++;
		listado.add(halcon);
		return(halcon);
	}
	
	public static Ave crearAguila(String nombre, int edad, String genero) {
		Ave aguila = new Ave(nombre, edad, "montanas", genero, "blanco y amarillo");
		aguilas++;
		listado.add(aguila);
		return(aguila);
	}
}
