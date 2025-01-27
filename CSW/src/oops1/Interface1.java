package oops1;

public class Interface1 {
	public static void main(String[] args) {
		Bicycle b = new Bicycle();
		b.changeGear(2);
		b.speedUp(3);
		b.applyBrakes(1);
		System.out.println("Bicycle present state: ");
		b.pritnStates();
		Bike bk = new Bike();
		bk.changeGear(1);
		bk.speedUp(4);
		bk.applyBrakes(3);
		System.out.println("Bike present state: ");
		bk.pritnStates();
	}
}
