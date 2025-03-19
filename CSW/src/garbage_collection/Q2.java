package garbage_collection;

public class Q2 {
	private String myObject;
	public Q2(String myObject) {
		this.myObject = myObject;
	}
	public static void main(String[] args) {
		Q2 testObject1 = new Q2("testObject1");
		Q2 testObject2 =  new Q2("testObject2");
		testObject1 = null;
		System.gc();
	}
	@Override
	protected void finalize() throws Throwable{
		System.out.println("Garbage collection is successful for "+this.myObject);
	}
}
