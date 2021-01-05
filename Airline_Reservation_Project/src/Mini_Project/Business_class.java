package Mini_Project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.AbstractTableModel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

import javax.swing.ButtonGroup;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JTable;

public class Business_class extends JFrame  {

	private JPanel contentPane;
	private JTextField txtBusiness;
	private JTextField txtDepartingFlights;
	private JTextField txtReturningFlights;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Business_class frame = new Business_class();
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
	public Business_class() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0,1370,700);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(135, 206, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JLabel lblNewLabel = new JLabel("BookTickets.com");
		lblNewLabel.setBackground(new Color(0, 255, 127));
		lblNewLabel.setForeground(new Color(0, 255, 127));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 22));
		lblNewLabel.setBounds(24, 11, 201, 27);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Domestic Flights");
		lblNewLabel_1.setForeground(new Color(0, 255, 255));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(509, 11, 217, 27);
		contentPane.add(lblNewLabel_1);
		
		txtBusiness = new JTextField();
		txtBusiness.setForeground(new Color(255, 255, 0));
		txtBusiness.setBackground(new Color(47, 79, 79));
		txtBusiness.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtBusiness.setHorizontalAlignment(SwingConstants.CENTER);
		txtBusiness.setText("Business Class");
		txtBusiness.setBounds(25, 64, 144, 27);
		contentPane.add(txtBusiness);
		txtBusiness.setColumns(10);
		
		txtDepartingFlights = new JTextField();
		txtDepartingFlights.setForeground(new Color(255, 20, 147));
		txtDepartingFlights.setBackground(new Color(255, 255, 0));
		txtDepartingFlights.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtDepartingFlights.setHorizontalAlignment(SwingConstants.CENTER);
		txtDepartingFlights.setText("Departing Flights");
		txtDepartingFlights.setBounds(25, 114, 217, 32);
		contentPane.add(txtDepartingFlights);
		txtDepartingFlights.setColumns(10);
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Vistara UK 852-Departure 11:10,Arrival 12:40,Duration 1h 30m,Fare Rs.21,273");
		rdbtnNewRadioButton_2.setForeground(new Color(255, 255, 255));
		rdbtnNewRadioButton_2.setBackground(new Color(138, 43, 226));
		rdbtnNewRadioButton_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnNewRadioButton_2.setBounds(24, 232, 526, 23);
		contentPane.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton(" Air India AI 568-Departure 14:00,Arrival 19:20,Duration 5h 50m,Fare Rs 34,903");
		rdbtnNewRadioButton_3.setForeground(new Color(255, 255, 255));
		rdbtnNewRadioButton_3.setBackground(new Color(138, 43, 226));
		rdbtnNewRadioButton_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnNewRadioButton_3.setBounds(24, 270, 526, 23);
		contentPane.add(rdbtnNewRadioButton_3);
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton(" Vistara UK 864-Departure 20:30,Arrival 21:55,Duration 1h 25m,Fare Rs.21,273");
		rdbtnNewRadioButton_4.setForeground(new Color(255, 255, 255));
		rdbtnNewRadioButton_4.setBackground(new Color(138, 43, 226));
		rdbtnNewRadioButton_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnNewRadioButton_4.setBounds(24, 306, 526, 23);
		contentPane.add(rdbtnNewRadioButton_4);
		
		JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("Air India  AI 804-Departure 06:30,Arrival 08:30,Duration 2h 00m,Fare Rs 29,456");
		rdbtnNewRadioButton_5.setForeground(new Color(255, 255, 255));
		rdbtnNewRadioButton_5.setBackground(new Color(138, 43, 226));
		rdbtnNewRadioButton_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnNewRadioButton_5.setBounds(24, 341, 526, 23);
		contentPane.add(rdbtnNewRadioButton_5);
		JRadioButton rdbtnNewRadioButton_6 = new JRadioButton("Vistara UK 618-Departure 20:30,Arrival 22:15,Duration 1h 45m,Fare Rs 22,273");
		rdbtnNewRadioButton_6.setForeground(new Color(255, 255, 255));
		rdbtnNewRadioButton_6.setBackground(new Color(138, 43, 226));
		rdbtnNewRadioButton_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnNewRadioButton_6.setBounds(24, 194, 526, 23);
		contentPane.add(rdbtnNewRadioButton_6);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton(" Air India AI 504-Departure 06:45,Arrival 08:35,Duration 1h 50m,Fare Rs.21,273");
		rdbtnNewRadioButton.setForeground(new Color(255, 255, 255));
		rdbtnNewRadioButton.setBackground(new Color(138, 43, 226));
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnNewRadioButton.setBounds(24, 164, 526, 23);
		contentPane.add(rdbtnNewRadioButton);
		ButtonGroup G5=new ButtonGroup();
		G5.add(rdbtnNewRadioButton_2);
		G5.add(rdbtnNewRadioButton_3);
		G5.add(rdbtnNewRadioButton_4);
		G5.add(rdbtnNewRadioButton_5);
		G5.add(rdbtnNewRadioButton_6);
		G5.add(rdbtnNewRadioButton);
		
		txtReturningFlights = new JTextField();
		txtReturningFlights.setForeground(new Color(255, 69, 0));
		txtReturningFlights.setBackground(new Color(255, 255, 0));
		txtReturningFlights.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtReturningFlights.setHorizontalAlignment(SwingConstants.CENTER);
		txtReturningFlights.setText("Returning Flights");
		txtReturningFlights.setBounds(792, 114, 217, 32);
		contentPane.add(txtReturningFlights);
		txtReturningFlights.setColumns(10);
		
		JRadioButton rdbtnNewRadioButton_7 = new JRadioButton(" Air India AI 573-Departure 08:15,Arrival 10:00,Duration 1h 45m,Fare Rs.21,197");
				rdbtnNewRadioButton_7.setBackground(new Color(138, 43, 226));
				rdbtnNewRadioButton_7.setForeground(new Color(255, 255, 255));
				rdbtnNewRadioButton_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
				rdbtnNewRadioButton_7.setBounds(792, 164, 536, 23);
				contentPane.add(rdbtnNewRadioButton_7);
				
				JRadioButton rdbtnNewRadioButton_8 = new JRadioButton("Vistara UK 888-Departure 17:55,Arrival 19:40,Duration 1h 45m,Fare Rs.21,197");
				rdbtnNewRadioButton_8.setBackground(new Color(138, 43, 226));
				rdbtnNewRadioButton_8.setForeground(new Color(255, 255, 255));
				rdbtnNewRadioButton_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
				rdbtnNewRadioButton_8.setBounds(792, 194, 536, 23);
				contentPane.add(rdbtnNewRadioButton_8);
				
				JRadioButton rdbtnNewRadioButton_9 = new JRadioButton("Vistara UK 808-Departure 20:45,Arrival 22:30,Duration 1h 45m,Fare Rs.21,197");
				rdbtnNewRadioButton_9.setBackground(new Color(138, 43, 226));
				rdbtnNewRadioButton_9.setForeground(new Color(255, 255, 255));
				rdbtnNewRadioButton_9.setFont(new Font("Tahoma", Font.PLAIN, 14));
				rdbtnNewRadioButton_9.setBounds(792, 232, 536, 23);
				contentPane.add(rdbtnNewRadioButton_9);
				
				JRadioButton rdbtnNewRadioButton_10 = new JRadioButton(" Air India AI 568-Departure 08:20,Arrival 14:40,Duration 6h 20m,Fare Rs 43,404");
				rdbtnNewRadioButton_10.setBackground(new Color(138, 43, 226));
				rdbtnNewRadioButton_10.setForeground(new Color(255, 255, 255));
				rdbtnNewRadioButton_10.setFont(new Font("Tahoma", Font.PLAIN, 14));
				rdbtnNewRadioButton_10.setBounds(792, 270, 536, 23);
				contentPane.add(rdbtnNewRadioButton_10);
				
				JRadioButton rdbtnNewRadioButton_12 = new JRadioButton("Vistara UK 818-Departure 17:55,Arrival 19:40,Duration 1h 45m,Fare Rs 22,197");
						rdbtnNewRadioButton_12.setBackground(new Color(138, 43, 226));
						rdbtnNewRadioButton_12.setForeground(new Color(255, 255, 255));
						rdbtnNewRadioButton_12.setFont(new Font("Tahoma", Font.PLAIN, 14));
						rdbtnNewRadioButton_12.setBounds(792, 306, 536, 23);
						contentPane.add(rdbtnNewRadioButton_12);
						
						JRadioButton rdbtnNewRadioButton_13 = new JRadioButton("Air India  AI 598-Departure 11:10,Arrival 13:40,Duration 1h 30m,Fare Rs 29,173");
						rdbtnNewRadioButton_13.setBackground(new Color(138, 43, 226));
						rdbtnNewRadioButton_13.setForeground(new Color(255, 255, 255));
						rdbtnNewRadioButton_13.setFont(new Font("Tahoma", Font.PLAIN, 14));
						rdbtnNewRadioButton_13.setBounds(792, 341, 536, 23);
						contentPane.add(rdbtnNewRadioButton_13);
						ButtonGroup G6=new ButtonGroup();
						G6.add(rdbtnNewRadioButton_7);
						G6.add(rdbtnNewRadioButton_8);
						G6.add(rdbtnNewRadioButton_9);
						G6.add(rdbtnNewRadioButton_10);
						G6.add(rdbtnNewRadioButton_12);
						G6.add(rdbtnNewRadioButton_13);
						
						JButton btnNewButton = new JButton("Book Flight");
						btnNewButton.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								
								Passdet pa=new Passdet();
								pa.setVisible(true);
							}
						});
						btnNewButton.setForeground(new Color(255, 255, 255));
						btnNewButton.setBackground(new Color(0, 0, 255));
						btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
						btnNewButton.setBounds(1150, 588, 166, 49);
						contentPane.add(btnNewButton);
						
						JButton btnNewButton_1 = new JButton("Back");
						btnNewButton_1.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								
								Domestic_flights dom=new Domestic_flights();
								dom.setVisible(true);
								dispose();
							}
						});
						btnNewButton_1.setBounds(105, 562, 89, 23);
						contentPane.add(btnNewButton_1);
						
						
						
					}
				}
