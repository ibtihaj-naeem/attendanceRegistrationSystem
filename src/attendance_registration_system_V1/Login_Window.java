package attendance_registration_system_V1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JMenuBar;
import javax.swing.JMenu;

public class Login_Window {

	private DateCalculator dateCalc;
	
	private JFrame frmAttendanceRegistrationSystem;
	private JTextField usernameField;
	private JPasswordField passwordField;
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
		dateCalc.currentDate(dateText, timeText, islamicDateText);
	}

	/**
	 * Initialise the contents of the frame.
	 */
	public void initialize() {
		
		dateCalc = new DateCalculator();
		
		frmAttendanceRegistrationSystem = new JFrame();
		frmAttendanceRegistrationSystem.setTitle("Attendance Registration System");
		frmAttendanceRegistrationSystem.setBounds(100, 100, 460, 320);
		frmAttendanceRegistrationSystem.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAttendanceRegistrationSystem.getContentPane().setLayout(null);
		
		JButton exitButton = new JButton("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                exitButtonActionPerformed(e);
            }
        });
		exitButton.setBounds(12, 215, 97, 25);
		frmAttendanceRegistrationSystem.getContentPane().add(exitButton);
		
		JButton loginButton = new JButton("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
            	loginButtonActionPerfomed(e);
            }
        });
		loginButton.setBounds(333, 215, 97, 25);
		frmAttendanceRegistrationSystem.getContentPane().add(loginButton);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(120, 74, 68, 16);
		frmAttendanceRegistrationSystem.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(120, 124, 56, 16);
		frmAttendanceRegistrationSystem.getContentPane().add(lblPassword);
		
		usernameField = new JTextField();
		usernameField.setBounds(200, 71, 116, 22);
		frmAttendanceRegistrationSystem.getContentPane().add(usernameField);
		usernameField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(200, 121, 116, 22);
		frmAttendanceRegistrationSystem.getContentPane().add(passwordField);
		
		statusBar = new JMenuBar();
		frmAttendanceRegistrationSystem.setJMenuBar(statusBar);
		
        dateText = new JMenu();
        dateText.setText("Date");
		statusBar.add(dateText);
		
		islamicDateText = new JMenu("Islamic Date");
		statusBar.add(islamicDateText);
		
		timeText = new JMenu("Time");
		statusBar.add(timeText);

	}
	
	/**
	 * Method to execute when the event from the exit button occurs
	 */
    private void exitButtonActionPerformed(java.awt.event.ActionEvent e) {
        System.exit(0);
    }
    
	/**
	 * Method to execute when the event from the login button occurs
	 */
    private void loginButtonActionPerfomed(java.awt.event.ActionEvent e) {
    	frmAttendanceRegistrationSystem.dispose();
        Main_Window.main(null);
    }
    
}
