package oops;

public class static_eg {
	static {
		System.out.println("Static");
	}
	static int square(int s) {
		return s*s;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res = square(5);
		System.out.println(res);
	}

}
