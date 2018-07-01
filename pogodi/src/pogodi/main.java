package pogodi;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import classes.pogodiLogic;
public class main {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main window = new main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public main() {
		initialize();
	}
 pogodiLogic pogodirec=new pogodiLogic(); 
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(30, 41, 339, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setBounds(132, 83, 178, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnPogodi = new JButton("pogodi");
		btnPogodi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				pogodirec.setSeq(textField.getText());
				pogodirec.proveri();
				textField_1.setText(String.valueOf(pogodirec.getStanje()));
				
			}
		});
		btnPogodi.setBounds(157, 128, 89, 23);
		frame.getContentPane().add(btnPogodi);
	}
}
