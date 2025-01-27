package oops;
class Multiply{
	int a =5, b =5;
	public int mul(int a , int b) {
		this.a =a;
		this.b =b;
		return a*b;
	}
}
public class Cohesive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multiply m = new Multiply();
		System.out.println(m.mul(5,5));
		System.out.println(m);
	}

}
