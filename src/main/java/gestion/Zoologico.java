package gestion;

import java.util.ArrayList;

public class Zoologico {
	private String nombre;
	private String ubicacion;
	private ArrayList<Zona> zonas = new ArrayList<Zona>();
	
	//metodos get
	
	public String getNombre() {
		return(this.nombre);
	}
	
	public String getUbicacion() {
		return(this.ubicacion);
	}
	
	public ArrayList<Zona> getZona() {
		return(this.zonas);
	}
	
	//metodos set
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setubicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	
	//metodos de la clase
	
	public void agregarZonas(Zona zona) {
		zonas.add(zona);
	}
	
	public int cantidadTotalAnimales() {
		int cantidad = 0;
		for(int i = 0; i < zonas.size(); i++) {
			cantidad += zonas.get(i).cantidadAnimales();
		}
		return(cantidad);
	}
}
