package modelo.entidad;

public class Correo {
	private int id;
	private String destinatario;
	private String remitente;
	private String asunto;
	private String cuerpoMensaje;
	
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getDestinatario() {
		return destinatario;
	}
	
	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}
	
	public String getRemitente() {
		return remitente;
	}
	
	public void setRemitente(String remitente) {
		this.remitente = remitente;
	}
	
	public String getAsunto() {
		return asunto;
	}
	
	public void setAsunto(String asunto) {
		this.asunto = asunto;
	}
	
	public String getCuerpoMensaje() {
		return cuerpoMensaje;
	}
	
	public void setCuerpoMensaje(String cuerpoMensaje) {
		this.cuerpoMensaje = cuerpoMensaje;
	}
	
	@Override
	public String toString() {
		return "correo [id=" + id + ", destinatario=" + destinatario + ", remitente=" + remitente + ", asunto=" + asunto
				+ ", cuerpoMensaje=" + cuerpoMensaje + "]";
	}
	
	
	
}
