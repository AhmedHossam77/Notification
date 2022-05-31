package Users;

public class Student extends User{

	int id;
	
	public Student(String name, int iD, String email, String phoneNumber) {
		super();
		this.name = name;
		id = iD;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int iD) {
		id = iD;
	}
	
	
	public void notifyStudent(String message) {
		// do some stuff
	}
	
}
