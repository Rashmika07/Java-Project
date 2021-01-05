package Mini_Project;

import java.awt.BorderLayout;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import java.awt.Component;
import java.awt.Label;


public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField username1;
	private JPasswordField password1;
	private Component lblNewLabel;
	
	private JTextField username;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1370, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
contentPane.setLayout(null);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("booktickets.com");
		lblNewLabel.setFont(new Font("Forte", Font.PLAIN, 20));
		lblNewLabel.setBounds(10, -62, 377, 165);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Username:-");
		lblNewLabel_1.setFont(new Font("Mongolian Baiti", Font.PLAIN, 30));
		lblNewLabel_1.setBounds(396, 204, 236, 72);
		contentPane.add(lblNewLabel_1);
		
		username1 = new JTextField();
		username1.setForeground(new Color(0, 0, 0));
		username1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		username1.setBounds(569, 216, 357, 41);
		contentPane.add(username1);
		username1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Password:-");
		lblNewLabel_2.setFont(new Font("Mongolian Baiti", Font.PLAIN, 30));
		lblNewLabel_2.setBounds(394, 286, 165, 48);
		contentPane.add(lblNewLabel_2);
		
		password1 = new JPasswordField();
		password1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		password1.setBounds(569, 295, 357, 40);
		contentPane.add(password1);
		

		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.addActionListener(new ActionListener() {
			private Component frame;

			public void actionPerformed(ActionEvent e)
			{
				String username2=username1.getText();
				String password2=password1.getText();
				 try {
					 Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/miniproject", "root", "h311oR@$h0708");
					PreparedStatement pstmt=(PreparedStatement)conn.prepareStatement("Select username,password from user where username=? and password=?");

					 pstmt.setString(1, username2);
					 pstmt.setString(2, password2);
					 ResultSet rs=pstmt.executeQuery();
					 if(rs.next()) {
						 dispose();
						 Flighttype flight= new Flighttype();
							flight.setVisible(true);
					
					 }
					 else {
						 JOptionPane.showMessageDialog(btnNewButton, "Incorrect Username or Password!");
					 }

				 
				 
				 } catch (Exception e1) {
					// TODO Auto-generated catch block
					 System.err.println(e1.getMessage());
				}
				
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 19));
		btnNewButton.setBounds(609, 420, 272, 61);
		contentPane.add(btnNewButton);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(234, 82, 876, 506);
		contentPane.add(panel);
		
		JLabel lblNewLabel_3 = new JLabel("LOGIN");
		panel.add(lblNewLabel_3);
		lblNewLabel_3.setFont(new Font("Bookman Old Style", Font.PLAIN, 40));
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(0, 0, 0, 0);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Register");
		btnNewButton_2.setBackground(new Color(192, 192, 192));
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_2.setForeground(new Color(0, 0, 153));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Registration window = new Registration();
				window.frame.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(1170, 591, 103, 31);
		contentPane.add(btnNewButton_2);
		
		Label label = new Label("New User?");
		label.setAlignment(Label.CENTER);
		label.setFont(new Font("Dialog", Font.BOLD, 17));
		label.setForeground(new Color(0, 0, 102));
		label.setBackground(new Color(192, 192, 192));
		label.setBounds(1170, 526, 103, 40);
		contentPane.add(label);
	}
	

	public Font getLblNewLabelFont() {
		return lblNewLabel.getFont();
	}
	public void setLblNewLabelFont(Font font) {
		lblNewLabel.setFont(font);
	}
	}


