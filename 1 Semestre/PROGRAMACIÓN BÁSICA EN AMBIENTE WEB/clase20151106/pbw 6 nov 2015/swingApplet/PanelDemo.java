
// Uso de un JPanel para ayudar a distribuir componentes

// Java core packages
import java.awt.*;
import java.awt.event.*;

// Java extension packages
import javax.swing.*;

public class PanelDemo extends JApplet{
   private JPanel buttonPanel;
   private JButton buttons[];

   // inicializa GUI
   public void init()
   {
      //super( "Demostracion de Panel" );

      // obtiene el contenido del panel
      Container container = getContentPane();

      // crea el contenido del panel
      buttons = new JButton[ 5 ];

      // inicializa el panel y establece su layout
      buttonPanel = new JPanel();
      buttonPanel.setLayout(
         new GridLayout( 1, buttons.length ) );

      // crea y agrega botones
      for ( int count = 0; count < buttons.length; count++ ) {
         buttons[ count ] =
            new JButton( "Boton " + ( count + 1 ) );
         buttonPanel.add( buttons[ count ] );
      }

      container.add( buttonPanel, BorderLayout.SOUTH );

      setSize( 425, 150 );
      setVisible( true );
   }


}  // fin de la clase PanelDemo

