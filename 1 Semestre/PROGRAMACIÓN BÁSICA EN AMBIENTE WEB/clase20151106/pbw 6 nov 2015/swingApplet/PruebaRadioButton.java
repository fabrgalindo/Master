
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class PruebaRadioButton extends JApplet {
   private JTextField field;
   private Font plainFont, boldFont, italicFont, boldItalicFont;
   private JRadioButton plainButton, boldButton, italicButton,
      boldItalicButton;
   private ButtonGroup radioGroup;

   public void init()
   {
      Container container = getContentPane();
      container.setLayout( new FlowLayout() );

      field =
         new JTextField( "Observa el cambio del estilo del font", 40 );
      container.add( field );

      plainButton = new JRadioButton( "Simple", true );
      container.add( plainButton );

      boldButton = new JRadioButton( "Realzado", false );
      container.add( boldButton );

      italicButton = new JRadioButton( "Italico", false );
      container.add( italicButton );

      boldItalicButton = new JRadioButton(
         "Realzado/Italico", false );
      container.add( boldItalicButton );

      RadioButtonHandler handler = new RadioButtonHandler();
      plainButton.addItemListener( handler );
      boldButton.addItemListener( handler );
      italicButton.addItemListener( handler );
      boldItalicButton.addItemListener( handler );

      radioGroup = new ButtonGroup();
      radioGroup.add( plainButton );
      radioGroup.add( boldButton );
      radioGroup.add( italicButton );
      radioGroup.add( boldItalicButton );

      plainFont = new Font( "Serif", Font.PLAIN, 14 );
      boldFont = new Font( "Serif", Font.BOLD, 14 );
      italicFont = new Font( "Serif", Font.ITALIC, 14 );
      boldItalicFont =
         new Font( "Serif", Font.BOLD + Font.ITALIC, 14 );
      field.setFont( plainFont );

      setSize( 500, 100 );
      setVisible( true );
   }


   private class RadioButtonHandler implements ItemListener {

      public void itemStateChanged( ItemEvent event )
      {
         if ( event.getSource() == plainButton )
            field.setFont( plainFont );

         else if ( event.getSource() == boldButton )
            field.setFont( boldFont );

         else if ( event.getSource() == italicButton )
            field.setFont( italicFont );

         else if ( event.getSource() == boldItalicButton )
            field.setFont( boldItalicFont );
      }

   }

}

/**************************************************************************
 * (C) Copyright      by Deitel & Associates, Inc. and Prentice Hall.     *
 * All Rights Reserved.                                                   *
 *************************************************************************/
