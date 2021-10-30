package isp;

public class Person implements HasTelephone, HasEmail{ 
	
    private String name, address, email, telephone; 
    
    public void setEmail (String e) { email=e; } 
    public String getEmail () { return email; } 
     
    public void setTelephone(String t) { telephone=t; } 
    public String getTelephone() { return telephone; } 
    
    public void setName(String n) { name=n; } 
    public String getName() { return name; } 
     
    public void setAddress(String a) { address=a; } 
    public String getAddress() { return address; } 
  
}