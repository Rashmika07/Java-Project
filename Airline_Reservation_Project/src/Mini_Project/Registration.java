package Mini_Project;

import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JSplitPane;
import javax.swing.JDesktopPane;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.CompoundBorder;



import javax.swing.border.BevelBorder;
import java.awt.Color;


	/**
	 * Launch the application.
	 */


import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Wrapper;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Label;
import java.awt.Button;

public class Registration {

	JFrame frame;
	private JTextField name;
	private JTextField dob;
	private JTextField username;
	private JPasswordField password;
	protected JLabel txtUser;
	protected JLabel txtPassword;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registration window = new Registration();
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
	public Registration() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1370,700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("booktickets.com");
		lblNewLabel.setFont(new Font("Forte", Font.PLAIN, 20));
		lblNewLabel.setBounds(20, 0, 277, 57);
		frame.getContentPane().add(lblNewLabel);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBounds(255, 142, 810, 380);
		frame.getContentPane().add(desktopPane);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("Password:-");
		lblNewLabel_2_1_1_1.setBounds(69, 282, 206, 51);
		desktopPane.add(lblNewLabel_2_1_1_1);
		lblNewLabel_2_1_1_1.setFont(new Font("Mongolian Baiti", Font.PLAIN, 40));
		
		username = new JTextField();
		username.setColumns(10);
		username.setBounds(285, 204, 422, 39);
		desktopPane.add(username);
		
		password = new JPasswordField();
		password.setBounds(285, 282, 422, 39);
		desktopPane.add(password);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Username:-");
		lblNewLabel_2_1_1.setBounds(69, 204, 218, 51);
		desktopPane.add(lblNewLabel_2_1_1);
		lblNewLabel_2_1_1.setFont(new Font("Mongolian Baiti", Font.PLAIN, 40));
		
		JLabel lblNewLabel_2_1 = new JLabel("DOB:-");
		lblNewLabel_2_1.setBounds(69, 123, 166, 51);
		desktopPane.add(lblNewLabel_2_1);
		lblNewLabel_2_1.setFont(new Font("Mongolian Baiti", Font.PLAIN, 40));
		
		JLabel lblNewLabel_2 = new JLabel("Name:-");
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setBounds(69, 42, 166, 51);
		desktopPane.add(lblNewLabel_2);
		lblNewLabel_2.setFont(new Font("Mongolian Baiti", Font.PLAIN, 40));
		
		name = new JTextField();
		name.setBounds(285, 42, 422, 39);
		desktopPane.add(name);
		name.setColumns(10);
		
		dob = new JTextField();
		dob.setBounds(285, 123, 422, 39);
		desktopPane.add(dob);
		dob.setColumns(10);
		
		JButton btnNewButton = new JButton("REGISTER");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				JOptionPane.showMessageDialog(null, "You have successfully registered!!");
		    
	
				frame.dispose();
				Login log= new Login();
				log.setVisible(true);
				
				
				
				}
			});
			
		
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton.setBounds(616, 546, 301, 57);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Save");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				
					
					try
				    {
				      // create a mysql database connection
				      
				     
				    String name1=name.getText();
				    String dob1=dob.getText();
				    String uname1=username.getText();
				    String password2=password.getText();
				      Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/miniproject", "root", "h311oR@$h0708");
				    
				      // create a sql date object so we can use it in our INSERT statement
				     

				      // the mysql insert statement
				      PreparedStatement pstmt = conn.prepareStatement("INSERT INTO user(name, dob, username, password) VALUES(?,?,?,?)");
			

				      // create the mysql insert preparedstatement
				      pstmt.setString(1,name1);
                      pstmt.setString(2,dob1);
                      pstmt.setString(3,uname1);
                      pstmt.setString(4,password2);
                     
                   
				      



				      // execute the preparedstatement
				      pstmt.execute();

				      
				      conn.close();
				    }
				    catch (Exception e1)
				    {
				      
				      System.err.println(e1.getMessage());
				    }
				
				
				}

			private JButton setText(String text) {
				// TODO Auto-generated method stub
				return null;
			}
			});
			
		btnNewButton_1.setBounds(215, 561, 100, 33);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("User Registration");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Bookman Old Style", Font.PLAIN, 28));
		lblNewLabel_1.setBounds(497, 35, 291, 72);
		frame.getContentPane().add(lblNewLabel_1);
		
		Button button = new Button(" Click here to log in");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.dispose();
				Login log= new Login();
				log.setVisible(true);
				
				
			}
		});
		button.setFont(new Font("Dialog", Font.BOLD, 12));
		button.setForeground(new Color(0, 0, 51));
		button.setBackground(new Color(192, 192, 192));
		button.setBounds(1177, 546, 151, 48);
		frame.getContentPane().add(button);
		
		Label label = new Label("Already a User?");
		label.setForeground(new Color(0, 0, 102));
		label.setFont(new Font("Dialog", Font.BOLD, 14));
		label.setBackground(new Color(192, 192, 192));
		label.setAlignment(Label.CENTER);
		label.setBounds(1177, 505, 143, 22);
		frame.getContentPane().add(label);
	

}
}


	