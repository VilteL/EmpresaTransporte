package Dominio;

public abstract class Vehiculo {
	
	private Double km;
	private String chofer;
	
	
	public Vehiculo(String chofer) {
		this.chofer=chofer;
		this.km=0.0;
	}
	
	public void asignarChofer(String chofer) throws PasajerosAunEnElVehiculoException {
		this.chofer = chofer;
	}

	public Double getKm() {
		return km;
	}

	public String getChofer() {
		return chofer;
	}

	public void setKm(Double km) {
		this.km = km;
	}
	
	public abstract void agregarPasajero(Pasajero pasajero) throws VehiculoLLenoException;
	
}
