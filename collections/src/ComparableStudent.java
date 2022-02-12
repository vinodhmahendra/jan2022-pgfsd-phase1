
public class ComparableStudent implements Comparable<ComparableStudent> {

	private String name;
	private long id = 0;
	private double gpa = 0.0;

	@Override
	public String toString() {
		return "Name: " + this.name + "  ID : " + this.id + "   GPA:" + this.gpa;
	}

	public ComparableStudent(String name, long id, double gpa) {
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

	@Override
	public int compareTo(ComparableStudent s) {
		int result = this.name.compareTo(s.getName());
		if (result > 0) {
			return 1; // s comes after the current element
		} else if (result < 0) {
			return -1; // s comes before the current element
		} else {
			return 0; // s is equal to the current object
		}
	}

}
