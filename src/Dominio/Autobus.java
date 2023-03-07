package Dominio;

import java.util.*;

public class Autobus extends Vehiculo {

	private List<Pasajero> pasajeros;
	public Autobus(String chofer) {
		super(chofer);
		this.pasajeros = new ArrayList<>();
	}
	
	public List<Pasajero> getPasajeros() {
		return pasajeros;
	}

	@Override
	public void agregarPasajero(Pasajero pasajero) throws VehiculoLLenoException {
		
		if(this.pasajeros.size()==20) {
			throw new VehiculoLLenoException();
		}
		if(this.pasajeros.size()<30)
		this.pasajeros.add(pasajero);
	}
	
	@Override
	public void asignarChofer(String chofer) throws PasajerosAunEnElVehiculoException {
		
		if(hayPasajeros()) {
			throw new PasajerosAunEnElVehiculoException();
		}
	}
	
	private Boolean hayPasajeros() {
		if(this.pasajeros.size()==0) {
			return false;
		}
		else return true;
	}
	
	
}
