package pp2017.team10.server.engine;

public class User {
	public String user;
	public String password;
	
	public User(String username, String pw){
		this.user = username;
		this.password = pw;
	}
	
	public String getUser(){
		return this.user;
	}
	
	public String getPassword(){
		return this.password;
	}
}