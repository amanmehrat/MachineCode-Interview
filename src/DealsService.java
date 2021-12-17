import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;

public class DealsService {

	private ArrayList<Deal> expiredDeals;
	private HashMap<Integer,Deal> availableDeals;
	public DealsService() {
		this.availableDeals = new HashMap<>();
		this.expiredDeals= new ArrayList<>();
	}
	
	public Deal claimDeal(Customer user, int dealId){
		
		Deal deal = this.availableDeals.get(dealId);
		
		if(deal.getQuantity()==0){
			System.out.println("All items sold in deal");
			return null;
		}
		
		if(deal.getStatus()==DealStatus.End){
			System.out.println("Deal end");
			return null;
		}
		
		if(deal.getEndTime().isBefore(LocalDateTime.now())){
			deal.endDeal();
			System.out.println("Deal expired");
			return null;
		}
		
		ArrayList<Item> orders = user.getOrders();		
		for(Item it : orders){
			if(it.getDealId()==dealId){
				System.out.println("You already bought this deal");
				return null;
			}
		}
		
		//Add item in User's Order
		Item item  = deal.getItem();
		item.setPrice(deal.getAmount());
		item.setDealId(dealId);
		orders.add(item);
		
		deal.setQuantity(deal.getQuantity()-1);
		if(deal.getQuantity()<=0){
			deal.endDeal();
			//expiredDeals.add(this.availableDeals.remove(dealId));
		}
		System.out.println("Deal claimed by "+user.getName()+ " and selled by "+deal.getSeller().getName());
		return deal;
	}

	
	public HashMap<Integer, Deal> getAvailableDeals() {
		return availableDeals;
	}

	public void setAvailableDeals(HashMap<Integer, Deal> availableDeals) {
		this.availableDeals = availableDeals;
	}
	
	public ArrayList<Deal> searchDeals(String itemName,SearchStrategy strategy){
		return strategy.SearchDeal(availableDeals, itemName);
	}
	
	public Deal chooseAnyDeal(ArrayList<Deal> deal){
		if(deal.size()==0){
			System.out.println("No Deals Found");
			return null;
		}
		return deal.get(0);
	}

}



