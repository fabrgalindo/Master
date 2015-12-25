
// Demostracion de alineamiento de FlowLayout

// Java core packages
import java.awt.*;
import java.awt.event.*;

// Java extension packages
import javax.swing.*;

public class FlowLayoutDemo extends JApplet {
   private JButton leftButton, centerButton, rightButton;
   private Container container;
   private FlowLayout layout;

   // Inicializa GUI y registra escuchas de los botones
   public void init()
   {
      //super( "Demostracion de FlowLayout" );

      layout = new FlowLayout();

      // Obtiene el contenido del panel y su layout
      container = getContentPane();
      container.setLayout( layout );

      // Inicializa boton izquierdo y registra escucha
      leftButton = new JButton( "Izquierda" );

      leftButton.addActionListener(

         // Clase interna anonima
         new ActionListener() {

            // Procesa evento del boton izquierdo
            public void actionPerformed( ActionEvent event )
            {
               layout.setAlignment( FlowLayout.LEFT );

               // re-alinea componentes agregados
               layout.layoutContainer( container );
            }

         }  // fin de la clase anonima

      ); // fin de la llamada a addActionListener

      container.add( leftButton );

      // inicializa boton central y registra escucha
      centerButton = new JButton( "Centro" );

      centerButton.addActionListener(

         // clase interna anonima
         new ActionListener() {

            // procesa evento del boton central
            public void actionPerformed( ActionEvent event )
            {
               layout.setAlignment( FlowLayout.CENTER );

               // re-alinea componenetes adicionados
               layout.layoutContainer( container );
            }
         }
      );

      container.add( centerButton );

      // inicializa boton derecho y registra escucha
      rightButton = new JButton( "Derecha" );

      rightButton.addActionListener(

         // clase interna anomina
         new ActionListener() {

            // procesa evento del boton derecho
            public void actionPerformed( ActionEvent event )
            {
               layout.setAlignment( FlowLayout.RIGHT );

               // re-alinea componentes adicionados
               layout.layoutContainer( container );
            }
         }
      );

      container.add( rightButton );

      setSize( 300, 75 );
      setVisible( true );
   }


}  // fin de  clase FlowLayoutDemo


