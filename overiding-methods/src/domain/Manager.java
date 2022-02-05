package domain;

public class Manager extends Employee{

	private String deptName;

	public Manager(int empId, String name, String ssn, double salary,String deptName) {
		super(empId, name, ssn, salary);
		this.deptName = deptName;
	}
	
	public Manager(int empId, String name, String ssn, double salary) {
		super(empId, name, ssn, salary);
	}
	
	@Override
	public String getDetails() {
		return super.getDetails()  + " Dept " + deptName;
	}
	
}
