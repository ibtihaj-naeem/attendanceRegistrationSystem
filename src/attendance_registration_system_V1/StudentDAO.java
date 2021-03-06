package attendance_registration_system_V1;

public interface StudentDAO {

	/**
	 * Retrieves a student from the database.
	 * 
	 * @return ArrayList<Track>
	 */
	abstract public void getStudent();

	/**
	 * Persists a student to the database
	 * 
	 * @param book
	 */
	abstract public void writeTrack(Student student);

	/**
	 * Retrieves all students from the database
	 */
	abstract public void showAllStudents();

	/**
	 * Open the connection to the database
	 * 
	 */

	abstract public void openConnection();

	/**
	 * Close the connection to the database
	 *
	 * When you're finished with the db its very important that you close the
	 * connections so that data gets persisted.
	 */
	abstract public void closeConnection();
}
