
public class Item {

	private static int id=1;
	private int itemId;
	private int dealId;
	private String name;
	private Double price;
	
	
	public Item(String name) {
		super();
		id++;
		this.itemId = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Item [ItemName = " + name + "]";
	}

	public String getName() {
		return name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public int getDealId() {
		return dealId;
	}

	public void setDealId(int dealId) {
		this.dealId = dealId;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
}
