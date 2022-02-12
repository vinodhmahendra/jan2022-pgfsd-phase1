
public class Student  {

	private String name;
	private long id = 0;
	private double gpa = 0.0;

	@Override
	public String toString() {
		return "Name: " + this.name + "  ID : " + this.id + "   GPA:" + this.gpa;
	}

	public Student(String name, long id, double gpa) {
		super();
		this.name = name;
		this.id = id;
		this.gpa = gpa;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @return the gpa
	 */
	public double getGpa() {
		return gpa;
	}

	

}
