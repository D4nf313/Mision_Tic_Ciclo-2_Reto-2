package Reto2;

import java.util.ArrayList;

public class Inventario {
	ArrayList<Vehiculo> inv;

	public void mostrarLista() {
		for (int i = 0; i < inv.size(); i++) {
			if (inv.get(i).getTipo().equalsIgnoreCase("PARTICULAR")) {
				System.out.println(inv.get(i).toString());
			}else if (inv.get(i).getTipo().equalsIgnoreCase("PUBLICO")) {
				System.out.println(inv.get(i).toString());
			}
		}
	}

	public void ProcesarComandos(String c) {

		if (c.startsWith("1")) {
			String[] e = c.split("&");
			String t = e[1];
			String placa = e[2];
			double vel = Double.valueOf(e[3]);
			int pasajeros = Integer.valueOf(e[4]);
			String ultimo = e[5];
			Vehiculo v = null;
			if (t.equalsIgnoreCase("PARTICULAR")) {
				v = new Particular(vel, pasajeros, placa, t, ultimo);
				inv.add(v);

			}
			if (t.equalsIgnoreCase("PUBLICO")) {
				v = new Publico(vel, pasajeros, placa, t, ultimo);
				inv.add(v);


		}
		}
		if (c.startsWith("2")) {
			System.out.println("***Inventario Vehículos***");
			mostrarLista();
		}
	

	}

	public Inventario(ArrayList<Vehiculo> inv) {
		super();
		this.inv = inv;
	}
}
	