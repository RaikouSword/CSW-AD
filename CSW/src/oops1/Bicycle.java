package oops1;
class Bicycle implements Vehicle{
	static int speed;
	static int gear;
	@Override
	public void changeGear(int newGear) {
		gear = newGear;
	}
	@Override
	public void speedUp(int increament) {
		speed = speed+increament;
	}
	@Override
	public void applyBrakes(int decreament) {
		speed = speed - decreament;
	}
	public void pritnStates() {
		System.out.println("speed: "+speed+" gear: "+gear);
	}
	
}
