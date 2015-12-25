
// Demostracion de GridLayout.

// Java core packages
import java.awt.*;
import java.awt.event.*;

// Java extension packages
import javax.swing.*;

public class OvalPanelApplet extends JApplet
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

      // obtine el contenido del panel y establece su layout
      container = getContentPane();
      container.setLayout( new GridLayout( 2, 2 ) );

      // crea y agrega botones
      Color colors[] = { Color.RED, Color.BLUE, Color.GREEN, Color.YELLOW };
      for (int i = 0; i < 4; i++) {
         OvalPanel panel = new OvalPanel(colors[i]);
         panel.add(new JButton("asdf"));
         container.add(panel);
      }
      setSize( 300, 150 );
      setVisible( true );
   }

   // maneja eventos de los botones intercambiando layouts
   public void actionPerformed( ActionEvent event )
   {
      // recalcula el layout del contenedor basado en
      // el administrador de layout actual para el Container
      // y el conjunto de componentes GUI mostrados
      container.validate();
   }



}  // fin de la clase GridLayoutDemo

