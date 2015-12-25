// Cliente que lee y muestra informacion enviada de un servidor
import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Cliente extends JFrame {
   private JTextField entradaCampo;
   private JTextArea despliegueArea;
   private ObjectOutputStream salida;
   private ObjectInputStream entrada;
   private String mensaje = "";
   private String servidor;
   private Socket cliente;

   // initializa servidor y GUI
   public Cliente( String host )
   {
      super( "Cliente" );
      // establece el servidor al cual este cliente se conecta
      servidor = host;


      Container contenedor = getContentPane();

      // crea entradaCampo y registra el escucha
      entradaCampo = new JTextField();
      entradaCampo.setEditable( false );
      entradaCampo.addActionListener(
         new ActionListener() {

            // envia mensaje al servidor
            public void actionPerformed( ActionEvent event )
            {
               enviaDatos( event.getActionCommand() );
               entradaCampo.setText( "" );
            }
         }
      );

      contenedor.add( entradaCampo, BorderLayout.NORTH );

      // crea despliegueArea
      despliegueArea = new JTextArea();
      contenedor.add( new JScrollPane( despliegueArea ),
         BorderLayout.CENTER );

      setSize( 300, 150 );
      setVisible( true );

   } // fin constructor Cliente

   // Se connecta al servidor y procesa mensajes del servidor
   private void ejecutaCliente()
   {
      // se conecta al servidor, obtiene flujos, procesa la conexion
      try {
         conectaAlServidor(); // Paso 1: Crea un socket para hacer la conexion
         obtieneFlujos();      // Paso 2: Obtiene los flujo0s de entrada y salida
         procesaConexion(); // Paso 3: Procesa la conexion
      }

      // conexion cerrada del servidor
      catch ( EOFException eofException ) {
         System.err.println( "El Cliente termino la conexion" );
      }

      // proceda problemas de comunicacion con el servidor

      catch ( IOException ioException ) {
         ioException.printStackTrace();
      }

      finally {
         cierraConexion(); // Paso 4: Conexion cerrada
      }

   } // fin del metodo ejecutaCliente

   // conecta al servidor
   private void conectaAlServidor() throws IOException
   {
      muestraMensaje( "Intentando conexion\n" );

      // crea el Socket para conectarse al servidor
      cliente = new Socket( InetAddress.getByName( servidor ), 12345 );

      // mostrando informacion de conexion
      muestraMensaje( "Conectado a: " +
         cliente.getInetAddress().getHostName() );
   }

   // obtiene flujos para enviar y recibir datos
   private void obtieneFlujos() throws IOException
   {
      // establece flujo de salidad para los objetos
      salida = new ObjectOutputStream( cliente.getOutputStream() );
      salida.flush(); // vacia buffer de salida para enviar informacion de encabezado

      // establecer flujo de entrada para los objetos
      entrada = new ObjectInputStream( cliente.getInputStream() );

      muestraMensaje( "\nSe recibieron los flujos de E/S \n" );
   }

   // procesa la conexion con el servidor
   private void procesaConexion() throws IOException
   {
      // habilitar entradaCampo para que el usuario del cliente pueda enviar mensajes
      estableceCampoTextoEditable( true );

      do { // procesa mensaje enviados desde el servidor

         // lee el mensaje y lo muestra
         try {
            mensaje = ( String ) entrada.readObject();
            muestraMensaje( "\n" + mensaje );
         }

         // atrapa problemas que pueden ocurrir al leer el servidor
         catch ( ClassNotFoundException classNotFoundException ) {
            muestraMensaje( "\nSe recibio un objeto de tipo desconocido" );
         }

      } while ( !mensaje.equals( "SERVIDOR >>> TERMINAR" ) );

   } // fin del metodo procesaConnexion

   // cierra flujos y socket
   private void cierraConexion()
   {
      muestraMensaje( "\nCerrando conexion" );
      estableceCampoTextoEditable( false ); // deshabilita entradaCampo

      try {
         salida.close();
         entrada.close();
         cliente.close();
      }
      catch( IOException ioException ) {
         ioException.printStackTrace();
      }
   }

   // envia mensaje al servidor
   private void enviaDatos( String mensaje )
   {
      // envia objeto al servidor
      try {
         salida.writeObject( "CLIENTE>>> " + mensaje );
         salida.flush();
         muestraMensaje( "\nCLIENTE>>> " + mensaje );
      }

      // procesa problemas que ocurren al enviar el objeto
      catch ( IOException ioException ) {
         despliegueArea.append( "\nError al escribir el objecto" );
      }
   }

   // metodo utilitario que es llamado desde otros subprocesos (threads) para manipular
   // despliegueArea en el thread despachador de eventos
   private void muestraMensaje( final String mensajeAMostrar )
   {
      // muestra mensaje del thread de ejecucion de la GUI
      SwingUtilities.invokeLater(
         new Runnable() {  // clase interna para asegurar que la GUI
                           // se actualiza apropiadamente

            public void run() // actualiza despliegueArea
            {
               despliegueArea.append( mensajeAMostrar );
               despliegueArea.setCaretPosition(
                  despliegueArea.getText().length() );
            }

         }  // fin de la clase interna

      ); // fin de la llamada a SwingUtilities.invokeLater
   }

   // metodo utilitario llamado de otros threads para maipular
   // entradaCampo en el thread despachador de eventos
   private void estableceCampoTextoEditable( final boolean editable )
   {
      // muestra el mensaje del subproceso de ejecucion de la GUI
      SwingUtilities.invokeLater(
         new Runnable() {  // se interna para asegurar que la GUI
                           // se actualiza apropiadamente
            public void run()  // establece la capacidad para
                               // modificar entradaCampo
            {
               entradaCampo.setEditable( editable );
            }

         }  // fin de la clase interna

      ); // fin de la llamada a SwingUtilities.invokeLater
   }

   public static void main( String args[] )
   {
      Cliente application;

      if ( args.length == 0 )
         application = new Cliente( "127.0.0.1" );
      else
         application = new Cliente( args[ 0 ] );

      application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      application.ejecutaCliente();
   }

} // fin de la clase Cliente

/**************************************************************************
 * (C) Copyright  by Deitel & Associates, Inc. and                        *
 * Prentice Hall. All Rights Reserved.                                    *
 *************************************************************************/
