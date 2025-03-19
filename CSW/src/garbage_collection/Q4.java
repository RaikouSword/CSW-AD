package garbage_collection;

public class Q4 {
	public static void main(String args[]) {
		Q4 a=  new Q4();
		a.msg("normal object");
		new Q4().msg("Anonymous Object");
	}
	public void msg(String m) {
		System.out.println(m);
	}
}
