package user;

public class User {
	
	private String name;
	
	private UserStatus userStatus = UserStatus.REGULAR;

	public UserStatus getUserStatus() {
		return userStatus;
	}

	public String getName() {
		return name;
	}
	
}
