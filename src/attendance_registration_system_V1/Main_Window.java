package attendance_registration_system_V1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;

public class Main_Window {

	private DateCalculator dateCalc;

	private JFrame frame;
	private JMenuBar statusBar;
	private JMenu dateText;
	private JMenu timeText;
	private JMenu islamicDateText;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main_Window window = new Main_Window();
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
	public Main_Window() {
		initialize();
		dateCalc.currentDate(dateText, timeText, islamicDateText);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		dateCalc = new DateCalculator();

		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		statusBar = new JMenuBar();
		frame.setJMenuBar(statusBar);

		dateText = new JMenu("Date");
		statusBar.add(dateText);

		islamicDateText = new JMenu("Islamic Date");
		statusBar.add(islamicDateText);

		timeText = new JMenu("Time");
		statusBar.add(timeText);
	}

}
