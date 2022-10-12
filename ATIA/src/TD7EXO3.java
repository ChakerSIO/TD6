import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.Color;

public class TD7EXO3 {

	private JFrame frame;
	private JTextField entree;
	private int min=1;
	private int max=100;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TD7EXO3 window = new TD7EXO3();
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
	public TD7EXO3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		entree = new JTextField();
		entree.setBounds(151, 67, 116, 44);
		frame.getContentPane().add(entree);
		entree.setColumns(10);
		
		int d= new Random().nextInt(max - min)-min;
		
		
		JButton btnNewButton = new JButton("?");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (Integer.parseInt(entree.getText())==d) {
					
				
				}
			}
		});
		btnNewButton.setBounds(151, 139, 116, 55);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Deviner le nombre");
		lblNewLabel.setBounds(14, 82, 91, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JTextArea texte = new JTextArea();
		texte.setBounds(161, 216, 106, 22);
		frame.getContentPane().add(texte);
	}
}
