package isp;

public class Main {
	public static void main(String[] args) {
		
		GmailAccount ga = new GmailAccount();
		ga.setEmail("g@gmail.com");
		
		EmailSender.sendEmail(ga, "probaaaa1");
		//SMSSender.sendSMS(ga, "probaaaa2");
		
	}
}
