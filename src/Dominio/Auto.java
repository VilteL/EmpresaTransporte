package Dominio;

import java.util.*;

public class Auto extends Vehiculo{
	
	private List<Pasajero> pasajeros;

	public Auto(String chofer) {
		super(chofer);
		this.pasajeros= new ArrayList<>();	
		}

	
	
	public List<Pasajero> getPasajeros() {
		return pasajeros;
	}

	public void setPasajeros(List<Pasajero> pasajeros) {
		this.pasajeros = pasajeros;
	}

	@Override
	public void agregarPasajero(Pasajero pasajero) throws VehiculoLLenoException {
		
		if(this.pasajeros.size()==3)
			throw new VehiculoLLenoException();
		
		if(this.pasajeros.size()<4)
		this.pasajeros.add(pasajero);
	
	}
	
	
	
}
