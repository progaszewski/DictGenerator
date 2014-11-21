package pl.asseco.dict.generator;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


public class Start 
{
	public static void main( String[] args )
    {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
				} catch (ClassNotFoundException | InstantiationException
						| IllegalAccessException
						| UnsupportedLookAndFeelException e) {
					
					JOptionPane.showMessageDialog(new JFrame(), e.toString(), "Error!", JOptionPane.ERROR_MESSAGE);

				}
				new Generator();
			}
		});
    }
}
