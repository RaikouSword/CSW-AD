package garbage_collection;

public class Q1 {
	private String myObject;
	public static void main(String[] args) {
		testMethod();
		System.gc();
	}
	public Q1(String myObject) {
		this.myObject = myObject;
	}
	private static void testMethod() {
		Q1 myObjectTest1 = new Q1("myObjectTest1");
		testMethod2();
	}
	private static void testMethod2() {
		Q1 myObjectTest2 = new Q1("myObjectTest2");
	}
	protected void finalize() throws Throwable {
		System.out.println("Garbage Collection is successful for " + this.myObject);
	}
}
