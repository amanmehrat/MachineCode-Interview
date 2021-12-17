
public abstract class User {

	
	private static int id=0;
	private int userId;
	private String name;
	
	public User(String name) {
		id++;
		this.userId = id;
		this.name = name;
	}
	public int getUserId() {
		return userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	};
	
	

}
