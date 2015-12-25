
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class PruebaBoton extends JApplet implements ActionListener{
   private JButton plainButton, fancyButton;


   public PruebaBoton()
   {
      //super( "Probando Botones" );

      Container container = getContentPane();
      container.setLayout( new FlowLayout() );

      plainButton = new JButton( "Boton Simple" );
      container.add( plainButton );

      Icon bug1 = new ImageIcon( "bug1.gif" );
      Icon bug2 = new ImageIcon( "bug2.gif" );
      fancyButton = new JButton( "Boton Fantasia", bug1 );
      fancyButton.setRolloverIcon( bug2 );
      container.add( fancyButton );

      // crea una instancia de la clase interna ButtonHandler
      // para ser usada para el manejo de eventos de botones

//      ButtonHandler handler = new ButtonHandler();
      fancyButton.addActionListener( this );
      plainButton.addActionListener( this );

      setSize( 275, 200 );
      setVisible( true );
   }


   // clase interna para el manejo de eventos de los botones
//   private class ButtonHandler implements ActionListener {

      // manejo de eventos del boton

      public void actionPerformed( ActionEvent event )
      {
         JOptionPane.showMessageDialog( null,
            "Usted presiono: " + event.getActionCommand() );
      }


//   }  // fin de la clase privada interna ButtonHandler

}  // fin de la clase PruebaBoton

