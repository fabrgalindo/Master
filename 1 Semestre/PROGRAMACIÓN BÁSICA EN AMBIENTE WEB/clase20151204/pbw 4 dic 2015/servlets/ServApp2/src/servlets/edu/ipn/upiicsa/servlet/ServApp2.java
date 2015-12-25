package	edu.ipn.upiicsa.servlet;

//	Curso de Programación para Servlets en Java
//	Ejercicio #2 : Introducción a la creacion de Servlets.
//	Contexto: Generación de un Servlet simple que obtiene
//		  información sobre su conexión.
//
import java.util.*;				// para usar ResourceBundle's
import java.io.*;						// estándar en el JDK1.7
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

		// OJO: Título parametrizado
		String elTitulo = new String("Ejemplo #2: Obteniendo información sobre la conexión.");
		salida.println("<title>" + elTitulo + "</title>");
		salida.println("</head>");

		// OJO: Noten el tratamiento de las comillas dobles ("..")
		salida.println("<body bgcolor=\"white\">");

		// OJO: Todas las rutas a las imágenes será relativas!
		salida.println("<h4>Creada con:</h4>");

		// OJO: La ruta relativa ./images realmente mapea sobre
		//		./webpages, por lo que la ruta total es:
		//		./webpages/images/sonyVaio.gif
		salida.println("<img src=\"./images/sonyVaio.gif\">");
		salida.println("<br><hr>");

		// Una tabla estándar en HTML...
		salida.println("<h3>" + elTitulo + "</h3>");
		salida.println("<table border=1><tr><td>");
		salida.println("Método llamado: "+peticion.getMethod());
		salida.println("</td></tr><tr><td>");
		salida.println("URI de procedencia: "+peticion.getRequestURI());
		salida.println("</td></tr><tr><td>");
		salida.println("Protocolo utilizado: "+peticion.getProtocol());
		salida.println("</td></tr><tr><td>");
		salida.println("Dirección remota: "+peticion.getRemoteAddr());
		salida.println("</td></tr></table>");

	} // fin doGet

	/**
	 *
	 *
	 */
	public void doPost(HttpServletRequest peticion,
			   HttpServletResponse respuesta)
			   throws IOException, ServletException {

		// solamente un comando, ¿porque?
		doGet(peticion, respuesta);

	} // fin doPost

} // fin ServApp2
