package oops;
class Address{
	String city, state, country;
	Address(String city, String state, String country){
		this.city = city;
		this.state = state;
		this.country = country;
	}
}
public class Aggregation {
	int id;
	String name;
	Address address;
	public Aggregation(int id, String name, Address address) {
		this.id = id;
		this.name = name;
		this.address =address;
		
	}
	void display() {
		System.out.println(id+" "+name);
		System.out.println(address.city+" "+address.state+" "+address.country);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address address = new Address("ab" , "cd", "ef");
		Aggregation a = new Aggregation(11,"Roro", address);
		a.display();
	}

}
