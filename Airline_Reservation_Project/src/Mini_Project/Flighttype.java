package Mini_Project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Window;

import javax.swing.JButton;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.border.BevelBorder;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Flighttype extends JFrame  {

	public JPanel contentPane;
    public JFrame frame;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Flighttype frame = new Flighttype();
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
	public Flighttype() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1370, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
contentPane.setLayout(null);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("TYPE OF FLIGHT");
		lblNewLabel.setFont(new Font("Book Antiqua", Font.BOLD, 50));
		lblNewLabel.setBounds(426, 91, 515, 113);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("booktickets.com");
		lblNewLabel_1.setFont(new Font("Forte", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(10, 0, 277, 57);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("INTERNATIONAL FLIGHTS");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				International_flights inter=new International_flights();
				inter.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("STSong", Font.PLAIN, 42));
		btnNewButton.setBounds(334, 258, 591, 81);
		contentPane.add(btnNewButton);
		
		JButton btnDomesticFlights = new JButton("DOMESTIC FLIGHTS");
		btnDomesticFlights.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Domestic_flights dom=new Domestic_flights();
				dom.setVisible(true);
			}
		});
		btnDomesticFlights.setFont(new Font("STSong", Font.PLAIN, 42));
		btnDomesticFlights.setBounds(334, 399, 591, 81);
		contentPane.add(btnDomesticFlights);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(179, 91, 954, 487);
		contentPane.add(panel);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Login frame = new Login();
				frame.setVisible(true);
			}
		});
		btnBack.setBounds(1146, 595, 89, 23);
		contentPane.add(btnBack);
	}



		
	}


