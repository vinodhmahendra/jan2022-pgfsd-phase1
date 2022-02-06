
public class CrushedRock implements SalesCalcs{
	
	private String name =" Crudhed Rock";
	private double salaesPrice = 0.0;
	private double cost = 0.0;
	
	private double weight = 0.0 ; // in pounds
	
	public CrushedRock(double salaesPrice, double cost, double weight) {
		super();
		this.salaesPrice = salaesPrice;
		this.cost = cost;
		this.weight = weight;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public double calcSalesPrice() {
		return this.salaesPrice *this.weight;
	}

	@Override
	public double calcCost() {
		
		return this.cost + this.weight;
	}

	@Override
	public double calcProfit() {
		return this.calcSalesPrice() - this.calcCost();
	}
	
	
	

}
