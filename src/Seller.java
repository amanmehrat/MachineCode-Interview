import java.sql.Date;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Seller extends User {

	public Seller(String name) {
		super(name);
		System.out.println(this);
	}
	
	public Deal createDeal(Item item,double price,int quantity,LocalDateTime endTime,DealsService dc){
		Deal deal = new Deal(this, item, quantity, price,endTime);
		dc.getAvailableDeals().put(deal.getDealId(),deal);
		return deal;
	}

	@Override
	public String toString() {
		return "Seller[name=" +super.getName() + "]";
	}
}


