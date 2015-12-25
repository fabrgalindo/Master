
// Demonstracion de BorderLayout.

// Java core packages
import java.awt.*;
import java.awt.event.*;

// Java extension packages
import javax.swing.*;

public class BorderLayoutDemo extends JApplet
   implements ActionListener {

   private JButton buttons[];
   private String names[] = { "Oculta Norte", "Oculta Sur",
      "Oculta Este", "Oculta Oeste", "Oculta Centro" };
   private BorderLayout layout;

   // inicializa GUI y manejo de enventos
   public void init()
   {
      //super( "Demostracion de BorderLayout" );

      layout = new BorderLayout( 5, 5 );

      // obtiene el contenido del panel y su layout
      Container container = getContentPane();
      container.setLayout( layout );

      // instacia los objetos de los botones
      buttons = new JButton[ names.length ];

      for ( int count = 0; count < names.length; count++ ) {
         buttons[ count ] = new JButton( names[ count ] );
         buttons[ count ].addActionListener( this );
      }

      // coloca los botones en el BorderLayout, el orden no es importante
      container.add( buttons[ 0 ], BorderLayout.NORTH );
      container.add( buttons[ 1 ], BorderLayout.SOUTH );
      container.add( buttons[ 2 ], BorderLayout.EAST );
      container.add( buttons[ 3 ], BorderLayout.WEST );
      container.add( buttons[ 4 ], BorderLayout.CENTER );

      setSize( 300, 200 );
      setVisible( true );
   }

   // maneja eventos de los botones
   public void actionPerformed( ActionEvent event )
   {
      for ( int count = 0; count < buttons.length; count++ )

         if ( event.getSource() == buttons[ count ] )
            buttons[ count ].setVisible( false );
         else
            buttons[ count ].setVisible( true );

      // re-distribuye el contenido del panel
      layout.layoutContainer( getContentPane() );
   }



}  // fin de la clase BorderLayoutDemo

