package gestion;

import java.util.ArrayList;
import zooAnimales.Animal;

public class Zona {
	private String nombre;
	private ArrayList<Zoologico> zoo= new ArrayList<Zoologico>();
	private ArrayList<Animal> animales = new ArrayList<Animal>();
	
	//constructores
	public Zona() {
		
	}
	
	public Zona(String nombre, Zoologico zoo) {
		this.nombre = nombre;
		this.zoo.add(zoo);
	}
	//metodos get
	
	public String getNombre() {
		return(this.nombre);
	}
	
	public Zoologico getZoo() {
		return(zoo.get(0));
	}
	
	public ArrayList<Animal> getZonas() {
		return(this.animales);
	}
	
	//metodos set
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	//metodos de la clase
	public void agregarAnimales(Animal animal) {
		animales.add(animal);
	}
	
	public int cantidadAnimales() {
		return(animales.size());
	}
}
