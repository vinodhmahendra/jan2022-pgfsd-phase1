package demo;

public class BankEMICalculator {

	private String customerName;
	private String accountNo;
	private double loanAmount;
	private EMICalculatorHelper helper = new EMICalculatorHelper();

	public BankEMICalculator(String name, String accoutNumber) {
		this.customerName = name;
		this.accountNo = accoutNumber;
	}

	public EMICalculatorHelper getHelper() {
		return helper;
	}

	public double getLoanAmount() {
//		loanTerm = 6;
		return loanAmount;
	}

	private class EMICalculatorHelper {
		int loanTerm = 60;
		double interestRate = 0.9;
		double interestpermonth = interestRate / loanAmount;

		protected double calcMonthyPayment(double loanAMount) {
			double EMI = (loanAMount * interestpermonth)
					/ ((1.0) - ((1.0) / Math.pow(1.0 + interestpermonth, loanTerm)));
			return (Math.round(EMI));

		}
	}

	public static void main(String[] args) {

		BankEMICalculator object = new BankEMICalculator("vinodh", "1111");

		object.getHelper().calcMonthyPayment(20000);
	}

}
