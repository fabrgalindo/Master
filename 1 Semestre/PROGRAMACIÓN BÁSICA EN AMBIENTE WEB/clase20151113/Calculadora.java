import java.awt.*;
import java.applet.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
 
public class Calculadora extends JApplet implements ActionListener, FocusListener {
	
 JFormattedTextField txtFldInput1,txtFldInput2; 
 JFormattedTextField previouslyFocusedTextBox = txtFldInput1;
 JButton btnSuma,btnResta,btnMult ;
 String ls_operando1="", ls_operando2="";
 long li_op1,li_op2;
    public void init() {
       Container c = getContentPane();
 
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout( 2, 1 ));
		txtFldInput1 = new JFormattedTextField (new Long(0));
		txtFldInput1.setFocusable(true);
		txtFldInput1.addFocusListener(this);
		txtFldInput2 = new JFormattedTextField (new Long(0));
		txtFldInput2.setFocusable(true);
		txtFldInput2.addFocusListener(this);
		p1.add(txtFldInput1);
		p1.add(txtFldInput2);
txtFldInput1.addActionListener( this );

        JPanel p2 = new JPanel();
        p2.setLayout( new GridLayout( 3, 4 ));
		
		JButton btn0 = new JButton("0");
		JButton btn1 = new JButton("1");
		JButton btn2 = new JButton("2");
		JButton btn3 = new JButton("3");
		JButton btn4 = new JButton("4");
		JButton btn5 = new JButton("5");
		JButton btn6 = new JButton("6");
		JButton btn7 = new JButton("7");
		JButton btn8 = new JButton("8");
		JButton btn9 = new JButton("9");
		btnSuma = new JButton("+");
		btnResta = new JButton("-");
		btnMult = new JButton("*");
        
		
        p2.add(btn1);
        p2.add(btn2);
        p2.add(btn3);
		p2.add(btnSuma);
        p2.add(btn4);
		p2.add(btn5);
        p2.add(btn6);
		p2.add(btnResta);
        p2.add(btn7);
		p2.add(btn8);
		p2.add(btn9);
		p2.add(btnMult);
 
		JPanel p3 = new JPanel();
        p3.setLayout(new BorderLayout());
        p3.add(btn0, BorderLayout.SOUTH);
		
        c.setLayout(new BorderLayout());
        c.add(p1, BorderLayout.NORTH);
        c.add(p2, BorderLayout.CENTER);
        c.add(p3, BorderLayout.SOUTH);
 
 
		btn0.addActionListener( this );
		btn1.addActionListener( this );
		btn2.addActionListener( this );
		btn3.addActionListener( this );
		btn4.addActionListener( this );
		btn5.addActionListener( this );
		btn6.addActionListener( this );
		btn7.addActionListener( this );
		btn8.addActionListener( this );
		btn9.addActionListener( this );
		
		btnSuma.addActionListener( this );
		btnResta.addActionListener( this );
		btnMult.addActionListener( this );
 

        setVisible(false);

    }
	
	public void actionPerformed( ActionEvent event )
	{

		
		JButton b = (JButton)event.getSource();
		if( b.equals(btnSuma)||b.equals(btnResta)||b.equals(btnMult) )
		{
			try
			{
			ls_operando1 = txtFldInput1.getText();
			ls_operando2 = txtFldInput2.getText();
			li_op1=  Long.parseLong(ls_operando1.replace(",", ""));
			li_op2=  Long.parseLong(ls_operando2.replace(",", ""));
			
			if( b.equals(btnSuma) )
			{
				JOptionPane.showMessageDialog( null,"Resultado: " + (li_op1+li_op2)) ;
			}
			else if( b.equals(btnResta) )
			{
				JOptionPane.showMessageDialog( null,"Resultado: " + (li_op1-li_op2)) ;
			}
			else if( b.equals(btnMult) )
			{
				JOptionPane.showMessageDialog( null,"Resultado: " + (li_op1*li_op2)) ;
			}
			}
			catch(NumberFormatException ex)
			{
				JOptionPane.showMessageDialog( null,"Overflow") ;
				
			}
		}
		else
		{
			if(previouslyFocusedTextBox.equals(txtFldInput1))
			{				
				ls_operando1=ls_operando1+event.getActionCommand();

				this.txtFldInput1.setText(ls_operando1);
			} 
			else if(previouslyFocusedTextBox.equals(txtFldInput2))
			{
				ls_operando2=ls_operando2+event.getActionCommand();
				this.txtFldInput2.setText(ls_operando2);
			}
		}		
	}
        public void focusGained(FocusEvent ev) {
           if(ev.getSource() instanceof JFormattedTextField) {
                previouslyFocusedTextBox = (JFormattedTextField) ev.getSource();
            }
        }
        public void focusLost(FocusEvent ev) {
        }

}