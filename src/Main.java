import modelo.entidad.Consumidor;
import modelo.entidad.Productor;
import modelo.negocio.GestorCorreo;


public class Main {

	public static void main(String[] args) {
		GestorCorreo cola = new GestorCorreo();
		
		Productor p1 = new Productor("Producto 1",cola);
		Productor p2 = new Productor("Producto 2",cola);
		Productor p3 = new Productor("Producto 3",cola);
		
		Consumidor c1 = new Consumidor("Consumidor 1",cola);
		Consumidor c2 = new Consumidor("Consumidor 2",cola);
		
		Thread t1 = new Thread(p1);
		Thread t2 = new Thread(p2);
		Thread t3 = new Thread(p3);
		Thread t4 = new Thread(c1);
		Thread t5 = new Thread(c2);
		
		t1.start();
		t2.start();
		t3.start();
		
		t4.start();
		t5.start();
	}

}
