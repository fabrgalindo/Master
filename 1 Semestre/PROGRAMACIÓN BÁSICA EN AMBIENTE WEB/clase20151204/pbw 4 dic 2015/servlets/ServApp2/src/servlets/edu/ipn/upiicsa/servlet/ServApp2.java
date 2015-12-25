package	edu.ipn.upiicsa.servlet;

//	Curso de Programaci�n para Servlets en Java
//	Ejercicio #2 : Introducci�n a la creacion de Servlets.
//	Contexto: Generaci�n de un Servlet simple que obtiene
//		  informaci�n sobre su conexi�n.
//
import java.util.*;				// para usar ResourceBundle's
import java.io.*;						// est�ndar en el JDK1.7
import javax.servlet.*;			// obtenido de servlet-api.jar
import javax.servlet.http.*;		// obtenido de servlet-api.jar

/**
 *	<p>
 *	Clase principal del servlet.
 *	</p>
 *
 *	@author		ABM
 *	@version	1.0
 */
public class ServApp2 extends HttpServlet {

	/**
	 *
	 *
	 */
	public void doGet(HttpServletRequest peticion,
			  HttpServletResponse respuesta)
			  throws IOException, ServletException {

		respuesta.setContentType("text/html");

		PrintWriter salida = respuesta.getWriter();
		salida.println("<html>");
		salida.println("<body>");
		salida.println("<head>");

		// OJO: T�tulo parametrizado
		String elTitulo = new String("Ejemplo #2: Obteniendo informaci�n sobre la conexi�n.");
		salida.println("<title>" + elTitulo + "</title>");
		salida.println("</head>");

		// OJO: Noten el tratamiento de las comillas dobles ("..")
		salida.println("<body bgcolor=\"white\">");

		// OJO: Todas las rutas a las im�genes ser� relativas!
		salida.println("<h4>Creada con:</h4>");

		// OJO: La ruta relativa ./images realmente mapea sobre
		//		./webpages, por lo que la ruta total es:
		//		./webpages/images/sonyVaio.gif
		salida.println("<img src=\"./images/sonyVaio.gif\">");
		salida.println("<br><hr>");

		// Una tabla est�ndar en HTML...
		salida.println("<h3>" + elTitulo + "</h3>");
		salida.println("<table border=1><tr><td>");
		salida.println("M�todo llamado: "+peticion.getMethod());
		salida.println("</td></tr><tr><td>");
		salida.println("URI de procedencia: "+peticion.getRequestURI());
		salida.println("</td></tr><tr><td>");
		salida.println("Protocolo utilizado: "+peticion.getProtocol());
		salida.println("</td></tr><tr><td>");
		salida.println("Direcci�n remota: "+peticion.getRemoteAddr());
		salida.println("</td></tr></table>");

	} // fin doGet

	/**
	 *
	 *
	 */
	public void doPost(HttpServletRequest peticion,
			   HttpServletResponse respuesta)
			   throws IOException, ServletException {

		// solamente un comando, �porque?
		doGet(peticion, respuesta);

	} // fin doPost

} // fin ServApp2
