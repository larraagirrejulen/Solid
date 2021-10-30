package isp;

public class GmailAccount implements HasEmail{
	
	public String name, emailAddress;

	@Override
	public void setEmail(String e) {
		this.emailAddress = e;
		
	}

	@Override
	public String getEmail() {
		return this.emailAddress;
	}

}
