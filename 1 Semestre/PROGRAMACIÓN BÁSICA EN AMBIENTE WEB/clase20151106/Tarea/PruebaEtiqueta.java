
import java.awt.*;
import java.awt.event.*;


import javax.swing.*;

public class PruebaEtiqueta extends JApplet {
   private JLabel etiq1;
   private JLabel etiq2;
   private JLabel etiq3;
   private JLabel etiq4;
   private JLabel etiq5;
   private JLabel etiq6;
	private BorderLayout layout;
   // set up GUI
   public void init()
   {
		layout = new BorderLayout( 4, 4 );

      Container container = getContentPane();
      container.setLayout( layout );


      etiq1 = new JLabel( "Etiqueta 1",JLabel.CENTER );
	  etiq2 = new JLabel( "<html><body>Etiqueta 2 <br><br> Etiqueta 4 </body></html>",JLabel.CENTER );
	  etiq3 = new JLabel( "<html><body>Etiqueta 3 <br><br> Etiqueta 5 </body></html>",JLabel.CENTER );
	  
	  //etiq4 = new JLabel( "Etiqueta 4" );
	  //etiq5 = new JLabel( "Etiqueta 5" );
	  etiq6 = new JLabel( "Etiqueta 6",JLabel.CENTER );
      //etiq1.setToolTipText( "Esta es la etiqueta 1" );
      container.add( etiq1, BorderLayout.NORTH );
	  container.add( etiq6, BorderLayout.SOUTH );
	  container.add( etiq2, BorderLayout.WEST );
	 container.add( etiq3, BorderLayout.EAST );


      setSize( 275, 170 );
      setVisible( true );
   }


}

