package Mini_Project;

import java.awt.BorderLayout;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Label;
import java.awt.Window;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Economy_Iflight extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Economy_Iflight frame = new Economy_Iflight();
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
	public Economy_Iflight() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1500, 900);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 153, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BookTickets.com");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(0, 0, 51));
		lblNewLabel.setFont(new Font("Forte", Font.BOLD, 18));
		lblNewLabel.setBounds(22, 11, 150, 48);
		contentPane.add(lblNewLabel);
		JLabel lblNewLabel_1 = new JLabel("International Booking");
		lblNewLabel_1.setForeground(new Color(153, 51, 102));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Algerian", Font.BOLD, 15));
		lblNewLabel_1.setBounds(579, 51, 227, 21);
		contentPane.add(lblNewLabel_1);
		Label label = new Label("Economy Class:");
		label.setFont(new Font("Arial Black", Font.BOLD, 14));
		label.setForeground(new Color(204, 153, 153));
		label.setBackground(new Color(153, 51, 51));
		label.setAlignment(Label.CENTER);
		label.setBounds(22, 106, 117, 22);
		contentPane.add(label);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Air India AI 768-Departure 12hrs Arrival 11hrs, Duration-23hrs   Fare-Rs 84,989\r\n");
		
		rdbtnNewRadioButton.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 12));
		rdbtnNewRadioButton.setForeground(new Color(255, 153, 204));
		rdbtnNewRadioButton.setBackground(new Color(255, 51, 51));
		rdbtnNewRadioButton.setBounds(22, 210, 571, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("British Airways BA 544-Departure 00hrs Arrival 7hrs, Duration-7hrs   Fare-Rs 47,989\r\n");
		rdbtnNewRadioButton_1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 12));
		rdbtnNewRadioButton_1.setForeground(new Color(255, 153, 204));
		rdbtnNewRadioButton_1.setBackground(new Color(255, 51, 51));
		rdbtnNewRadioButton_1.setBounds(22, 261, 585, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Dragon Air DA 887-Departure 6hrs Arrival 13hrs, Duration-7hrs   Fare-Rs 53,989\r\n");
		rdbtnNewRadioButton_2.setForeground(new Color(255, 153, 204));
		rdbtnNewRadioButton_2.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 12));
		rdbtnNewRadioButton_2.setBackground(new Color(255, 51, 51));
		rdbtnNewRadioButton_2.setBounds(22, 316, 585, 23);
		contentPane.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Thai Airways TA 508-Departure 17hrs Arrival 19hrs, Duration-2hrs   Fare-Rs 23,456");
		rdbtnNewRadioButton_3.setBackground(new Color(255, 51, 51));
		rdbtnNewRadioButton_3.setForeground(new Color(255, 153, 204));
		rdbtnNewRadioButton_3.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 12));
		rdbtnNewRadioButton_3.setBounds(22, 365, 585, 23);
		contentPane.add(rdbtnNewRadioButton_3);
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("Delta Airways DA 348-Departure 5hrs Arrival 15hrs, Duration-10hrs   Fare-Rs 73,989");
		rdbtnNewRadioButton_4.setForeground(new Color(255, 153, 204));
		rdbtnNewRadioButton_4.setBackground(new Color(255, 51, 51));
		rdbtnNewRadioButton_4.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 12));
		rdbtnNewRadioButton_4.setBounds(22, 416, 585, 23);
		contentPane.add(rdbtnNewRadioButton_4);
		
		JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("Air France AF 582-Departure 16hrs Arrival 23hrs, Duration-7hrs   Fare-Rs 83,989");
		rdbtnNewRadioButton_5.setForeground(new Color(255, 153, 204));
		rdbtnNewRadioButton_5.setBackground(new Color(255, 51, 51));
		rdbtnNewRadioButton_5.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 12));
		rdbtnNewRadioButton_5.setBounds(22, 468, 585, 23);
		contentPane.add(rdbtnNewRadioButton_5);
		
		
		ButtonGroup G5 = new ButtonGroup();
		G5.add(rdbtnNewRadioButton);
		G5.add(rdbtnNewRadioButton_1);
		G5.add(rdbtnNewRadioButton_2);
		G5.add(rdbtnNewRadioButton_3);
		G5.add(rdbtnNewRadioButton_4);
		G5.add(rdbtnNewRadioButton_5);
		
		
		
		
		JRadioButton rdbtnNewRadioButton_6 = new JRadioButton("British Airways BA 792-Departure 8hrs Arrival 2hrs, Duration-6hrs   Fare-Rs 43,989\r\n");
		rdbtnNewRadioButton_6.setForeground(new Color(255, 153, 204));
		rdbtnNewRadioButton_6.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 12));
		rdbtnNewRadioButton_6.setBackground(new Color(255, 51, 51));
		rdbtnNewRadioButton_6.setBounds(749, 210, 602, 23);
		contentPane.add(rdbtnNewRadioButton_6);
		
		JRadioButton rdbtnNewRadioButton_7 = new JRadioButton("Jet Airways JA 537-Departure 6hrs Arrival 12hrs, Duration-6hrs   Fare-Rs 50,000\r\n");
		rdbtnNewRadioButton_7.setForeground(new Color(255, 153, 204));
		rdbtnNewRadioButton_7.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 12));
		rdbtnNewRadioButton_7.setBackground(new Color(255, 51, 51));
		rdbtnNewRadioButton_7.setBounds(749, 261, 602, 23);
		contentPane.add(rdbtnNewRadioButton_7);
		
		JRadioButton rdbtnNewRadioButton_8 = new JRadioButton("Atlantic Airways AA 588-Departure 12hrs Arrival 18hrs, Duration-6hrs   Fare-Rs 43,989\r\n");
		rdbtnNewRadioButton_8.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 12));
		rdbtnNewRadioButton_8.setForeground(new Color(255, 153, 204));
		rdbtnNewRadioButton_8.setBackground(new Color(255, 51, 51));
		rdbtnNewRadioButton_8.setBounds(749, 316, 602, 23);
		contentPane.add(rdbtnNewRadioButton_8);
		
		JRadioButton rdbtnVistaradeparturehrsArrival = new JRadioButton("Vistara-Departure VA 274 14hrs Arrival 22hrs, Duration-8hrs   Fare-Rs 33,780\r\n");
		rdbtnVistaradeparturehrsArrival.setForeground(new Color(255, 153, 204));
		rdbtnVistaradeparturehrsArrival.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 12));
		rdbtnVistaradeparturehrsArrival.setBackground(new Color(255, 51, 51));
		rdbtnVistaradeparturehrsArrival.setBounds(749, 365, 555, 23);
		contentPane.add(rdbtnVistaradeparturehrsArrival);
		
		JRadioButton rdbtnNewRadioButton_9 = new JRadioButton("Singapore Airlines SA 852-Departure 10hrs Arrival 19hrs, Duration-9hrs   Fare-Rs 25,667\r\n");
		rdbtnNewRadioButton_9.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 12));
		rdbtnNewRadioButton_9.setForeground(new Color(255, 153, 204));
		rdbtnNewRadioButton_9.setBackground(new Color(255, 51, 51));
		rdbtnNewRadioButton_9.setBounds(749, 416, 615, 23);
		contentPane.add(rdbtnNewRadioButton_9);
		
		JRadioButton rdbtnNewRadioButton_10 = new JRadioButton("Garuda Airlines GA 764-Departure 12hrs Arrival 20hrs, Duration-8hrs   Fare-Rs 20,263\r\n");
		rdbtnNewRadioButton_10.setForeground(new Color(255, 153, 204));
		rdbtnNewRadioButton_10.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 12));
		rdbtnNewRadioButton_10.setBackground(new Color(255, 51, 51));
		rdbtnNewRadioButton_10.setBounds(749, 468, 602, 23);
		contentPane.add(rdbtnNewRadioButton_10);
		ButtonGroup G6 = new ButtonGroup();
		G6.add(rdbtnNewRadioButton_6);
		G6.add(rdbtnNewRadioButton_7);
		G6.add(rdbtnNewRadioButton_8);
		G6.add(rdbtnNewRadioButton_9);
		G6.add(rdbtnNewRadioButton_10);
		G6.add(rdbtnVistaradeparturehrsArrival);
		
		Label label_1 = new Label("Best Depating Flights:");
		label_1.setFont(new Font("Arial Black", Font.BOLD, 13));
		label_1.setBackground(new Color(204, 51, 51));
		label_1.setForeground(new Color(255, 255, 255));
		label_1.setAlignment(Label.CENTER);
		label_1.setBounds(22, 162, 198, 22);
		contentPane.add(label_1);
		
		Label label_2 = new Label("Best Returning Flights:");
		label_2.setForeground(Color.WHITE);
		label_2.setFont(new Font("Arial Black", Font.BOLD, 13));
		label_2.setBackground(new Color(204, 51, 51));
		label_2.setAlignment(Label.CENTER);
		label_2.setBounds(775, 162, 198, 22);
		contentPane.add(label_2);
		
		JButton btnNewButton = new JButton("Book Flight");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Passdet pa=new Passdet();
				pa.setVisible(true);
				
			}
		});
		btnNewButton.setBackground(new Color(204, 51, 51));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBounds(1155, 655, 150, 39);
		contentPane.add(btnNewButton);
		
		
		
		
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				International_flights window1 = new International_flights();
				window1.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(89, 664, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Save");
		
		btnNewButton_2.setBounds(364, 664, 89, 23);
		contentPane.add(btnNewButton_2);
		
		
		
	}
}
