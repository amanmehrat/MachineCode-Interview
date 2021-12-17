import java.time.LocalDateTime;
import java.util.ArrayList;

public class TestMainMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DealsService dc = new DealsService();
		Customer c1 = new Customer("Aman");
		Customer c2 = new Customer("Ankit");
		Customer c3 = new Customer("Anuj");
		
		
		
		Seller s1 = new Seller("Rahul Electronics");
		Seller s2 = new Seller("Raj Electronics");
						
		
		Item i1 = new Item("Desktop");
		Item i2 = new Item("Laptop");
		Item i3 = new Item("LCD");
		
		LocalDateTime cd = LocalDateTime.now(); 
		
		
		Deal d1 = s1.createDeal(i1, 100, 2,cd.plusHours(2),dc);
		Deal d4 = s2.createDeal(i1, 10, 1,cd.plusHours(1),dc);
		Deal d3 = s2.createDeal(i3, 120, 1,cd.plusHours(1),dc);
		Deal d2 = s1.createDeal(i3, 20, 1,cd.plusHours(3),dc);
		
		ArrayList<Deal> searchedDeals = dc.searchDeals("Desktop", new DefaultSearchStrategy());
		System.out.println(searchedDeals);
		dc.claimDeal(c1, dc.chooseAnyDeal(searchedDeals).getDealId());
		dc.claimDeal(c1, dc.chooseAnyDeal(searchedDeals).getDealId());//Already bought this deal
		dc.claimDeal(c2, dc.chooseAnyDeal(searchedDeals).getDealId());
		dc.claimDeal(c3, dc.chooseAnyDeal(searchedDeals).getDealId());//Deal End
	
		System.out.println(dc.getAvailableDeals());
		searchedDeals = dc.searchDeals("LCD", new DefaultSearchStrategy());
		System.out.println(searchedDeals);
		dc.claimDeal(c1, dc.chooseAnyDeal(searchedDeals).getDealId());
		d2.setStatus(DealStatus.End);
		dc.claimDeal(c3, dc.chooseAnyDeal(searchedDeals).getDealId());
		
		
		System.out.println(c1.getOrders());
		System.out.println(c2.getOrders());
		
	}

}
