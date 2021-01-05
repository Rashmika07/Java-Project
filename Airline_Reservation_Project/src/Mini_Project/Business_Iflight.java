package Mini_Project;

import java.awt.BorderLayout;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Label;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Business_Iflight extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Business_Iflight frame = new Business_Iflight();
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
	public Business_Iflight() {
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1500, 900);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 153, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JLabel lblBookticketscom = new JLabel("BookTickets.com");
		lblBookticketscom.setHorizontalAlignment(SwingConstants.CENTER);
		lblBookticketscom.setFont(new Font("Forte", Font.BOLD, 18));
		lblBookticketscom.setBounds(10, 33, 166, 27);
		contentPane.add(lblBookticketscom);
		
		Label label = new Label("InternationalBooking");
		label.setForeground(new Color(0, 51, 255));
		label.setFont(new Font("Algerian", Font.BOLD, 17));
		label.setAlignment(Label.CENTER);
		label.setBounds(583, 33, 166, 27);
		contentPane.add(label);
		
		JRadioButton emirates = new JRadioButton("Emirates Air EA 233- Depature-11hrs Arrival -23hrs   Duration-12hrs , Fare- Rs. 159,765");
		
		emirates.setBackground(new Color(153, 153, 255));
		emirates.setForeground(new Color(0, 0, 102));
		emirates.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 12));
		emirates.setBounds(10, 298, 613, 38);
		contentPane.add(emirates);
		
		JRadioButton jetairways = new JRadioButton("Jet Airways JA 865- Depature-3hrs   Arrival -9hrs   Duration-6hrs  Fare- Rs. 128,400");
	
		jetairways.setBackground(new Color(153, 153, 255));
		jetairways.setForeground(new Color(0, 0, 102));
		jetairways.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 12));
		jetairways.setBounds(10, 378, 613, 38);
		contentPane.add(jetairways);
		
		JRadioButton lufthansa = new JRadioButton("Lufthansa LT 768- Depature-8hrs   Arrival -15hrs   Duration-7hrs   Fare- Rs. 105,000");
	
		lufthansa.setBackground(new Color(153, 153, 255));
		lufthansa.setForeground(new Color(0, 0, 102));
		lufthansa.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 12));
		lufthansa.setBounds(10, 469, 613, 38);
		contentPane.add(lufthansa);
		
		JRadioButton airindia = new JRadioButton("Air India AI 776- Depature-10hrs   Arrival -18hrs   Duration-8hrs ,Fare- Rs. 137,879");
		
		airindia.setForeground(new Color(0, 0, 102));
		airindia.setBackground(new Color(153, 153, 255));
		airindia.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 12));
		airindia.setBounds(10, 222, 599, 43);
		contentPane.add(airindia);
		ButtonGroup G2 = new ButtonGroup();
		G2.add(emirates);
		G2.add(jetairways);
		G2.add(lufthansa);
		G2.add(airindia);
		
		Label label_1 = new Label("Business Class:");
		label_1.setForeground(new Color(0, 0, 51));
		label_1.setFont(new Font("Arial Black", Font.BOLD, 14));
		label_1.setBackground(new Color(51, 153, 204));
		label_1.setAlignment(Label.CENTER);
		label_1.setBounds(10, 102, 153, 22);
		contentPane.add(label_1);
		
		JButton btnNewButton = new JButton("Book Flight");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Passdet pa=new Passdet();
				pa.setVisible(true);

			}
		});
		btnNewButton.setBackground(new Color(0, 0, 102));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton.setBounds(1054, 599, 144, 38);
		contentPane.add(btnNewButton);
		
		JRadioButton airchina = new JRadioButton("Air China AC 456-Departure 12hrs Arrival 21hrs, Duration-9hrs   Fare-Rs 123,989");
		airchina.setActionCommand("Air China-Departure 12hrs Arrival 21hrs, Duration-9hrs   Fare-Rs 123,989");
		airchina.setBackground(new Color(153, 153, 255));
		airchina.setForeground(new Color(0, 0, 128));
		airchina.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 12));
		airchina.setBounds(703, 226, 569, 34);
		contentPane.add(airchina);
		
		JRadioButton vistara = new JRadioButton("Vistara VI 879-Departure 6hrs Arrival 16hrs, Duration -10hrs   Fare-Rs 155,876");
		vistara.setBackground(new Color(153, 153, 255));
		vistara.setForeground(new Color(0, 0, 128));
		vistara.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 12));
		vistara.setBounds(703, 301, 569, 32);
		contentPane.add(vistara);
		
		JRadioButton airasia = new JRadioButton("Air Asia AA 722-Departure 11hrs Arrival 17hrs, Duration-6hrs   Fare-Rs 147,230");
		airasia.setBackground(new Color(153, 153, 255));
		airasia.setForeground(new Color(0, 0, 128));
		airasia.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 12));
		airasia.setBounds(703, 381, 569, 32);
		contentPane.add(airasia);
		
		JRadioButton gulfair = new JRadioButton("Gulf Air GA 298-Departure 13hrs Arrival 22hrs, Duration-9hrs   Fare-Rs 146,000");
		gulfair.setBackground(new Color(153, 153, 255));
		gulfair.setForeground(new Color(0, 0, 128));
		gulfair.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 12));
		gulfair.setBounds(703, 472, 569, 32);
		contentPane.add(gulfair);
		ButtonGroup G3 = new ButtonGroup();
		G3.add(airchina);
		G3.add(vistara);
		G3.add(airasia);
		G3.add(gulfair);
		contentPane.setBounds(0, 0, 1500, 900);
		
		
		Label label_2 = new Label("Departing Flights:");
		label_2.setBackground(new Color(0, 0, 102));
		label_2.setForeground(new Color(153, 153, 255));
		label_2.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 12));
		label_2.setAlignment(Label.CENTER);
		label_2.setBounds(10, 162, 123, 27);
		contentPane.add(label_2);
		
		Label label_3 = new Label("Returning Flights:");
		label_3.setForeground(new Color(153, 153, 204));
		label_3.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 12));
		label_3.setBackground(new Color(0, 0, 102));
		label_3.setAlignment(Label.CENTER);
		label_3.setBounds(897, 122, 112, 27);
		contentPane.add(label_3);
		
		JButton btnNewButton_1 = new JButton("Save");
		
		btnNewButton_1.setBounds(365, 608, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Back");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				International_flights flights = new International_flights();
				flights.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(126, 608, 89, 23);
		contentPane.add(btnNewButton_2);
		
	   
	   
		
		
		
		
			
		
		
		
	}
}
