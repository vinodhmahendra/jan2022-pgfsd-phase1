package domain;

public class Shirt {

	private int shirtID = 0;
	private String description ="";
	private String color ="";
	private String size = "";
	private StringBuilder sb = new StringBuilder();
	
	private Shirt() { }
	
	public static Shirt newShirt (int id , String description,String color,String size) {
		Shirt newShirt = new Shirt();
		newShirt.setShirtID(id);
		newShirt.setDescription(description);
		newShirt.setColor(color);
		newShirt.setSize(size);
		
		return newShirt;
	}
	
	public String toString() {
		sb.append("Shirt Id: " + this.getShirtID() + "\n");
		sb.append("Description: " + this.getDescription()+ "\n");
		sb.append("Color: " + this.getColor() + "\n");
		sb.append("Size: " + this.getSize() + "\n");
	
		return sb.toString();
		
	}
	
	

	/**
	 * @return the shirtID
	 */
	public int getShirtID() {
		return shirtID;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @return the size
	 */
	public String getSize() {
		return size;
	}

	/**
	 * @param shirtID the shirtID to set
	 */
	public void setShirtID(int shirtID) {
		this.shirtID = shirtID;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @param size the size to set
	 */
	public void setSize(String size) {
		this.size = size;
	}
	
	
	
}
