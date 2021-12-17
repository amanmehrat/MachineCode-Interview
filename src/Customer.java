import java.util.ArrayList;

public class Customer extends User{

	private ArrayList<Item> orders;

	public Customer(String name) {
		super(name);
		this.orders = new ArrayList<>();
		System.out.println(this);
	}

	public ArrayList<Item> getOrders() {
		System.out.print(this.getName()+" Orders :");
		return orders;
	}

	@Override
	public String toString() {
		return "Customer [name=" +super.getName() + "]";
	}

	
}
