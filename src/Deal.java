import java.sql.Date;
import java.time.LocalDateTime;

public class Deal {

	private static int id=1;
	private int dealId;
	private Seller seller;
	private Item item;
	private int quantity;
	private double amountPerItem;
	private DealStatus status;
	private LocalDateTime endTime;
	
	@Override
	public String toString() {
		return "Deal [dealId=" + dealId + ", seller=" + seller + ", item=" + item + ", quantity=" + quantity
				+ ", amountPerItem=" + amountPerItem + ", status=" + status + ", endTime=" + endTime + "]";
	}

	public Deal(Seller seller, Item item, int quantity, double amount,LocalDateTime endTime) {
		super();
		this.id++;
		this.dealId=id;
		this.seller = seller;
		this.item = item;
		this.quantity = quantity;
		this.amountPerItem = amount;
		this.status=DealStatus.Available;
		this.endTime=endTime;
	}

	public void setStatus(DealStatus status) {
		this.status = status;
	}
	
	public void setEndTime(LocalDateTime endTime) {
		this.endTime = endTime;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public int getDealId() {
		return dealId;
	}

	public Seller getSeller() {
		return seller;
	}

	public Item getItem() {
		return item;
	}

	public int getQuantity() {
		return quantity;
	}

	public double getAmount() {
		return amountPerItem;
	}

	public void setAmountPerItem(double amountPerItem) {
		this.amountPerItem = amountPerItem;
	}

	public void endDeal() {
		this.setStatus(DealStatus.End);
	}

	public DealStatus getStatus() {
		return status;
	}


	public LocalDateTime getEndTime() {
		return endTime;
	}

	
	public boolean isAvailable(){
		LocalDateTime newdate =  LocalDateTime.now();
		return newdate.equals(this.endTime);
	}
}
