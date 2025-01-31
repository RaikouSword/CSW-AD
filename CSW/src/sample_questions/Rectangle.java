package sample_questions;

public class Rectangle {
	int len,wid;
	
	Rectangle(int len, int wid){
		this.len = len;
		this.wid =wid;
	}
	public void setlen(int len) {
		this.len = len;
	}
	public void setwid(int wid) {
		this.wid = wid;
	}
	public int getlen() {
		return len;
	}
	public int getwid() {
		return wid;
	}
	int area() {
		return len*wid;
	}
	int perimeter() {
		return 2*(len+wid);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r = new Rectangle(0,0);
		r.setlen(10);
		r.setwid(10);
		System.out.println("Length is set to be: "+r.getlen()+ "/nWidth is set to be: "+r.getwid());
		System.out.println("Area: "+r.area());
		System.out.println("Perimeter: "+r.perimeter());
	}

}
