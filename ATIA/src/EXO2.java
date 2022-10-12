import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class EXO2 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textFieldTotal;
	private JTextField textField1;
	private int operation;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EXO2 window = new EXO2();
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
	public EXO2() {
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
		
		textField = new JTextField();
		textField.setBounds(10, 124, 46, 44);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textFieldTotal = new JTextField();
		textFieldTotal.setBounds(340, 124, 96, 44);
		frame.getContentPane().add(textFieldTotal);
		textFieldTotal.setColumns(10);
		
		textField1 = new JTextField();
		textField1.setBounds(178, 124, 46, 44);
		frame.getContentPane().add(textField1);
		textField1.setColumns(10);
		
		JButton btnNewButton = new JButton("=");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int total=0;
				switch (operation) {
				case 1:
				{
					total=Integer.parseInt(textField.getText())+Integer.parseInt(textField1.getText());
					System.out.println("case 1");
					break;
				}
				case 2:
				{
					total=Integer.parseInt(textField.getText())-Integer.parseInt(textField1.getText());
					System.out.println("case 2");
					break;
				}
				case 3:
				{
					total=Integer.parseInt(textField.getText())/Integer.parseInt(textField1.getText());
					System.out.println("case 3");
					break;
				}
				case 4:
				{
					total=Integer.parseInt(textField.getText())*Integer.parseInt(textField1.getText());
					System.out.println("case 4");
					break;
				}							
				}

				System.out.println(total);
				textFieldTotal.setText(String.valueOf(total));
				System.out.println("operation="+operation);

			}
		});
		btnNewButton.setBounds(241, 123, 89, 45);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("+");
		btnNewButton_1.setBackground(new Color(128, 255, 128));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				operation=1;
			}
		});
		btnNewButton_1.setBounds(77, 61, 68, 31);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("-");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operation=2;
			}
		});
		btnNewButton_2.setBounds(77, 103, 68, 31);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("/");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operation=3;
			}
		});
		btnNewButton_3.setBounds(77, 145, 68, 31);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("*");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operation=4;
			}
		});
		btnNewButton_4.setBounds(77, 187, 68, 31);
		frame.getContentPane().add(btnNewButton_4);
	}
}
