package team14.teamproject;

public class UserModel {
	public String name;
	private static final int APPROVER = 0;
	private static final int CLAIMANT = 1;
	public int role;
	
	public UserModel(String name, int role){
		this.name = name;
		this.role = role;
	}
}