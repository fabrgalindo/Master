
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class PruebaCampoTexto extends JApplet {
   private JTextField textField1, textField2, textField3;
   private JPasswordField passwordField;

   public void init()
   {

      Container container = getContentPane();
      container.setLayout( new FlowLayout() );

      // coustruye campo de texto
      textField1 = new JTextField( 10 );
      container.add( textField1 );

      // construye campo de texto
      textField2 = new JTextField( "Introduzca texto aqui" );
      container.add( textField2 );

      // construye campo de texto
      // con 20 elementos visibles y sin manejador de eventos
      textField3 = new JTextField( "Campo de texto no editable", 20 );
      textField3.setEditable( false );
      container.add( textField3 );

      // construye campo de texto con texto default
      passwordField = new JPasswordField( "Texto oculto" );
      container.add( passwordField );

      // registrar manejadores de evento
      TextFieldHandler manija = new TextFieldHandler();
      textField1.addActionListener( manija );
      textField2.addActionListener( manija );
      textField3.addActionListener( manija );
      passwordField.addActionListener( manija );

      setSize( 325, 100 );
      setVisible( true );
   }


   // clase interna privada para el manejo de eventos
   private class TextFieldHandler implements ActionListener {

      // procesa eventos de campo de texto
      public void actionPerformed( ActionEvent event )
      {
         String string = "";

         // el usuario presiono Enter en JTextField textField1
         if ( event.getSource() == textField1 )
            string = "textField1: " + event.getActionCommand();

         // el usuario presiono Enter en  JTextField textField2
         else if ( event.getSource() == textField2 )
            string = "textField2: " + event.getActionCommand();

         // el usuario presiono Enter en JTextField textField3
         else if ( event.getSource() == textField3 )
            string = "textField3: " + event.getActionCommand();

         // el usuario presiono Enter en JTextField passwordField
         else if ( event.getSource() == passwordField ) {
            JPasswordField pwd =
               ( JPasswordField ) event.getSource();
            string = "passwordField: " +
                new String( passwordField.getPassword() );
         }

         JOptionPane.showMessageDialog( null, string );
      }

   }  // fin de la clase interna privada TextFieldHandler

}  // fin clase TextFieldTest
