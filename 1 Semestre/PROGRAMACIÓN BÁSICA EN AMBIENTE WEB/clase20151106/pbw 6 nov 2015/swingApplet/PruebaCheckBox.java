
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class PruebaCheckBox extends JApplet {
   private JTextField field;
   private JCheckBox bold, italic;

   public void init()
   {

      Container container = getContentPane();
      container.setLayout( new FlowLayout() );

      field =
         new JTextField( "Observe el cambio del estilo del font", 40 );
      field.setFont( new Font( "Serif", Font.PLAIN, 14 ) );
      container.add( field );

      bold = new JCheckBox( "Negritas" );
      container.add( bold );

      italic = new JCheckBox( "Italico" );
      container.add( italic );

      CheckBoxHandler handler = new CheckBoxHandler();
      bold.addItemListener( handler );
      italic.addItemListener( handler );

      setSize( 500, 100 );
      setVisible( true );
   }



   private class CheckBoxHandler implements ItemListener {
      private int valBold = Font.PLAIN;
      private int valItalic = Font.PLAIN;


      public void itemStateChanged( ItemEvent event )
      {

         if ( event.getSource() == bold )

            if ( event.getStateChange() == ItemEvent.SELECTED )
               valBold = Font.BOLD;
            else
               valBold = Font.PLAIN;

         if ( event.getSource() == italic )

            if ( event.getStateChange() == ItemEvent.SELECTED )
               valItalic = Font.ITALIC;
            else
               valItalic = Font.PLAIN;

         field.setFont(
            new Font( "Serif", valBold + valItalic, 14 ) );
      }

   }

}

