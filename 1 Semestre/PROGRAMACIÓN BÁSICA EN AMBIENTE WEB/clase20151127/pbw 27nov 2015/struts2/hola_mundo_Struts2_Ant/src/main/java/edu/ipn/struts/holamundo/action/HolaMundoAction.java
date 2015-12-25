package edu.ipn.struts.holamundo.action;

import edu.ipn.struts.holamundo.model.MensajeAlmacenado;

import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * Actua como un controlador de Struts 2 que responde
 * a la accion de un usuario inicializando el valor
 * de la clase modelo Mensaje, y regresa un String
 * como resultado
 *
 */
public class HolaMundoAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	/**
	 * La clase del modelo que almacena el mensaje
	 * para mostrar en la vista
	 */
	private MensajeAlmacenado mensajeAlmacenado;

	/*
	 * Crea el objeto del modelo MensajeAlmacenado y
	 * regresa exitoso.  El objeto del modelo
	 * MensajeAlmacenado sera disponible a la vista.
	 *
	 * @see com.opensymphony.xwork2.ActionSupport#execute()
	 */
	public String execute() throws Exception {

		mensajeAlmacenado = new MensajeAlmacenado() ;
		return SUCCESS;
	}

	public MensajeAlmacenado getMensajeAlmacenado() {
		return mensajeAlmacenado;
	}

	public void setMensajeAlmacenado(MensajeAlmacenado mensajeAlmacenado) {
		this.mensajeAlmacenado = mensajeAlmacenado;
	}



}
