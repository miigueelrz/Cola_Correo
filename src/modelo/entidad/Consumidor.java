package modelo.entidad;

import modelo.negocio.GestorCorreo;

public class Consumidor implements Runnable {
	private String nombre;
	private GestorCorreo cola;
	
	
	public Consumidor(String nombre, GestorCorreo cola) {
		super();
		this.nombre = nombre;
		this.cola = cola;
	}


	@Override
	public void run() {
		
		while(true) {
			Correo mensaje = cola.getCorreo();
			System.out.println(nombre + " ha consumido el mensaje: " + mensaje);
		}
		
		
	}
	
	
}
