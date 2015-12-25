
import java.awt.*;
import java.awt.event.*;


import javax.swing.*;

public class SeleccionMultiple extends JApplet {
   private JList colorList, copyList;
   private JButton copyButton;

   private String colorNames[] = { "Negro", "Azul", "Cyan",
      "Gris Oscuro", "Gris", "Verde", "Gris Claro", "Magenta",
      "Naranja", "Rosa", "Rojo", "Blanco", "Amarillo" };


   public void init()
   {

      Container container = getContentPane();
      container.setLayout( new FlowLayout() );


      colorList = new JList( colorNames );
      colorList.setVisibleRowCount( 5 );
      colorList.setFixedCellHeight( 15 );
      colorList.setSelectionMode(
      ListSelectionModel.MULTIPLE_INTERVAL_SELECTION );
      container.add( new JScrollPane( colorList ) );


      copyButton = new JButton( "Copiar >>>" );

      copyButton.addActionListener(


         new ActionListener() {

            public void actionPerformed( ActionEvent event )
            {

               copyList.setListData(
                  colorList.getSelectedValues() );
            }

         }

      );

      container.add( copyButton );

      copyList = new JList( );
      copyList.setVisibleRowCount( 5 );
      copyList.setFixedCellWidth( 100 );
      copyList.setFixedCellHeight( 15 );
      copyList.setSelectionMode(
         ListSelectionModel.SINGLE_INTERVAL_SELECTION );
      container.add( new JScrollPane( copyList ) );

      setSize( 500, 150 );
      setVisible( true );
   }


}

