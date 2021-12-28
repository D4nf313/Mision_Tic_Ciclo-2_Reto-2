package Reto2;

public class Vehiculo {
private double velocidad;
private int pasajeros;
private String placa;
private String tipo;
public double getVelocidad() {
	return velocidad;
}
public void setVelocidad(double velocidad) {
	this.velocidad = velocidad;
}
public int getPasajeros() {
	return pasajeros;
}
public void setPasajeros(int pasajeros) {
	this.pasajeros = pasajeros;
}
public String getPlaca() {
	return placa;
}
public void setPlaca(String placa) {
	this.placa = placa;
}
public String getTipo() {
	return tipo;
}
public void setTipo(String tipo) {
	this.tipo = tipo;
}
public Vehiculo(double velocidad, int pasajeros, String placa, String tipo) {
	super();
	this.velocidad = velocidad;
	this.pasajeros = pasajeros;
	this.placa = placa;
	this.tipo = tipo;
}


}
