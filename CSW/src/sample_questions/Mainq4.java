package sample_questions;
class Laptop {
	String model;
	int price;
	public Laptop(String model,int price) {
		this.model = model;
		this.price = price;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Laptop Model: "+model+"\nPrice: $"+price;
	}
}
public class Mainq4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Laptop l = new Laptop("HP Pavillion", 60000);
		l.setModel("HP");
		System.out.println(l);
	}

}
