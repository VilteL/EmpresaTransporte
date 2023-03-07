package test;

import static org.junit.Assert.*;

import org.junit.Test;

import Dominio.Auto;
import Dominio.Autobus;
import Dominio.Pasajero;
import Dominio.PasajerosAunEnElVehiculoException;
import Dominio.Vehiculo;
import Dominio.VehiculoLLenoException;

public class test {

	@Test
	public void queSePuedanAgregarPasajerosAUnAutoBus() {
	
	Vehiculo autoBus = new Autobus("Pepe");
	
	Pasajero pasajero = new Pasajero();
	Pasajero pasajero1 = new Pasajero();
	
	
	try {
		autoBus.agregarPasajero(pasajero);
		autoBus.agregarPasajero(pasajero1);
	} catch (VehiculoLLenoException e) {
		e.printStackTrace();
	}
	
	Integer cantidadDePasajeros = ((Autobus) autoBus).getPasajeros().size();
	
	assertEquals((Integer) 2, cantidadDePasajeros);
	
	}
	
	@Test
	public void queSePuedeCambiarDeChofe() {
		Vehiculo Auto = new Auto("Pepe");
		
		try {
			Auto.asignarChofer("Coqui");
		} catch (PasajerosAunEnElVehiculoException e) {
			e.printStackTrace();
		}
		
		String chofer = Auto.getChofer();
		
		assertEquals("Coqui", chofer);

	}
	
	@Test  (expected = PasajerosAunEnElVehiculoException.class)
	public void queNoSePuedaCambiarDeChoferCuandoHayPasajerosEnElAutoBus() throws PasajerosAunEnElVehiculoException {
		
		Vehiculo autoBus = new Autobus("Pepe");
		
		Pasajero pasajero = new Pasajero();
		Pasajero pasajero1 = new Pasajero();
				
		try {
			autoBus.agregarPasajero(pasajero);
			autoBus.agregarPasajero(pasajero1);
		} catch (VehiculoLLenoException e) {
			e.printStackTrace();
		}
		
		autoBus.asignarChofer("El fitti");
		
	}
	
	@Test (expected = VehiculoLLenoException.class)
	public void queSeNoPuedanSubirPasajerosAUnVehiculoLleno() throws VehiculoLLenoException {
		Vehiculo auto = new Auto("Pepe");
		
		Pasajero pasajero = new Pasajero();
		Pasajero pasajero1 = new Pasajero();
		Pasajero pasajero2 = new Pasajero();
		Pasajero pasajero3 = new Pasajero();
		
		auto.agregarPasajero(pasajero);
		auto.agregarPasajero(pasajero1);
		auto.agregarPasajero(pasajero2);
		auto.agregarPasajero(pasajero3);
		
	}
	
	@Test
	public void queLosPasajerosSeSientenEnOrden() {
		
		Vehiculo autoBus = new Autobus("Pepe");
		
		Pasajero pasajero = new Pasajero();
		Pasajero pasajero1 = new Pasajero();
		Pasajero pasajero2 = new Pasajero();
		
		try {
			autoBus.agregarPasajero(pasajero);
			autoBus.agregarPasajero(pasajero1);
			autoBus.agregarPasajero(pasajero2);
		} catch (VehiculoLLenoException e) {
			e.printStackTrace();
		}
		
		assertEquals(pasajero , ((Autobus) autoBus).getPasajeros().get(0));
		assertEquals(pasajero1, ((Autobus) autoBus).getPasajeros().get(1));
		assertEquals(pasajero2, ((Autobus) autoBus).getPasajeros().get(2));
		
		
	}

}
