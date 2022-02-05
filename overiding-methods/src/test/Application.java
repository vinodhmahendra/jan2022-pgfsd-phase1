package test;

import domain.Employee;
import domain.Manager;

public class Application {

	public static void main(String[] args) {
//		Employee e = new Employee(101, "Jim Smith", "111-11-1111", 100_000.00);
//		
//		
//		Manager m = new Manager(101, "Joan Kern", "222-22-2222", 110_456.00, "Marketing");
//		
//		
//		System.out.println(e.getDetails());
//		
//		System.out.println(m.getDetails());
		
		
		Employee e =  new Manager(101, "Joan Kern", "222-22-2222", 110_456.00, "Marketing");
		
		//aspect of polymorphism called virtual method invocation
		System.out.println(e.getDetails());
	}

}
