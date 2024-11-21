package modelo.entidad;

import modelo.negocio.GeneradorEmails;
import modelo.negocio.GestorCorreo;

public class Productor implements Runnable{
	private String nombre;
	private GestorCorreo cola;
	
	public Productor(String nombre, GestorCorreo cola){
		super();
		this.nombre = nombre;
		this.cola = cola;
	}
	
		
	public void run(){
		for(int i = 1;i <= 10;i++){
			Correo mensaje = GeneradorEmails.getInstance().generarEmail();
			cola.addCorreo(mensaje);
			}
		}
	}


