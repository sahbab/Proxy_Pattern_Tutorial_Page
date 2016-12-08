package protectionproxy;

public class Users {
	private String name; 
	private int role;
	
	
	public Users(String name, int role) {
		super();
		this.name = name;
		this.role = role;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRole() {
		return role;
	}
	public void setRole(int role) {
		this.role = role;
	} 
	
	
}
