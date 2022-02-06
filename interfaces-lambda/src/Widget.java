
public class Widget implements SalesCalcs {

	private String name = " Widget ";
	private double salaesPrice = 0.0;
	private double cost = 0.0;

	private long quantity = 0; // in pounds

	public Widget(double salaesPrice, double cost, long quantity ) {
		super();
		this.salaesPrice = salaesPrice;
		this.cost = cost;
		this.quantity = quantity;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public double calcSalesPrice() {
		return this.salaesPrice * this.quantity;
	}

	@Override
	public double calcCost() {

		return this.cost + this.quantity;
	}

	@Override
	public double calcProfit() {
		return this.calcSalesPrice() - this.calcCost();
	}

}
