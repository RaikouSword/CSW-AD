package oops;
class Box{
	public int volume;
	Box(int len, int wid, int hei){
		this.volume = len*wid*hei;
	}
}
public class Tight_coupling {
	public static void main(String[] args) {
		Box b = new Box(5,5,5);
		System.out.println(b.volume);
	}
}
