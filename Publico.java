package Reto2;

public class Publico extends Vehiculo {

private String carga;

public Publico(double velocidad, int pasajeros, String placa, String tipo,String carga) {
		super(velocidad, pasajeros, placa, tipo);
		this.carga=carga;
		
	}
public String toString() {
	return "\tVehiculo Publico-Placa: "+ getPlaca() + " Velocidad: " +  getVelocidad() +" km/h "+ " Pasajeros: " + getPasajeros() + " Carga Máxima"  +carga;
	


}
}
