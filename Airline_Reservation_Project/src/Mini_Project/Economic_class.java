package Mini_Project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.SwingConstants;
import javax.swing.JToolBar;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;

public class Economic_class extends JFrame {

	private JPanel contentPane;
	private JTextField txtEconomyClass;
	private JTextField txtBestDepartingFlights;
	private JTextField txtBestReturningFlights;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Economic_class frame = new Economic_class();
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
	public Economic_class() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0,1370,700);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(51, 204, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BookTickets.com");
		lblNewLabel.setForeground(new Color(0, 255, 0));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 22));
		lblNewLabel.setBounds(23, 11, 188, 28);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Domestic Booking");
		lblNewLabel_1.setForeground(new Color(0, 255, 255));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(552, 11, 216, 28);
		contentPane.add(lblNewLabel_1);
		
		txtEconomyClass = new JTextField();
		txtEconomyClass.setForeground(new Color(0, 0, 255));
		txtEconomyClass.setBackground(new Color(0, 255, 127));
		txtEconomyClass.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtEconomyClass.setHorizontalAlignment(SwingConstants.CENTER);
		txtEconomyClass.setText("Economy Class");
		txtEconomyClass.setBounds(33, 68, 140, 28);
		contentPane.add(txtEconomyClass);
		txtEconomyClass.setColumns(10);
		
		txtBestDepartingFlights = new JTextField();
		txtBestDepartingFlights.setForeground(new Color(0, 0, 255));
		txtBestDepartingFlights.setBackground(new Color(64, 224, 208));
		txtBestDepartingFlights.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtBestDepartingFlights.setHorizontalAlignment(SwingConstants.CENTER);
		txtBestDepartingFlights.setText(" Departing Flights");
		txtBestDepartingFlights.setBounds(23, 118, 216, 28);
		contentPane.add(txtBestDepartingFlights);
		txtBestDepartingFlights.setColumns(10);
		
		txtBestReturningFlights = new JTextField();
		txtBestReturningFlights.setForeground(new Color(0, 0, 255));
		txtBestReturningFlights.setBackground(new Color(64, 224, 208));
		txtBestReturningFlights.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtBestReturningFlights.setHorizontalAlignment(SwingConstants.CENTER);
		txtBestReturningFlights.setText(" Returning Flights");
		txtBestReturningFlights.setBounds(783, 118, 236, 28);
		contentPane.add(txtBestReturningFlights);
		txtBestReturningFlights.setColumns(10);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton(" AirAsia AA 365-Departure 20:00,Arrival 22:00,Duration 2 h 00m,Fare Rs.14,290");
		rdbtnNewRadioButton.setForeground(new Color(255, 255, 255));
		rdbtnNewRadioButton.setBackground(new Color(255, 99, 71));
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnNewRadioButton.setBounds(23, 164, 538, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton(" IndiGo IG 322-Departure 21:00,Arrival 22:40,Duration 1h 40m,Fare Rs.10,615");
		rdbtnNewRadioButton_1.setForeground(new Color(255, 255, 255));
		rdbtnNewRadioButton_1.setBackground(new Color(255, 99, 71));
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnNewRadioButton_1.setBounds(23, 200, 538, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("SpiceJet SJ 200-Departure 15:00,Arrival 17:05,Duration 2h 05m,Fare Rs.8,330");
		rdbtnNewRadioButton_2.setForeground(new Color(255, 255, 255));
		rdbtnNewRadioButton_2.setBackground(new Color(255, 99, 71));
		rdbtnNewRadioButton_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnNewRadioButton_2.setBounds(23, 233, 538, 23);
		contentPane.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton(" GoAir G8 418-Departure 05:30,Arrival 07:10,Duration 1h 50m,Fare Rs.15,150");
		rdbtnNewRadioButton_3.setForeground(new Color(255, 255, 255));
		rdbtnNewRadioButton_3.setBackground(new Color(255, 99, 71));
		rdbtnNewRadioButton_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnNewRadioButton_3.setBounds(23, 270, 538, 23);
		contentPane.add(rdbtnNewRadioButton_3);
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton(" Vistara UK 854-Departure 20:30,Arrival 21:55,Duration 1h 25m,Fare Rs.15,132");
		rdbtnNewRadioButton_4.setForeground(new Color(255, 255, 255));
		rdbtnNewRadioButton_4.setBackground(new Color(255, 99, 71));
		rdbtnNewRadioButton_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnNewRadioButton_4.setBounds(23, 306, 538, 23);
		contentPane.add(rdbtnNewRadioButton_4);
		
		JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("Air India  AI 340-Departure 18:30,Arrival 20:00,Duration 1h 30m,Fare Rs.15,290");
		rdbtnNewRadioButton_5.setBackground(new Color(255, 99, 71));
		rdbtnNewRadioButton_5.setForeground(new Color(255, 255, 255));
		rdbtnNewRadioButton_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnNewRadioButton_5.setBounds(23, 346, 533, 23);
		contentPane.add(rdbtnNewRadioButton_5);
		
		JRadioButton rdbtnNewRadioButton_6 = new JRadioButton("Alliance Air AL 540-Departure 12:00,Arrival 13:00,Duration 1h 00m,Fare Rs.10,123");
		rdbtnNewRadioButton_6.setForeground(new Color(255, 255, 255));
		rdbtnNewRadioButton_6.setBackground(new Color(255, 99, 71));
		rdbtnNewRadioButton_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnNewRadioButton_6.setBounds(23, 382, 533, 23);
		contentPane.add(rdbtnNewRadioButton_6);
		
		JRadioButton rdbtnNewRadioButton_7 = new JRadioButton("Star Air SA 865-Departure 10:00,Arrival 11:45,Duration 1h 45m,Fare Rs.12,000");
		rdbtnNewRadioButton_7.setBackground(new Color(255, 99, 71));
		rdbtnNewRadioButton_7.setForeground(new Color(255, 255, 255));
		rdbtnNewRadioButton_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnNewRadioButton_7.setBounds(23, 422, 533, 23);
		contentPane.add(rdbtnNewRadioButton_7);
		
		JRadioButton rdbtnNewRadioButton_8 = new JRadioButton(" IndiGo IG 370-Departure 19:00,Arrival 20:55,Duration 1h 50m,Fare Rs.15,131");
		rdbtnNewRadioButton_8.setForeground(new Color(255, 255, 255));
		rdbtnNewRadioButton_8.setBackground(new Color(255, 99, 71));
		rdbtnNewRadioButton_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnNewRadioButton_8.setBounds(783, 164, 538, 23);
		contentPane.add(rdbtnNewRadioButton_8);
		
		JRadioButton rdbtnNewRadioButton_9 = new JRadioButton(" IndiGo IG 405-Departure 16:05,Arrival 18:05,Duration 2h 00m,Fare Rs.16,125");
		rdbtnNewRadioButton_9.setBackground(new Color(255, 99, 71));
		rdbtnNewRadioButton_9.setForeground(new Color(255, 255, 255));
		rdbtnNewRadioButton_9.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnNewRadioButton_9.setBounds(783, 200, 538, 23);
		contentPane.add(rdbtnNewRadioButton_9);
		ButtonGroup G3=new ButtonGroup();
		G3.add(rdbtnNewRadioButton);
		G3.add(rdbtnNewRadioButton_1);
		G3.add(rdbtnNewRadioButton_2);
		G3.add(rdbtnNewRadioButton_3);
		G3.add(rdbtnNewRadioButton_4);
		G3.add(rdbtnNewRadioButton_5);
		G3.add(rdbtnNewRadioButton_6);
		G3.add(rdbtnNewRadioButton_7);
		
		JButton btnNewButton = new JButton("Book Flight");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				

			      
			      
			      
				
				Passdet pa=new Passdet();
				pa.setVisible(true);
				
				
				
			}
		});
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(65, 105, 225));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton.setBounds(1136, 594, 167, 44);
		contentPane.add(btnNewButton);
		
		JRadioButton rdbtnNewRadioButton_10 = new JRadioButton("AirAsia AA 322-Departure 04:45,Arrival 06:40,Duration 1h 55m,Fare Rs.15,290");
		rdbtnNewRadioButton_10.setForeground(new Color(255, 255, 255));
		rdbtnNewRadioButton_10.setBackground(new Color(255, 99, 71));
		rdbtnNewRadioButton_10.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnNewRadioButton_10.setBounds(783, 233, 538, 23);
		contentPane.add(rdbtnNewRadioButton_10);
		
		JRadioButton rdbtnNewRadioButton_11 = new JRadioButton("GoAir G8 343-Departure 07:55,Arrival 10:35,Duration 2h 40m,Fare Rs.16,123");
		rdbtnNewRadioButton_11.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnNewRadioButton_11.setForeground(new Color(255, 255, 255));
		rdbtnNewRadioButton_11.setBackground(new Color(255, 99, 71));
		rdbtnNewRadioButton_11.setBounds(783, 270, 538, 23);
		contentPane.add(rdbtnNewRadioButton_11);
		
		JRadioButton rdbtnNewRadioButton_12 = new JRadioButton("Vistara UK 245-Departure 08:30,Arrival 10:15,Duration 1h 45m,Fare Rs.15,500");
		rdbtnNewRadioButton_12.setBackground(new Color(255, 99, 71));
		rdbtnNewRadioButton_12.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnNewRadioButton_12.setForeground(new Color(255, 255, 255));
		rdbtnNewRadioButton_12.setBounds(783, 306, 538, 23);
		contentPane.add(rdbtnNewRadioButton_12);
		
		JRadioButton rdbtnNewRadioButton_13 = new JRadioButton("SpiceJet SJ 449-Departure 19:40,Arrival 21:40,Duration 2h 00m,Fare Rs.10,900");
		rdbtnNewRadioButton_13.setBackground(new Color(255, 99, 71));
		rdbtnNewRadioButton_13.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnNewRadioButton_13.setForeground(new Color(255, 255, 255));
		rdbtnNewRadioButton_13.setBounds(783, 346, 538, 23);
		contentPane.add(rdbtnNewRadioButton_13);
		
		JRadioButton rdbtnNewRadioButton_14 = new JRadioButton("Alliance Air AL 670-Departure 21:30,Arrival 23:10,Duration 1h 40m,Fare Rs.12,130");
		rdbtnNewRadioButton_14.setForeground(new Color(255, 255, 255));
		rdbtnNewRadioButton_14.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnNewRadioButton_14.setBackground(new Color(255, 99, 71));
		rdbtnNewRadioButton_14.setBounds(783, 382, 538, 23);
		contentPane.add(rdbtnNewRadioButton_14);
		
		JRadioButton rdbtnNewRadioButton_15 = new JRadioButton("Star Air SA 545-Departure 10:00,Arrival 14:10,Duration 4h 10m,Fare Rs.14,300");
		rdbtnNewRadioButton_15.setForeground(new Color(255, 255, 255));
		rdbtnNewRadioButton_15.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnNewRadioButton_15.setBackground(new Color(255, 99, 71));
		rdbtnNewRadioButton_15.setBounds(783, 422, 538, 23);
		contentPane.add(rdbtnNewRadioButton_15);
		ButtonGroup G4=new ButtonGroup();
		G4.add(rdbtnNewRadioButton_8);
		G4.add(rdbtnNewRadioButton_9);
		G4.add(rdbtnNewRadioButton_10);
		G4.add(rdbtnNewRadioButton_11);
		G4.add(rdbtnNewRadioButton_12);
		G4.add(rdbtnNewRadioButton_13);
		G4.add(rdbtnNewRadioButton_14);
		G4.add(rdbtnNewRadioButton_15);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Domestic_flights dom=new Domestic_flights();
				dom.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(69, 568, 89, 23);
		contentPane.add(btnNewButton_1);
	}
	}
