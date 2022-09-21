package zooAnimales;

import java.util.ArrayList;
import gestion.Zona;

public class Animal {
	private static int totalAnimales;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private ArrayList<Zona> zona = new ArrayList<Zona>();
	
	//constructor 
	public Animal(){
		totalAnimales++;
	}
	
	public Animal(String nombre, int edad, String habitat, String genero) {
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
	}
	//metodos get
	public int getTotalAnimales() {
		return(totalAnimales);
	}
	
	public int getEdad() {
		return(this.edad);
	}
	
	public String getNombre() {
		return(this.nombre);
	}
	
	public String getHabitat() {
		return(this.habitat);
	}
	
	public String getGenero() {
		return(this.genero);
	}
	
	//metodos set
	public void setTotalAnimales(int totalAnimales) {
		Animal.totalAnimales = totalAnimales;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	//metodos de la clase
	public String movimiento() {
		return("desplazarse");
	}
	
	public static String totalPorTipo() {
		return("Mamiferos: " + Mamifero.cantidadMamiferos() + "\n" + "Aves: " + Ave.cantidadAves() + "\n" + "Reptiles: " + Reptil.cantidadReptiles() + "\n" + "Peces: " + Pez.cantidadPeces() + "\n" + "Anfibios: " + Anfibio.cantidadAnfibios());
	}
	
	public String toString() {
		if(zona.size() == 0) {
			return("Mi nombre es " + this.getNombre() + ", tengo una edad de " + this.getEdad() + ", habito en " + this.getHabitat() + " y mi genero es " + this.getGenero());
		}
		return("Mi nombre es " + this.getNombre() + ", tengo una edad de " + this.getEdad() + ", habito en " + this.getHabitat() + " y mi genero es " + this.getGenero() + ", la zona en la que me ubico es " + zona.get(0).getNombre() + ", en el " + zona.get(0).getZoo().getNombre());

	}
}
