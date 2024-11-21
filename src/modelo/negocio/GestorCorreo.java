package modelo.negocio;

import java.util.LinkedList;
import java.util.Queue;

import modelo.entidad.Correo;

public class GestorCorreo {
	public final static int MAX_ELEMENTOS = 5;
	
	private Queue<Correo> cola = new LinkedList<>();
	
	public synchronized Correo getCorreo(){
		
		while(cola.size() == 0){
			try {
				wait();
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		Correo cadena = cola.poll();
		
		notify();
		return cadena;
	}	
	
	public synchronized void addCorreo(Correo mensaje){
		if(mensaje.getDestinatario().equalsIgnoreCase("pikachu@gmail.com")) {
			System.out.println("No admitimos a pikachu :)");
			return;
		}
		
		while(cola.size() == MAX_ELEMENTOS){//5
			try {
				wait();			
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		cola.offer(mensaje);
		
		notify();
	}
}
