
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class PruebaComboBox extends JApplet {
   private JComboBox imagesComboBox;
   private JLabel label;

   private String names[] =
      { "bug1.gif", "bug2.gif",  "travelbug.gif", "buganim.gif" };
   private Icon icons[] = { new ImageIcon( names[ 0 ] ),
      new ImageIcon( names[ 1 ] ), new ImageIcon( names[ 2 ] ),
      new ImageIcon( names[ 3 ] ) };

   public void init()
   {

      // obteniendo el contenido del panel y colocando su layout
      Container container = getContentPane();
      container.setLayout( new FlowLayout() );

      // inicializando JComboBox y registrando su manejador de eventos
      imagesComboBox = new JComboBox( names );
      imagesComboBox.setMaximumRowCount( 3 );

      // Ojo -- ver donde termina la definicion del listener
      imagesComboBox.addItemListener(

         // clase interna anonima para manejar eventos de JComboBox
         new ItemListener() {

            // manija de eventos de JComboBox
            public void itemStateChanged( ItemEvent event )
            {
               // determina si check box es seleccionado
			   if ( event.getStateChange() == ItemEvent.SELECTED )
                  label.setIcon( icons[
                     imagesComboBox.getSelectedIndex() ] );
            }

         }

      );

      container.add( imagesComboBox );

      // inicializa JLabel para desplegar ImageIcons
      label = new JLabel( icons[ 0 ] );
      container.add( label );

      setSize( 350, 100 );
      setVisible( true );
   }


}  // fin de la clase ComboBoxTest


