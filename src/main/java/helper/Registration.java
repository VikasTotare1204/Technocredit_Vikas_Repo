package helper;

public interface Registration {

	void login(String uname,String pwd);
	void login(String uname, String pwd, String city, int pincode);
	String forgotpwd(String uname);
		
	
}
