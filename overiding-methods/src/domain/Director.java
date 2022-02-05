package domain;

public class Director extends Manager{
	private double budget;

	public Director(int empId, String name, String ssn, double salary,double budget) {
		super(empId, name, ssn, salary);
		this.budget = budget;
	}
	
	public boolean approveExpence () {
		return  true;
	}
	
	public double getBudget() {
		return budget;
	}
	
	
}
