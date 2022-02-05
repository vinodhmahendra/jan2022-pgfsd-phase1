package utility;

import domain.Employee;
import domain.Engineer;
import domain.Manager;

public class BadBonus {
	
	//! object oriented 
	public double getBonusPercent ( Employee e) {
		return 0.01;
	}
	
	public double getBonusPercent ( Manager m) {
		return 0.03;
	}

	
	public double getBonusPercent ( Engineer e) {
		return 0.01;
	}
}
