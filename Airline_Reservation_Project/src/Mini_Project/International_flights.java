package Mini_Project;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;

public class International_flights extends JFrame {

	private JPanel contentPane;
	private JTextField DeptDarte1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					International_flights frame = new International_flights();
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
	public International_flights() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1500, 900);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		
		
		contentPane.setLayout(null);
		contentPane.setLayout(null);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Economy");
		rdbtnNewRadioButton.setBounds(20, 184, 109, 23);
		rdbtnNewRadioButton.setBackground(new Color(153, 153, 255));
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(rdbtnNewRadioButton);
		
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Business");
		rdbtnNewRadioButton_1.setBounds(20, 269, 109, 28);
		rdbtnNewRadioButton_1.setBackground(new Color(153, 153, 255));
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(rdbtnNewRadioButton_1);
		ButtonGroup G = new ButtonGroup();
		G.add(rdbtnNewRadioButton);
		G.add(rdbtnNewRadioButton_1);
		
		
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("One Way");
		rdbtnNewRadioButton_2.setBounds(240, 184, 109, 23);
		rdbtnNewRadioButton_2.setBackground(new Color(153, 153, 255));
		rdbtnNewRadioButton_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Round Trip");
		rdbtnNewRadioButton_3.setBounds(240, 272, 109, 23);
		rdbtnNewRadioButton_3.setBackground(new Color(153, 153, 255));
		rdbtnNewRadioButton_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(rdbtnNewRadioButton_3);
		ButtonGroup G1 = new ButtonGroup();
		G1.add(rdbtnNewRadioButton_2);
		G1.add(rdbtnNewRadioButton_3);
		
		
		Label label = new Label("Class");
		label.setBounds(26, 87, 104, 37);
		label.setForeground(new Color(255, 255, 240));
		label.setFont(new Font("Arial Black", Font.BOLD, 15));
		label.setAlignment(Label.CENTER);
		label.setBackground(new Color(0, 0, 255));
		contentPane.add(label);
		
		Label label_1 = new Label("Ticket type");
		label_1.setBounds(241, 87, 123, 37);
		label_1.setForeground(new Color(255, 255, 255));
		label_1.setBackground(new Color(0, 0, 255));
		label_1.setFont(new Font("Arial Black", Font.BOLD, 15));
		label_1.setAlignment(Label.CENTER);
		contentPane.add(label_1);
		
		Label label_2 = new Label("From");
		label_2.setBounds(622, 87, 109, 37);
		label_2.setForeground(new Color(255, 255, 255));
		label_2.setBackground(new Color(0, 0, 255));
		label_2.setFont(new Font("Arial Black", Font.BOLD, 15));
		label_2.setAlignment(Label.CENTER);
		contentPane.add(label_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(622, 138, 165, 45);
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 14));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Delhi", "Mumbai", "Bengaluru", "Mangalore", "Hyderabad", "Chennai", "Coimbatore", "Madurai", "Tiruchirapalli", "Kolkata", "Siliguri", "Nagpur", "Vijayawada", "Guwahati", "Dabolim", "Ahmedabad", "Surat", "Vadodara", "Srinagar", "Trivandrum", "Kochi", "Kozhikode", "Kannur", "Indore", "Imphal", "Bhubhaneshwar", "Amritsar", "Jaipur", "Lucknow", "Varanasi"}));
		comboBox.setMaximumRowCount(20);
		contentPane.add(comboBox);
		
		Label label_3 = new Label("To");
		label_3.setBounds(1013, 87, 109, 37);
		label_3.setForeground(new Color(255, 255, 255));
		label_3.setFont(new Font("Arial Black", Font.BOLD, 14));
		label_3.setBackground(new Color(0, 0, 255));
		label_3.setAlignment(Label.CENTER);
		contentPane.add(label_3);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(1015, 137, 198, 46);
		comboBox_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"\tHong Kong\t", "\tSingapore city", "\tBangkok\t", "\tLondon\t", "\tMacau\t", "\tKuala Lumpur\t", "\tShenzhen\t", "\tNew York City\t", "\tAntalya\t", "\tParis\t", "\tIstanbul\t", "\tRome\t", "\tDubai\t", "\tMecca\t", "      Taipei City\t", "\tPrague\t", "\tShanghai\t", "\tLas Vegas\t", "\tMiami\t", "\tBarcelona\t", "\tMoscow\t", "\tBeijing\t", "\tLos Angeles\t", "\tBudapest\t", "\tVienna\t", "\tAmsterdam\t", "\tSofia\t", "\tMadrid\t", "\tOrlando\t", "      Cannes", "      Cologne", "      Helsinki", "      Stockholm", "      Oslo", "\tHo Chi Minh City\t", "\tLima\t", "\tBerlin\t", "\tTokyo\t", "\tWarsaw\t", "\tCairo\t", "\tNairobi\t", "\tMilan\t", "\tSan Francisco\t", "\tBuenos Aires\t", "       Beijing", "       Frankfurt", "      San Fransisco", "      Bern", "      Cairo", "\tVenice\t", "\tMexico City\t", "\tDublin\t", "\tSeoul\t", "       Toronto\t", "\tZhuhai\t", "\tSt Petersburg\t", "\tSydney\t", "        Munich", "\tJohannesburg\t", "\tBucharest\t", "\tBrussels\t", "\tNice\t", "\tLisbon\t", "\tEast Province\t", "\tJakarta\t", "\tManama\t", "\tHanoi\t", "\tManila\t", "\tAuckland\t", "\tSiem Reap\t", "\tSousse\t", "\tAmman\t", "\tVancouver\t", "\tAbu Dhabi\t", "\tKiev\t", "\tDoha\t", "\tFlorence\t", "\tRio de Janeiro\t", "\tMelbourne\t", "\tWashington D.C", "\tRiyadh\t", "\tChristchurch\t", "\tFrankfurt\t", "       Canberra", "       Bali", "\tBaku\t", "      Kathmandu", "\tSao Paulo\t", "\tHarare\t", "\tNanjing"}));
		contentPane.add(comboBox_1);
		
		Label label_4 = new Label("Date Of Departure");
		label_4.setBounds(10, 379, 171, 37);
		label_4.setFont(new Font("Arial Black", Font.BOLD, 15));
		label_4.setBackground(new Color(0, 0, 255));
		label_4.setAlignment(Label.CENTER);
		label_4.setForeground(new Color(255, 255, 255));
		contentPane.add(label_4);
		
		Label label_5 = new Label("Date of arrival");
		label_5.setBounds(240, 379, 177, 37);
		label_5.setForeground(new Color(255, 255, 255));
		label_5.setFont(new Font("Arial Black", Font.BOLD, 15));
		label_5.setBackground(new Color(0, 0, 255));
		label_5.setAlignment(Label.CENTER);
		contentPane.add(label_5);
		
		Label label_6 = new Label("Number of passengers");
		label_6.setBounds(591, 369, 212, 47);
		label_6.setFont(new Font("Arial Black", Font.BOLD, 15));
		label_6.setForeground(new Color(255, 255, 255));
		label_6.setBackground(new Color(0, 0, 255));
		label_6.setAlignment(Label.CENTER);
		contentPane.add(label_6);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(686, 458, 133, 37);
		comboBox_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20"}));
		contentPane.add(comboBox_2);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(686, 529, 133, 37);
		comboBox_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20"}));
		contentPane.add(comboBox_3);
		
		JButton btnNewButton = new JButton("search for economy flights");
		btnNewButton.setBounds(1056, 327, 226, 63);
		btnNewButton.addActionListener(new ActionListener() 
		{
			
			public void actionPerformed(ActionEvent e)
			{
				
			Economy_Iflight flighte= new Economy_Iflight();
			flighte.setVisible(true);
			}
		});
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(0, 0, 128));
		btnNewButton.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 12));
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("BookTickets.com");
		lblNewLabel.setBounds(20, 23, 212, 37);
		contentPane.add(lblNewLabel);
		lblNewLabel.setForeground(new Color(0, 0, 51));
		lblNewLabel.setLabelFor(lblNewLabel);
		lblNewLabel.setBackground(Color.LIGHT_GRAY);
		lblNewLabel.setFont(new Font("Forte", Font.BOLD, 20));
		
		Label label_7 = new Label("International Booking");
		label_7.setBounds(536, 10, 234, 37);
		label_7.setForeground(new Color(204, 204, 204));
		label_7.setAlignment(Label.CENTER);
		label_7.setBackground(new Color(153, 153, 255));
		label_7.setFont(new Font("ISOCP_IV25", Font.BOLD, 16));
		contentPane.add(label_7);
		
		JLabel lblNewLabel_1 = new JLabel("Adults");
		lblNewLabel_1.setBounds(591, 459, 57, 37);
		lblNewLabel_1.setBackground(new Color(0, 0, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Children");
		lblNewLabel_2.setBounds(591, 534, 57, 26);
		lblNewLabel_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2.setBackground(new Color(0, 0, 255));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel_2);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 314, 1350, 2);
		separator.setBackground(new Color(153, 153, 204));
		separator.setForeground(new Color(102, 153, 153));
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 60, 1350, 2);
		separator_1.setBackground(new Color(153, 153, 204));
		contentPane.add(separator_1);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setBounds(10, 446, 36, 22);
		comboBox_4.setForeground(new Color(0, 0, 0));
		comboBox_4.setBackground(new Color(255, 255, 255));
		comboBox_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		contentPane.add(comboBox_4);
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setBounds(47, 446, 82, 22);
		comboBox_5.setForeground(new Color(0, 0, 0));
		comboBox_5.setBackground(new Color(255, 255, 255));
		comboBox_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		comboBox_5.setModel(new DefaultComboBoxModel(new String[] {"January", "Febraury", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"}));
		contentPane.add(comboBox_5);
		
		JComboBox comboBox_6 = new JComboBox();
		comboBox_6.setBounds(126, 445, 58, 22);
		comboBox_6.setForeground(new Color(0, 0, 0));
		comboBox_6.setBackground(new Color(255, 255, 255));
		comboBox_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		comboBox_6.setModel(new DefaultComboBoxModel(new String[] {"2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040"}));
		contentPane.add(comboBox_6);
		
		JComboBox comboBox_7 = new JComboBox();
		comboBox_7.setBounds(242, 445, 36, 22);
		comboBox_7.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		comboBox_7.setForeground(Color.BLACK);
		comboBox_7.setFont(new Font("Tahoma", Font.BOLD, 12));
		comboBox_7.setBackground(Color.WHITE);
		contentPane.add(comboBox_7);
		
		JComboBox comboBox_8 = new JComboBox();
		comboBox_8.setBounds(277, 445, 82, 22);
		comboBox_8.setModel(new DefaultComboBoxModel(new String[] {"January", "Febraury", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"}));
		comboBox_8.setForeground(Color.BLACK);
		comboBox_8.setFont(new Font("Tahoma", Font.BOLD, 12));
		comboBox_8.setBackground(Color.WHITE);
		contentPane.add(comboBox_8);
		
		JComboBox comboBox_9 = new JComboBox();
		comboBox_9.setBounds(358, 445, 58, 22);
		comboBox_9.setModel(new DefaultComboBoxModel(new String[] {"2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040"}));
		comboBox_9.setForeground(Color.BLACK);
		comboBox_9.setFont(new Font("Tahoma", Font.BOLD, 12));
		comboBox_9.setBackground(Color.WHITE);
		contentPane.add(comboBox_9);
		
		JButton btnNewButton_1 = new JButton("Search for business flights");
		btnNewButton_1.setBounds(1056, 470, 226, 57);
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(new Color(0, 0, 102));
		btnNewButton_1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 12));
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBounds(0, 0, 0, 0);
		contentPane.add(btnNewButton_2);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Flighttype type=new Flighttype();
				type.setVisible(true);
				
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnBack.setBounds(47, 569, 109, 37);
		contentPane.add(btnBack);
		
		JButton btnNewButton_3 = new JButton("Save");
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_3.setBounds(277, 569, 101, 37);
		contentPane.add(btnNewButton_3);
		
		
		
		btnNewButton_1.addActionListener(new ActionListener() 
		{
			
			public void actionPerformed(ActionEvent e)
			{
				Business_Iflight bflight=new Business_Iflight();
				bflight.setVisible(true);
			}
		});
	}
}
