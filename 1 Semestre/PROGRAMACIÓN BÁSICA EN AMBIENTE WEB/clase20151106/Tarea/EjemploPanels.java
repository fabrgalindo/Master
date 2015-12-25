import java.awt.*;
import java.applet.*;
import javax.swing.*;
 
public class EjemploPanels extends JApplet {
 
    public void init() {
       Container c = getContentPane();
 
        JPanel p1 = new JPanel();
        p1.setLayout(new BorderLayout());
        p1.add(new JButton("Etiqueta 1"), BorderLayout.NORTH);
       // p1.add(new JButton("B"), BorderLayout.WEST);
        //p1.add(new JButton("C"), BorderLayout.CENTER);
        //p1.add(new JButton("D"), BorderLayout.EAST);
        //p1.add(new JButton("E"), BorderLayout.SOUTH);
 
        JPanel p2 = new JPanel();
        p2.setLayout(new GridLayout(2, 2));
        p2.add(new JButton("Etiqueta 2"));
        p2.add(new JButton("Etiqueta 3"));
        p2.add(new JButton("Etiqueta 4"));
        p2.add(new JButton("Etiqueta 5"));

 
        JPanel p3 = new JPanel();
        p3.setLayout(new BorderLayout());
        p3.add(new JButton("Etiqueta 6"),BorderLayout.SOUTH);
 
        c.setLayout(new BorderLayout());
        c.add(p1, BorderLayout.NORTH);
        c.add(p2, BorderLayout.CENTER);
        c.add(p3, BorderLayout.SOUTH);
 
        //pack();
        setVisible(true);
    }
}