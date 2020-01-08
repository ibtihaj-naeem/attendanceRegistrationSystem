package attendance_registration_system_V1;

public class Student {

	private String name = null;
	private String surname = null;
	private int id = 0;

	public Student(String name, String surname, int id) {
		// Super here for convention
		super();
		this.name = name;
		this.surname = surname;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public int getId() {
		return id;
	}

}
