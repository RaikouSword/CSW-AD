//Q1
package ass1;
class Car{
	String make;
	String model;
	Car(String make, String model){
		this.make=make;
		this.model = model;
	}
	public void setmake(String make) {
		this.make = make;
	}
	public void setmodel(String model) {
		this.model = model;
	}
	public String getmake() {
		return make;
	}
	public String getmodel() {
		return model;
	}
}
public class CarTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar1 = new Car("xy" ,"29");
		Car myCar2= new Car(null, "0");
		System.out.println("Car details of Car1 are: ");
		System.out.println("Make: "+myCar1.getmake()+" Model: "+myCar1.getmodel());
		System.out.println("Car details of Car2(initial) are: ");
		System.out.println("Make: "+myCar2.getmake()+" Model: "+myCar2.getmodel());
		myCar2.setmake("ab");
		myCar2.setmodel("40");
		System.out.println("Car details of Car2(final) are: ");
		System.out.println("Make: "+myCar2.getmake()+" Model: "+myCar2.getmodel());
	}

}
