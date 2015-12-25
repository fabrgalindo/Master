import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class PanelWithComponents {
  public static void main(String[] a) {
    JPanel panel = new JPanel();
    JButton okButton = new JButton("OK");
    panel.add(okButton);
    JButton cancelButton = new JButton("Cancel");
    panel.add(cancelButton);
    JFrame frame = new JFrame("Oval Sample");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.add(panel);
    frame.setSize(300, 200);
    frame.setVisible(true);
  }
}