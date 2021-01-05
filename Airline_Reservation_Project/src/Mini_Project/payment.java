package Mini_Project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Label;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class payment extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					payment frame = new payment();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public payment() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1370,700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Label label = new Label("Payment");
		label.setBackground(new Color(51, 51, 204));
		label.setForeground(new Color(255, 255, 255));
		label.setFont(new Font("Arial Black", Font.BOLD, 20));
		label.setAlignment(Label.CENTER);
		label.setBounds(550, 35, 148, 50);
		contentPane.add(label);
		
		Label label_1 = new Label("Card Details:");
		label_1.setForeground(new Color(51, 51, 204));
		label_1.setAlignment(Label.CENTER);
		label_1.setFont(new Font("Arial Black", Font.BOLD, 16));
		label_1.setBounds(79, 128, 133, 41);
		contentPane.add(label_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 16));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"VISA", "MasterCard", "AmericanExpress"}));
		comboBox.setBounds(248, 178, 148, 41);
		contentPane.add(comboBox);
		
		Label label_2 = new Label("Card Number");
		label_2.setFont(new Font("Arial Black", Font.BOLD, 16));
		label_2.setForeground(new Color(255, 255, 255));
		label_2.setBackground(new Color(0, 51, 204));
		label_2.setAlignment(Label.CENTER);
		label_2.setBounds(64, 295, 148, 41);
		contentPane.add(label_2);
		
		textField = new JTextField();
		textField.setBounds(248, 295, 160, 41);
		contentPane.add(textField);
		textField.setColumns(10);
		
		Label label_3 = new Label("Name on Card");
		label_3.setForeground(new Color(255, 255, 255));
		label_3.setBackground(new Color(0, 51, 204));
		label_3.setFont(new Font("Dialog", Font.BOLD, 16));
		label_3.setAlignment(Label.CENTER);
		label_3.setBounds(64, 381, 148, 41);
		contentPane.add(label_3);
		
		textField_1 = new JTextField();
		textField_1.setBounds(248, 381, 160, 41);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		Label label_4 = new Label("Exipiration Date");
		label_4.setBackground(new Color(0, 51, 204));
		label_4.setForeground(new Color(255, 255, 255));
		label_4.setFont(new Font("Dialog", Font.BOLD, 16));
		label_4.setAlignment(Label.CENTER);
		label_4.setBounds(64, 472, 148, 50);
		contentPane.add(label_4);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sept", "Oct", "Nov", "Dec"}));
		comboBox_1.setBounds(248, 472, 61, 41);
		contentPane.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"2020", "2021", "2022", "2023", "2024", "2025"}));
		comboBox_2.setBounds(310, 472, 69, 41);
		contentPane.add(comboBox_2);
		
		JButton btnNewButton = new JButton("Make Payment");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "Payment Succesful!");
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(586, 483, 148, 39);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Flighttype flight=new Flighttype();
				flight.setVisible(true);
				dispose();
			}
			
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1.setBounds(790, 483, 126, 39);
		contentPane.add(btnNewButton_1);
		
		Label label_5 = new Label("CVV");
		label_5.setForeground(new Color(255, 255, 255));
		label_5.setFont(new Font("Dialog", Font.BOLD, 15));
		label_5.setBackground(new Color(0, 51, 204));
		label_5.setAlignment(Label.CENTER);
		label_5.setBounds(89, 587, 122, 41);
		contentPane.add(label_5);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(248, 587, 78, 41);
		contentPane.add(passwordField);
	}
}
