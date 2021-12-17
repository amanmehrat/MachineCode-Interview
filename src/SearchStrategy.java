import java.util.ArrayList;
import java.util.HashMap;


//Strategy Pattern for SearchDeal
public interface SearchStrategy {
 public ArrayList<Deal> SearchDeal(HashMap<Integer,Deal> availableDeals,String searchItem);
}
