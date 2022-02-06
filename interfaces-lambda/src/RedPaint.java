
public class RedPaint implements SalesCalcs{
	
	private String name =" Red Paint";
	private double salaesPrice = 0.0;
	private double cost = 0.0;
	
	private double gallons = 0.0 ; // in pounds
	
	public RedPaint(double salaesPrice, double cost, double gallons) {
		super();
		this.salaesPrice = salaesPrice;
		this.cost = cost;
		this.gallons = gallons;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public double calcSalesPrice() {
		return this.salaesPrice *this.gallons;
	}

	@Override
	public double calcCost() {
		
		return this.cost + this.gallons;
	}

	@Override
	public double calcProfit() {
		return this.calcSalesPrice() - this.calcCost();
	}
	
	
	

}
