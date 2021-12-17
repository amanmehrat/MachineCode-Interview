import java.util.ArrayList;
import java.util.HashMap;

//Default strategy simple return all items matched
public class DefaultSearchStrategy implements SearchStrategy {

	@Override
	public ArrayList<Deal> SearchDeal(HashMap<Integer, Deal> availableDeals,String searchItem) {
		// TODO Auto-generated method stub
		
		ArrayList<Deal> filteredDeals = new ArrayList<>();
		for(int dealId : availableDeals.keySet()){
			Deal d = availableDeals.get(dealId);
			//System.out.println("d");
			//System.out.println(d);
			if(d.getItem().getName().equals(searchItem) && d.getStatus()==DealStatus.Available){
				filteredDeals.add(d);
			}
		}
		return filteredDeals;
	}

}
