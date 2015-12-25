
// Demostracion de GridLayout.

// Java core packages
import java.awt.*;
import java.awt.event.*;

// Java extension packages
import javax.swing.*;

public class GridLayoutDemo extends JApplet
   implements ActionListener {

   private JButton buttons[];
   private String names[] =
      { "uno", "dos", "tres", "cuatro", "cinco", "seis" };
   private boolean toggle = true;
   private Container container;
   private GridLayout grid1, grid2;

   // inicializa GUI
   public void init()
   {
      //super( "GridLayout Demo" );

      // inicializa layouts
      grid1 = new GridLayout( 2, 3, 5, 5 );
      grid2 = new GridLayout( 3, 2 );

      // obtine el contenido del panel y establece su layout
      container = getContentPane();
      container.setLayout( grid1 );

      // crea y agrega botones
      buttons = new JButton[ names.length ];

      for ( int count = 0; count < names.length; count++ ) {
         buttons[ count ] = new JButton( names[ count ] );
         buttons[ count ].addActionListener( this );
         container.add( buttons[ count ] );
      }

      setSize( 300, 150 );
      setVisible( true );
   }

   // maneja eventos de los botones intercambiando layouts
   public void actionPerformed( ActionEvent event )
   {
      if ( toggle )
         container.setLayout( grid2 );
      else
         container.setLayout( grid1 );

      toggle = !toggle;   // pone switch a un valor opuesto
      // recalcula el layout del contenedor basado en
      // el administrador de layout actual para el Container
      // y el conjunto de componentes GUI mostrados
      container.validate();
   }



}  // fin de la clase GridLayoutDemo

