package Reto2;

public class Particular extends Vehiculo {
private String color;
public Particular(double velocidad, int pasajeros, String placa, String tipo,String color) {
	super(velocidad, pasajeros, placa, tipo);
this.color=color;
}
@Override
public String toString() {
	return "\tVehiculo Particular-Placa: "+ getPlaca() + " Velocidad:  " +  getVelocidad() +" Km/h  " + " Pasajeros: " + getPasajeros() + " Color "  +color;
	


}
}