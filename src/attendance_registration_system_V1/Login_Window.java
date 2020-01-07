package attendance_registration_system_V1;

import java.awt.EventQueue;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login_Window {

	private JFrame frmAttendanceRegistrationSystem;
	private JPanel statusBarTime;
	private JTextField usernameField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login_Window window = new Login_Window();
					window.frmAttendanceRegistrationSystem.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login_Window() {
		initialize();
	}

	/**
	 * Obtains time and date from system to display on status bar
	 */
	public void CurrentDate(){ // this method is used to calculate the gregorian date. The reason I am adding to the month
	    Calendar cal = new GregorianCalendar(); // is because the system counts January as month zero therefore to get the actual month I have to add 1
	    int day = cal.get(Calendar.DAY_OF_MONTH);
	    int month = cal.get(Calendar.MONTH);
	    int year = cal.get(Calendar.YEAR);
	    //menuDate.setText(day + "/" + (month+1) + "/"  +year); // This prints the date as intended
	    
	    int seconds = cal.get(Calendar.SECOND); // this method is used to calculate the time in the specific moment the program is opened
	    int minute = cal.get(Calendar.MINUTE);
	    int hour = cal.get(Calendar.HOUR);  
	    //menuTime.setText(hour + ":" + minute + ":" + seconds); // This prints the time in an HH:MM:SS format 
	    }

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frmAttendanceRegistrationSystem = new JFrame();
		frmAttendanceRegistrationSystem.setTitle("Attendance Registration System");
		frmAttendanceRegistrationSystem.setBounds(100, 100, 450, 300);
		frmAttendanceRegistrationSystem.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAttendanceRegistrationSystem.getContentPane().setLayout(null);
		
		JLabel menuDate = new JLabel("Date");
		menuDate.setBounds(12, 0, 68, 20);
		frmAttendanceRegistrationSystem.getContentPane().add(menuDate);
		
		JPanel statusBarDate = new JPanel();
		statusBarDate.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.BLACK, null, null, null));
		statusBarDate.setBounds(0, 0, 80, 20);
		frmAttendanceRegistrationSystem.getContentPane().add(statusBarDate);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(80, 0, 2, 20);
		frmAttendanceRegistrationSystem.getContentPane().add(separator);
		
		JLabel menuTime = new JLabel("Time");
		menuTime.setHorizontalAlignment(SwingConstants.LEFT);
		menuTime.setBounds(92, 0, 68, 20);
		frmAttendanceRegistrationSystem.getContentPane().add(menuTime);
		
		statusBarTime = new JPanel();
		statusBarTime.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.BLACK, null, null, null));
		statusBarTime.setBounds(80, 0, 80, 20);
		frmAttendanceRegistrationSystem.getContentPane().add(statusBarTime);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setBounds(160, 0, 2, 20);
		frmAttendanceRegistrationSystem.getContentPane().add(separator_1);
		
		JButton exitButton = new JButton("Exit");
		exitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		exitButton.setBounds(12, 215, 97, 25);
		frmAttendanceRegistrationSystem.getContentPane().add(exitButton);
		
		JButton loginButton = new JButton("Login");
		loginButton.setBounds(323, 215, 97, 25);
		frmAttendanceRegistrationSystem.getContentPane().add(loginButton);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(115, 83, 68, 16);
		frmAttendanceRegistrationSystem.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(115, 133, 56, 16);
		frmAttendanceRegistrationSystem.getContentPane().add(lblPassword);
		
		usernameField = new JTextField();
		usernameField.setBounds(195, 80, 116, 22);
		frmAttendanceRegistrationSystem.getContentPane().add(usernameField);
		usernameField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(195, 130, 116, 22);
		frmAttendanceRegistrationSystem.getContentPane().add(passwordField);

	}
}
