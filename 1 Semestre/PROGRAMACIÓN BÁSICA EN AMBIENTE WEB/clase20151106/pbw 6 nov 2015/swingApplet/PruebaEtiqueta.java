
import java.awt.*;
import java.awt.event.*;


import javax.swing.*;

public class PruebaEtiqueta extends JApplet {
   private JLabel etiq1;

   // set up GUI
   public void init()
   {

      Container container = getContentPane();
      container.setLayout( new FlowLayout() );


      etiq1 = new JLabel( "Etiqueta con texto" );
      etiq1.setToolTipText( "Esta es la etiqueta 1" );
      container.add( etiq1 );

      setSize( 275, 170 );
      setVisible( true );
   }


}

