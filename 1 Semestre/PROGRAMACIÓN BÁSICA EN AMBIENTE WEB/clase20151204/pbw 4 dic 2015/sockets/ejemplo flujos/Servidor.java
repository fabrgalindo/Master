// Configura un Servidor que recibira una conexion de un cliente, envia
// una cadena a el cliente, y cierra la conexion
import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Servidor extends JFrame {
   private JTextField entradaCampo;
   private JTextArea pantallaArea;
   private ObjectOutputStream salida;
   private ObjectInputStream entrada;
   private ServerSocket servidor;
   private Socket conexion;
   private int contador = 1;

   // configura la GUI
   public Servidor()
   {
      super( "Servidor" );

      Container contenedor = getContentPane();

      // crea entradaCampo y registra el escucha
      entradaCampo = new JTextField();
      entradaCampo.setEditable( false );
      entradaCampo.addActionListener(
         new ActionListener() {

            // envia mensaje al client
            public void actionPerformed( ActionEvent event )
            {
               enviaDatos( event.getActionCommand() );
               entradaCampo.setText( "" );
            }
         }
      );

      contenedor.add( entradaCampo, BorderLayout.NORTH );

      // crea pantallaArea
      pantallaArea = new JTextArea();
      contenedor.add( new JScrollPane( pantallaArea ),
         BorderLayout.CENTER );

      setSize( 300, 150 );
      setVisible( true );

   } // fin del constructor del Servidor

   // configura y ejecuta el servidor
   public void ejecutaServidor()
   {
      // configura el servidor para recibir conexiones
      // y procesa conexiones
      try {

         // Paso 1: Crea un ServerSocket.
         servidor = new ServerSocket( 12345, 100 );

         while ( true ) {

            try {
               esperaParaConexion(); // Paso 2: Espera para una conexion.
               obtieneFlujos();        // Paso 3: Obtiene flujos de entrada y salida
               procesaConexion(); // Paso 4: Procesa la conexion.
            }

            // procesa EOFException cuendo el cliente cierra la conexion
            catch ( EOFException eofException ) {
               System.err.println( "Servidor termino la conexion" );
            }

            finally {
               cierraConexion();   // Paso 5: Close conexion.
               ++contador;
            }

         } // fin while

      } // fin try

      // procesa problemas con E/S
      catch ( IOException ioException ) {
         ioException.printStackTrace();
      }

   } // fin metodo ejecutaServidor

   // espera que llegue unaconexion, entonces
   // muestra informacion de la conexion
   private void esperaParaConexion() throws IOException
   {
      pantallaMensaje( "Esperando para una conexion\n" );
      conexion = servidor.accept(); // permite al servidor aceptar una conexion
      pantallaMensaje( "Conexion " + contador + " recibida de: " +
         conexion.getInetAddress().getHostName() );
   }

   // obtiene flujos para enviar y recibir datos
   private void obtieneFlujos() throws IOException
   {
      // establece flujo de salida para los objetos
      salida = new ObjectOutputStream( conexion.getOutputStream() );
      salida.flush(); // vacia bufer de salida buffer para enviar
                      // informacion de encabezado

      // establece flujo de entrada para los objetos
      entrada = new ObjectInputStream( conexion.getInputStream() );

      pantallaMensaje( "\nSe recibieron flujos de E/S\n" );
   }

   // procesa conexion con el cliente
   private void procesaConexion() throws IOException
   {
      // envia mensaje de conexion exitosa al cliente
      String mensaje = "Connection exitosa";
      enviaDatos( mensaje );

      // habilita entradaCampo para que el usuario del servidor pueda enviar mensajes
      estableceCampoTextoEditable( true );

      do { // procesa mensajes enviados desde el cliente

         // lee el mensaje y lo muestra
         try {
            mensaje = ( String ) entrada.readObject();
            pantallaMensaje( "\n" + mensaje );
         }

         // procesa problemas de lectura del cliente
         catch ( ClassNotFoundException classNotFoundException ) {
            pantallaMensaje( "\nSe recibio un tipo de objeto desconocido" );
         }

      } while ( !mensaje.equals( "CLIENTE>>> TERMINAR" ) );

   } // fin del metodo procesaConexion

   // cierra flujos y socket
   private void cierraConexion()
   {
      pantallaMensaje( "\nFinalizando la conexion\n" );
      estableceCampoTextoEditable( false ); // deshabilita entradaCampo

      try {
         salida.close();
         entrada.close();
         conexion.close();
      }
      catch( IOException ioException ) {
         ioException.printStackTrace();
      }
   }

   // envia mensaje al cliente
   private void enviaDatos( String mensaje )
   {
      // envia objeto al cliente
      try {
         salida.writeObject( "SERVIDOR>>> " + mensaje );
         salida.flush();
         pantallaMensaje( "\nSERVIDOR>>> " + mensaje );
      }

      // procesa problemas que pueden ocurrir al enviar el objecto
      catch ( IOException ioException ) {
         pantallaArea.append( "\nError al escribir el objecto" );
      }
   }

   // metodo utilitari que es llamado de otros threads para manipular
   // pantallaArea en el thread despachador de eventos
   private void pantallaMensaje( final String mensajeAMostrar )
   {
      // muestra el mensaje del thread de ejecucion event-dispatch
      SwingUtilities.invokeLater(
         new Runnable() {  // clase interna para asegurar que la GUI
                           // se actualiza apropiadamente

            public void run() // actualiza pantallaArea
            {
               pantallaArea.append( mensajeAMostrar );
               pantallaArea.setCaretPosition(
                  pantallaArea.getText().length() );
            }

         }  // fin de la clase interna

      ); // fin de la llamada a SwingUtilities.invokeLater
   }

   // metodo utilitario llamado de threads para manipular
   // entradaCampo en el thread  event-dispatch
   private void estableceCampoTextoEditable( final boolean editable )
   {
      // muestra mensaje del thread de ejecucion event-dispatch
      SwingUtilities.invokeLater(
         new Runnable() {  // clase interna para asegurar que la GUI
                           // se actualiza adecuadamente
            public void run()  // establece editabilidad de entradaCampo
            {
               entradaCampo.setEditable( editable );
            }

         }  // fin de la clase interna

      ); // fin de la llamada SwingUtilities.invokeLater
   }

   public static void main( String args[] )
   {
      Servidor application = new Servidor();
      application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      application.ejecutaServidor();
   }

}  // fin de la clase Servidor

/**************************************************************************
 * (C) Copyright 1992-2003 by Deitel & Associates, Inc. and               *
 * Prentice Hall. All Rights Reserved.                                    *
 *************************************************************************/