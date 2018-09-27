package example1.deep;

public class Address implements Cloneable{

	private String street;
	private String city;

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}

}
