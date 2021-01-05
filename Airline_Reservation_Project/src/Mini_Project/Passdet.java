package Mini_Project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.Label;
import javax.swing.JTextField;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class Passdet extends JFrame {

	private JPanel contentPane;
	private JTextField details;
	private JTextField firstname;
	private JTextField lastname;
	private JTextField mobile;
	private JTextField email;
	private JTextField departuredate;
	private JTextField departuretime;
	private JTextField returnd;
	private JTextField deptflight;
	private JTextField retflight;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Passdet frame = new Passdet();
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
	public Passdet() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1500, 900);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 153, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Label label = new Label("Enter name and age of all passengers");
		label.setFont(new Font("Dialog", Font.BOLD, 14));
		label.setForeground(new Color(255, 255, 255));
		label.setBackground(new Color(0, 0, 102));
		label.setAlignment(Label.CENTER);
		label.setBounds(1037, 205, 287, 24);
		contentPane.add(label);
		
		
		
		Label label_1 = new Label("First Name");
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Dialog", Font.BOLD, 14));
		label_1.setBackground(new Color(0, 0, 102));
		label_1.setAlignment(Label.CENTER);
		label_1.setBounds(565, 276, 152, 24);
		contentPane.add(label_1);
		
		Label label_2 = new Label("Last Name");
		label_2.setForeground(Color.WHITE);
		label_2.setFont(new Font("Dialog", Font.BOLD, 14));
		label_2.setBackground(new Color(0, 0, 102));
		label_2.setAlignment(Label.CENTER);
		label_2.setBounds(565, 361, 152, 24);
		contentPane.add(label_2);
		
		Label label_3 = new Label("Mobile Number");
		label_3.setForeground(Color.WHITE);
		label_3.setFont(new Font("Dialog", Font.BOLD, 14));
		label_3.setBackground(new Color(0, 0, 102));
		label_3.setAlignment(Label.CENTER);
		label_3.setBounds(565, 450, 152, 24);
		contentPane.add(label_3);
		
		Label label_4 = new Label("Email-ID");
		label_4.setForeground(Color.WHITE);
		label_4.setFont(new Font("Dialog", Font.BOLD, 14));
		label_4.setBackground(new Color(0, 0, 102));
		label_4.setAlignment(Label.CENTER);
		label_4.setBounds(565, 539, 152, 24);
		contentPane.add(label_4);
		
		firstname = new JTextField();
		firstname.setBounds(792, 276, 178, 24);
		contentPane.add(firstname);
		firstname.setColumns(10);
		
		lastname = new JTextField();
		lastname.setColumns(10);
		lastname.setBounds(792, 361, 178, 24);
		contentPane.add(lastname);
		
		mobile = new JTextField();
		mobile.setColumns(10);
		mobile.setBounds(792, 450, 178, 24);
		contentPane.add(mobile);
		
		email = new JTextField();
		email.setColumns(10);
		email.setBounds(792, 539, 178, 24);
		contentPane.add(email);
		
		details = new JTextField();
		details.setBounds(1015, 276, 345, 178);
		contentPane.add(details);
		details.setColumns(10);
		departuredate = new JTextField();
		departuredate.setBounds(236, 294, 152, 20);
		contentPane.add(departuredate);
		departuredate.setColumns(10);
		
		departuretime = new JTextField();
		departuretime.setColumns(10);
		departuretime.setBounds(236, 558, 152, 20);
		contentPane.add(departuretime);
		
		returnd = new JTextField();
		returnd.setColumns(10);
		returnd.setBounds(236, 361, 152, 20);
		contentPane.add(returnd);
		
		deptflight = new JTextField();
		deptflight.setColumns(10);
		deptflight.setBounds(236, 434, 152, 20);
		contentPane.add(deptflight);
		
		retflight = new JTextField();
		retflight.setBounds(236, 492, 152, 20);
		contentPane.add(retflight);
		retflight.setColumns(10);
		
		Label label_5 = new Label("Passenger Details");
		label_5.setForeground(Color.WHITE);
		label_5.setFont(new Font("Dialog", Font.BOLD, 14));
		label_5.setBackground(new Color(0, 0, 102));
		label_5.setAlignment(Label.CENTER);
		label_5.setBounds(1037, 112, 287, 24);
		contentPane.add(label_5);
		
		Label label_6 = new Label("Contact Details");
		label_6.setForeground(Color.WHITE);
		label_6.setFont(new Font("Dialog", Font.BOLD, 14));
		label_6.setBackground(new Color(0, 0, 102));
		label_6.setAlignment(Label.CENTER);
		label_6.setBounds(608, 112, 287, 24);
		contentPane.add(label_6);
		
		Button button = new Button("Submit");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				payment pay=new payment();
				pay.setVisible(true);
			}
		});
		button.setForeground(new Color(255, 255, 255));
		button.setBackground(new Color(0, 0, 102));
		button.setFont(new Font("Dialog", Font.BOLD, 15));
		button.setBounds(792, 636, 105, 40);
		contentPane.add(button);
		
		JButton btnNewButton = new JButton("Save");
		btnNewButton.addActionListener(new ActionListener() {
			private String ticketclass1;

			public void actionPerformed(ActionEvent e) {
				
				try
			    {
			      // create a mysql database connection
			      
			    String firstname1=firstname.getText();
			    String lastname1=lastname.getText();
			    String mobile1=mobile.getText();
			    String email1=email.getText();
			    String details1=details.getText();
			   
			    String tickttype1=departuredate.getText();
			   
			    
			    String retund1=returnd.getText();
			    
			    String deptflight1=deptflight.getText();
			    String retflight1=retflight.getText();
			    String from1=departuretime.getText();
			    
			      Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/miniproject", "root", "h311oR@$h0708");
			    
			      // create a sql date object so we can use it in our INSERT statement
			     

			      // the mysql insert statement
			      PreparedStatement pstmt = conn.prepareStatement( " INSERT INTO passengerdetails ( firstname, lastname, mobile, email,details,departuredate,returnd,deptflight,retflight,departuretime) VALUES (?,?,?,?,?,?,?,?,?,?)");
		
			      
			      pstmt.setString(1,firstname1);
			      pstmt.setString(2,lastname1);
			      pstmt.setString(3,mobile1);
			      pstmt.setString(4,email1);
			      pstmt.setString(5,details1);
			      
			      pstmt.setString(6,tickttype1);
			      pstmt.setString(7,retund1);
			      pstmt.setString(8,deptflight1);
			      pstmt.setString(9,retflight1);
			      pstmt.setString(10,from1);
			      
			     
			      // create the mysql insert preparedstatement
			     
                 
               
			      



			      // execute the preparedstatement
			      pstmt.executeUpdate();

			      
			      conn.close();
			    }
			    catch (Exception e1)
			    {
			      
			      System.err.println(e1.getMessage());
			    }
			
			
			}
			
		});
		btnNewButton.setBounds(673, 646, 89, 23);
		contentPane.add(btnNewButton);
		
		Label departure = new Label("Departure Date");
		departure.setForeground(Color.WHITE);
		departure.setFont(new Font("Dialog", Font.BOLD, 14));
		departure.setBackground(new Color(255, 0, 0));
		departure.setAlignment(Label.CENTER);
		departure.setBounds(33, 294, 152, 24);
		contentPane.add(departure);
		
		Label returndate = new Label("Return Date");
		returndate.setForeground(Color.WHITE);
		returndate.setFont(new Font("Dialog", Font.BOLD, 14));
		returndate.setBackground(new Color(255, 0, 0));
		returndate.setAlignment(Label.CENTER);
		returndate.setBounds(33, 361, 152, 24);
		contentPane.add(returndate);
		
		Label label_15 = new Label("Departing flight Number");
		label_15.setForeground(Color.WHITE);
		label_15.setFont(new Font("Dialog", Font.BOLD, 14));
		label_15.setBackground(new Color(255, 0, 0));
		label_15.setAlignment(Label.CENTER);
		label_15.setBounds(19, 428, 178, 24);
		contentPane.add(label_15);
		
		Label label_16 = new Label("Returning flight number");
		label_16.setForeground(Color.WHITE);
		label_16.setFont(new Font("Dialog", Font.BOLD, 14));
		label_16.setBackground(new Color(255, 0, 0));
		label_16.setAlignment(Label.CENTER);
		label_16.setBounds(19, 492, 178, 24);
		contentPane.add(label_16);
		
		Label label_17 = new Label("Time of departure");
		label_17.setForeground(Color.WHITE);
		label_17.setFont(new Font("Dialog", Font.BOLD, 14));
		label_17.setBackground(new Color(255, 0, 0));
		label_17.setAlignment(Label.CENTER);
		label_17.setBounds(33, 553, 152, 24);
		contentPane.add(label_17);
		
		Label label_7 = new Label("Flight Details");
		label_7.setForeground(Color.WHITE);
		label_7.setFont(new Font("Dialog", Font.BOLD, 14));
		label_7.setBackground(new Color(255, 0, 0));
		label_7.setAlignment(Label.CENTER);
		label_7.setBounds(78, 112, 287, 24);
		contentPane.add(label_7);
	}
}
