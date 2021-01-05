package Mini_Project;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Frame;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JInternalFrame;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;

public class Domestic_flights extends JFrame {
	private JTextField txtClass;
	private JTextField txtTicketType;
	private JTextField txtFrom;
	private JTextField To;
	private JTextField txtDateOfDeparture;
	private JTextField txtDateOfArrival;
	private JTextField txtNumberOfPassengers;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JComboBox From;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Domestic_flights frame = new Domestic_flights();
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
	public Domestic_flights() {
		getContentPane().setBackground(new Color(0, 191, 255));
		getContentPane().setForeground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1370, 700);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BookTickets.com");
		lblNewLabel.setForeground(new Color(0, 255, 0));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 22));
		lblNewLabel.setBounds(21, 11, 201, 25);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Domestic Booking");
		lblNewLabel_1.setForeground(new Color(0, 255, 255));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(565, 11, 213, 25);
		getContentPane().add(lblNewLabel_1);
		
		txtClass = new JTextField();
		txtClass.setForeground(new Color(255, 255, 255));
		txtClass.setBackground(new Color(0, 0, 255));
		txtClass.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtClass.setHorizontalAlignment(SwingConstants.CENTER);
		txtClass.setText("Class");
		txtClass.setBounds(61, 80, 86, 33);
		getContentPane().add(txtClass);
		txtClass.setColumns(10);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Economy");
		rdbtnNewRadioButton.setBackground(new Color(175, 238, 238));
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnNewRadioButton.setBounds(61, 134, 109, 23);
		getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Business");
		rdbtnNewRadioButton_1.setBackground(new Color(175, 238, 238));
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnNewRadioButton_1.setBounds(61, 196, 109, 23);
		getContentPane().add(rdbtnNewRadioButton_1);
		ButtonGroup G=new ButtonGroup();
		G.add(rdbtnNewRadioButton);
		G.add(rdbtnNewRadioButton_1);
		
		
		txtTicketType = new JTextField();
		txtTicketType.setForeground(new Color(255, 255, 255));
		txtTicketType.setBackground(new Color(0, 0, 255));
		txtTicketType.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtTicketType.setHorizontalAlignment(SwingConstants.CENTER);
		txtTicketType.setText("Ticket type");
		txtTicketType.setBounds(334, 80, 121, 33);
		getContentPane().add(txtTicketType);
		txtTicketType.setColumns(10);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("One Way");
		rdbtnNewRadioButton_2.setBackground(new Color(175, 238, 238));
		rdbtnNewRadioButton_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnNewRadioButton_2.setBounds(334, 136, 109, 23);
		getContentPane().add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Round Trip");
		rdbtnNewRadioButton_3.setBackground(new Color(175, 238, 238));
		rdbtnNewRadioButton_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnNewRadioButton_3.setBounds(334, 198, 109, 23);
		getContentPane().add(rdbtnNewRadioButton_3);
		ButtonGroup G1=new ButtonGroup();
		G1.add(rdbtnNewRadioButton_2);
		G1.add(rdbtnNewRadioButton_3);
		
		txtFrom = new JTextField();
		txtFrom.setForeground(new Color(255, 255, 255));
		txtFrom.setBackground(new Color(0, 0, 255));
		txtFrom.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtFrom.setHorizontalAlignment(SwingConstants.CENTER);
		txtFrom.setText("From");
		txtFrom.setBounds(764, 80, 86, 33);
		getContentPane().add(txtFrom);
		txtFrom.setColumns(10);
		
		To = new JTextField();
		To.setForeground(new Color(255, 255, 255));
		To.setBackground(new Color(0, 0, 255));
		To.setFont(new Font("Tahoma", Font.PLAIN, 18));
		To.setHorizontalAlignment(SwingConstants.CENTER);
		To.setText("To");
		To.setBounds(1047, 80, 86, 33);
		getContentPane().add(To);
		To.setColumns(10);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBackground(Color.GREEN);
		comboBox_1.setForeground(Color.BLACK);
		comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Bengaluru", "Chennai", "New Delhi", "Mumbai", "Kolkata", "Mangalore", "Goa"}));
		comboBox_1.setBounds(1047, 136, 162, 34);
		getContentPane().add(comboBox_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(230, 230, 250));
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(21, 47, 1305, 242);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		From = new JComboBox();
		From.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				
				
			}
		});
		From.setForeground(Color.BLACK);
		From.setBackground(Color.GREEN);
		From.setBounds(744, 90, 165, 35);
		panel.add(From);
		From.setFont(new Font("Tahoma", Font.PLAIN, 16));
		From.setModel(new DefaultComboBoxModel(new String[] {"Bengaluru", "Chennai", "New Delhi", "Mumbai", "Kolkata", "Mangalore", "Goa"}));
		
		txtDateOfDeparture = new JTextField();
		txtDateOfDeparture.setForeground(new Color(255, 255, 255));
		txtDateOfDeparture.setBackground(new Color(0, 0, 255));
		txtDateOfDeparture.setHorizontalAlignment(SwingConstants.CENTER);
		txtDateOfDeparture.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtDateOfDeparture.setText("Date Of Departure");
		txtDateOfDeparture.setBounds(61, 310, 184, 41);
		getContentPane().add(txtDateOfDeparture);
		txtDateOfDeparture.setColumns(10);
		
		txtDateOfArrival = new JTextField();
		txtDateOfArrival.setForeground(new Color(255, 255, 255));
		txtDateOfArrival.setBackground(new Color(0, 0, 255));
		txtDateOfArrival.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtDateOfArrival.setHorizontalAlignment(SwingConstants.CENTER);
		txtDateOfArrival.setText("Date Of Return");
		txtDateOfArrival.setBounds(377, 310, 191, 41);
		getContentPane().add(txtDateOfArrival);
		txtDateOfArrival.setColumns(10);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setForeground(new Color(123, 104, 238));
		comboBox_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		comboBox_2.setBounds(53, 374, 41, 20);
		getContentPane().add(comboBox_2);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setForeground(new Color(123, 104, 238));
		comboBox_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"}));
		comboBox_3.setBounds(93, 374, 104, 20);
		getContentPane().add(comboBox_3);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setForeground(new Color(123, 104, 238));
		comboBox_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"2020", "2021", "2022"}));
		comboBox_4.setBounds(196, 374, 57, 20);
		getContentPane().add(comboBox_4);
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setForeground(new Color(123, 104, 238));
		comboBox_5.setFont(new Font("Tahoma", Font.PLAIN, 13));
		comboBox_5.setModel(new DefaultComboBoxModel(new String[] {"-", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		comboBox_5.setBounds(369, 374, 41, 20);
		getContentPane().add(comboBox_5);
		
		JComboBox comboBox_6 = new JComboBox();
		comboBox_6.setForeground(new Color(123, 104, 238));
		comboBox_6.setFont(new Font("Tahoma", Font.PLAIN, 13));
		comboBox_6.setModel(new DefaultComboBoxModel(new String[] {"-", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"}));
		comboBox_6.setBounds(409, 374, 104, 20);
		getContentPane().add(comboBox_6);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setBounds(0, 0, 48, 14);
		getContentPane().add(lblNewLabel_4);
		
		JComboBox comboBox_7 = new JComboBox();
		comboBox_7.setForeground(new Color(123, 104, 238));
		comboBox_7.setFont(new Font("Tahoma", Font.PLAIN, 13));
		comboBox_7.setModel(new DefaultComboBoxModel(new String[] {"-", "2020", "2021", "2022"}));
		comboBox_7.setBounds(511, 374, 57, 20);
		getContentPane().add(comboBox_7);
		
		txtNumberOfPassengers = new JTextField();
		txtNumberOfPassengers.setForeground(new Color(255, 255, 255));
		txtNumberOfPassengers.setBackground(new Color(0, 0, 255));
		txtNumberOfPassengers.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtNumberOfPassengers.setHorizontalAlignment(SwingConstants.CENTER);
		txtNumberOfPassengers.setText("Number Of Passengers");
		txtNumberOfPassengers.setBounds(679, 310, 207, 41);
		getContentPane().add(txtNumberOfPassengers);
		txtNumberOfPassengers.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Adults");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(684, 390, 66, 20);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Children");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(684, 432, 66, 20);
		getContentPane().add(lblNewLabel_3);
		
		JComboBox comboBox_8 = new JComboBox();
		comboBox_8.setForeground(new Color(123, 104, 238));
		comboBox_8.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
		comboBox_8.setBounds(778, 391, 93, 20);
		getContentPane().add(comboBox_8);
		
		JComboBox comboBox_9 = new JComboBox();
		comboBox_9.setForeground(new Color(123, 104, 238));
		comboBox_9.setModel(new DefaultComboBoxModel(new String[] {"No", "1", "2", "3", "4", "5"}));
		comboBox_9.setBounds(778, 433, 93, 20);
		getContentPane().add(comboBox_9);
		
		JButton btnNewButton = new JButton("Search for Economy flights");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				
				

				
			
				dispose();
				Economic_class eflight=new Economic_class();
				eflight.setVisible(true);
			}
			
			private JButton setText(String text) {
				// TODO Auto-generated method stub
				return null;
			}
		});
		buttonGroup.add(btnNewButton);
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.setBackground(Color.CYAN);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(1044, 310, 201, 41);
		getContentPane().add(btnNewButton);
		
		
		JButton btnNewButton_1 = new JButton("Search for Business flights");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				dispose();
				Business_class bflight=new Business_class();
				bflight.setVisible(true);
			}
		});
		btnNewButton_1.setForeground(Color.BLUE);
		btnNewButton_1.setBackground(Color.CYAN);
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1.setBounds(1044, 380, 201, 41);
		getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Back");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Flighttype frame= new Flighttype();
				frame.setVisible(true);
				dispose();
				
			}
		});
		btnNewButton_2.setBounds(108, 600, 89, 23);
		getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("save");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton_3.setBounds(343, 600, 89, 23);
		getContentPane().add(btnNewButton_3);
		
		
		
		
		
	}
	
	
	public Color getComboBoxBackground() {
		return From.getBackground();
	}
	public void setComboBoxBackground(Color background) {
		From.setBackground(background);
	}
}
