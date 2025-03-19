package garbage_collection;

public class Q3 {
	String myObject;
	public Q3(String myObject) {
		this.myObject = myObject;
	}
	public static void main(String[] args) {
		new Q3("testObject_anonymous");
		System.gc();
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Garbage Collection is successful for " + this.myObject);
	}
}
