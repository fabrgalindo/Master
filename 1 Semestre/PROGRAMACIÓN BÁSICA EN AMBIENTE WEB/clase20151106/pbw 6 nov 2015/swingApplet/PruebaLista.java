
import java.awt.*;


import javax.swing.*;
import javax.swing.event.*;

public class PruebaLista extends JApplet {
   private JList colorList;
   private Container container;

   private String colorNames[] = { "Negro", "Azul", "Cyan",
      "Gris Oscuro", "Gris", "Verde", "Gris Claro", "Magenta",
      "Naranja", "Rosa", "Rojo", "Blanco", "Amarillo" };

   private Color colors[] = { Color.black, Color.blue,
      Color.cyan, Color.darkGray, Color.gray, Color.green,
      Color.lightGray, Color.magenta, Color.orange, Color.pink,
      Color.red, Color.white, Color.yellow };

   public void init()
   {

      container = getContentPane();
      container.setLayout( new FlowLayout() );


      colorList = new JList( colorNames );
      colorList.setVisibleRowCount( 5 );


      colorList.setSelectionMode(
         ListSelectionModel.SINGLE_SELECTION );
         // Otras constantes son:
         //SINGLE_INTERVAL_SELECTION
         //MULTIPLE_INTERVAL_SELECTION


      container.add( new JScrollPane( colorList ) );


      colorList.addListSelectionListener(


         new ListSelectionListener() {

            public void valueChanged( ListSelectionEvent event )
            {
               container.setBackground(
                  colors[ colorList.getSelectedIndex() ] );
            }

         }

      );

      setSize( 350, 150 );
      setVisible( true );
   }


}  // fin class ListTest

