package oops;
class Demo{
	String name;
	void method() {
		System.out.println("Demo");
	}
}
class Demo1 extends Demo{
	@Override
	void method() {
		System.out.println("Demo1");
	}
}
public class upcasting {
	public static void main(String[] args) {
		Demo d = new Demo1();
		d.name = "Parent";
		System.out.println(d.name);
		d.method();
	}
}
