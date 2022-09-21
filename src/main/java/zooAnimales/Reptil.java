package zooAnimales;

import java.util.ArrayList;

public class Reptil extends Animal{
	private static ArrayList<Reptil> listado = new ArrayList<Reptil>();
	public static int iguanas;
	public static int serpientes;
	private String colorEscamas;
	private int largoCola;
	
	//constructor
	public Reptil() {
		
	}
	public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola) {
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setHabitat(habitat);
		this.setGenero(genero);
		this.colorEscamas = colorEscamas;
		this.largoCola = largoCola;
	}
	//metodos get
	public String getColorEscamas() {
		return(this.colorEscamas);
	}
	
	public int getLargoCola() {
		return(this.largoCola);
	}
	
	//metodos set
	public void setColorEscamas(String color) {
		this.colorEscamas = color;
	}
	
	public void setLargoCola(int largoCola) {
		this.largoCola = largoCola;
	}
	
	//metodos de la clase
	public static int cantidadReptiles() {
		return(listado.size());
	}
	
	@Override
	public String movimiento() {
		return("reptar");
	}
	
	public static Reptil crearIguana(String nombre, int edad, String genero) {
		Reptil iguana = new Reptil(nombre, edad, "humedal", genero, "verde", 3);
		listado.add(iguana);
		iguanas++;
		return(iguana);
	}
	
	public static Reptil crearSerpiente(String nombre, int edad, String genero) {
		Reptil serpiente = new Reptil(nombre, edad, "jungla", genero, "blanco", 1);
		listado.add(serpiente);
		serpientes++;
		return(serpiente);
	}
	
}
