package defaultpackage;

public class Address {
	
	

private String addressLine1, addressLine2,city,state,zip;

public Address() 
{ 
		
}
	
public Address(String homeAddressLine1, String homeAddressLine2, String homeCity, String homeState, String homeZip) {
	
	

	
this.addressLine1 = homeAddressLine1;
this.addressLine2 = homeAddressLine2;
this.city = homeCity;
this.state = homeState;
this.zip = homeZip;
		
}
	
public String getAddressLine1() 
{
return addressLine1;
}
public void setAddressLine1(String addressLine1) 
{
this.addressLine1 = addressLine1;
}
		
public String getAdddress2()
{
return addressLine2;
}
public void setAddress2(String addressLine2)
{
this.addressLine2 = addressLine2;
}
		
public String getCity() 
{
return city;
}
public void setCity(String city) 
{
this.city = city;
}

public String getState() 
{
return state;
}
	
public void setState(String state) 
{
this.state = state;
}
		
public String getZip() 
{
return zip;
}
public void setZip(String zip)
{
this.zip = zip;
}
	
public String toSring() 
{
String fullAddress;
fullAddress = addressLine1 + " " + addressLine2 + " " + city + " " + state + " " + zip;			
return fullAddress;
}
		
}
	
	

	

