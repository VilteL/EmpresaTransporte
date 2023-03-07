package Dominio;

public class Moto extends Vehiculo{

	private Pasajero pasajeros;
	
	public Moto(String chofer) {
		super(chofer);
	}

	

	public Pasajero getPasajeros() {
		return pasajeros;
	}

	public void setPasajeros(Pasajero pasajeros) {
		this.pasajeros = pasajeros;
	}

	@Override
	public void agregarPasajero(Pasajero pasajero) throws VehiculoLLenoException {
		
		if(this.pasajeros == null) {
		this.pasajeros=pasajero;
		}
		else {
			throw new VehiculoLLenoException();
		}
	}



	
	
	
	
}
