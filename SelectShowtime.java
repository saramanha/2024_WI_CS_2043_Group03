package project.xyz;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.*;

public class SelectShowtime extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args, User inUse, Movie selected, ArrayList<Showtime> available) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SelectShowtime frame = new SelectShowtime(inUse, selected, available);
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
	public SelectShowtime(User inUse, Movie selected, ArrayList<Showtime> available) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSelectShowtime = new JLabel("Select Showtime");
		lblSelectShowtime.setHorizontalAlignment(SwingConstants.CENTER);
		lblSelectShowtime.setBounds(90, 30, 280, 20);
		contentPane.add(lblSelectShowtime);
		
		JTextPane movieText = new JTextPane();
		movieText.setText(selected.printInfo());
		movieText.setBounds(12, 62, 416, 88);
		contentPane.add(movieText);
		
		JLabel lblPremiumScreen = new JLabel("Premium Screen");
		lblPremiumScreen.setBounds(12, 178, 122, 15);
		contentPane.add(lblPremiumScreen);
		
		JLabel lblStandardScreen = new JLabel("Standard Screen");
		lblStandardScreen.setBounds(12, 225, 122, 15);
		contentPane.add(lblStandardScreen);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//go to SelectMovie Frame
				dispose();
				SelectMovie selectMovie = new SelectMovie(inUse);
				selectMovie.setVisible(true);
			}
		});
		btnBack.setBounds(12, 28, 117, 25);
		contentPane.add(btnBack);
		
		JButton btnSelect = new JButton("Select");
		btnSelect.setBounds(350, 174, 78, 25);
		contentPane.add(btnSelect);
		
		JButton btnSelect_1 = new JButton("Select");
		btnSelect_1.setBounds(350, 221, 78, 25);
		contentPane.add(btnSelect_1);
		
	}
}
