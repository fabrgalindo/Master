package	edu.ipn.upiicsa.servlet;

//	Curso de Programación para Servlets en Java
//	Introducción a la creacion de Servlets.
//
//	La aplicacion, una vez instalada adecuadamente dentro
//	del contenedor de servlets seleccionado (Tomcat en este
//	caso) podrá ser invocada usando el navegador de internet.
//
import java.io.*;						// estándar en el JDK1.7
import javax.servlet.*;			// obtenido de servlet-api.jar
import javax.servlet.http.*;		// obtenido de servlet-api.jar

/**
 *	<p>
 *	Clase principal del servlet.
 *	</p>
 *
 *	@author		Abel
 *	@version	2.0
 */
public class ServApp1 extends HttpServlet {
	private static final long serialVersionUID = 1L;


		/**
		 *
		 *
		 */
	    public void doGet(HttpServletRequest peticion,
	                      HttpServletResponse respuesta)
		        throws IOException, ServletException {


			// Objetos locales
			String elTitulo = new String("Primer encuentro con Servlets");

			// dile a http el tipo MIME a usar...
		    respuesta.setContentType("text/html");

			// obten la manija de E/S
			PrintWriter out = respuesta.getWriter();

			// avienta todo el html que quieras...
			// seguimos las reglas de html... primero
			// el encabezado...
			out.println("<html>");
			out.println("<body bgcolor=\"white\">");
			out.println("<head>");

			// OJO: Aqui estamos PARAMETRIZANDO la generación
			//		de una página web...
			out.println("<title>" + elTitulo + "</title>");
			out.println("</head>");
			out.println("<body>");

			// el cuerpo del servlet va aqui...
			out.println("<h1>");
			out.println("Bienvenidos y bienvenidas ServApp1! <b>Prog Basica</b>");
			out.println("</h1>");

			// el fin de la página...
			out.println("</body>");
			out.println("</html>");

		} // fin doGet

} // fin ServApp1
