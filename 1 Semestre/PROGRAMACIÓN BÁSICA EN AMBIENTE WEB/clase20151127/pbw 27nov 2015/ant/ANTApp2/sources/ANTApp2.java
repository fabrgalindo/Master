/**
  * <p>
  *
  */
public class ANTApp2 extends javax.swing.JFrame {

    /**
      *	<p>
      *		Esta rutina es el constructor que inicializa la fabricaci&oacute;n
      *		de un <i>frame</i> en Swing.
      * </p>
      *
      */
    public ANTApp2() {
        initComponents();
    }

    /**
      * <p>
      *		Este m&eacute;todo inicializa la forma
      *	</p>
      *
      */
    private void initComponents() {

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });

        pack();
    } // fin initComponents

	/**
	  * <p>
	  *		Este m&eacute;todo es un detonador de la terminaci&oacute;n
	  *		de un frame
	  * </p>
	  *
	  */
    private void exitForm(java.awt.event.WindowEvent evt) {
        System.exit(0);
    } // fin exitForm

	/**
	  * <p>
	  *		Rutina principal de la aplicaci&aacute;n
	  *	</p>
	  *
	  */
	public static void main(String args[]) {

		new ANTApp2().show();

	} // fin foo main

} // end class AntApp2


