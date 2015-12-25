package edu.ipn.struts.holamundo.model;

/**
 *
 * Clase del modelo que almacena un mensaje
 *
 */
public class MensajeAlmacenado {

	private String mensaje;

	public MensajeAlmacenado() {

		setMensaje("Hola, mi primer ejemplo de Struts");
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

}
