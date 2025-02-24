package generics;
class Car{
	String brand;
	String model;
	String regdNumber;
	Car(String brand, String model, String regdNumber) {
		this.brand = brand;
		this.model= model;
		this.regdNumber = regdNumber;
	}
	public boolean equals(Object o) {
//		if(o instanceof Car) {
//			Car car = (Car) o;
//			if(car.getBrand()==this.brand && car.getModel()==this.getModel() && car.getRegistrationNumber()==this.getRegistrationNumber()) {
//				return true;
//			}else {
//				return false;
//			}
//		}
		if(o instanceof Car car) {
			return car.getBrand()==this.brand && car.getModel()==this.getModel() && car.getRegistrationNumber()==this.getRegistrationNumber();
		}
		else {
			return false;
		}
		
	}
	private Object getRegistrationNumber() {
		return regdNumber;
	}
	private Object getModel() {
		return model;
	}
	private String getBrand() {
		return brand;
	}
	public void setRegistraionNumber(String regdNumber){
		this.regdNumber = regdNumber;
	}
	public int hashCode() {
		return brand.length()-1;
	}
}
public class equal_override {
	public static void main(String[] args) {
		Car myCar = new Car("Ford","x","101");
		Car carInGarage = new Car("Toyota","y","202");
		System.out.println(myCar.equals(carInGarage));
		System.out.println(myCar.hashCode());
	}
}
