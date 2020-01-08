package attendance_registration_system_V1;

import java.time.LocalDate;
import java.time.chrono.HijrahChronology;
import java.time.chrono.HijrahDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.swing.JMenu;

public class DateCalculator {

	/**
	 * Obtains time and date from system to display on status bar
	 */
	public void currentDate(JMenu date, JMenu time, JMenu islamicDate) {
		Calendar cal = new GregorianCalendar(); // This method is used to calculate the Gregorian date.
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int month = cal.get(Calendar.MONTH);
		int year = cal.get(Calendar.YEAR);
		date.setText(day + "/" + (month + 1) + "/" + year); // Adding 1 to the month is because the system counts
															// January as month zero

		int seconds = cal.get(Calendar.SECOND); // This method is used to calculate the time in the specific moment the
												// program is opened
		int minute = cal.get(Calendar.MINUTE);
		int hour = cal.get(Calendar.HOUR);
		time.setText(hour + ":" + minute + ":" + seconds); // This prints the time in an HH:MM:SS format

		Date gregDate = new Date(); // Gregorian date
		Calendar cl = Calendar.getInstance();
		cl.setTime(gregDate);
		HijrahDate islamicdate = HijrahChronology.INSTANCE
				.date(LocalDate.of(cl.get(Calendar.YEAR), cl.get(Calendar.MONTH) + 1, cl.get(Calendar.DATE)));
		islamicDate.setText(islamicdate.toString()); // Converting the HijrahDate object to String to set it as text
	}

}
