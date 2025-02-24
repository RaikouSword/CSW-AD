package generics;
import java.util.*;
class MyGeneric<T1,T2>{
	public MyGeneric(int i, String string) {
	}
	public void setT1(T1 t1) {
	}
	public String getT1() {
		return null;
	}
	public Integer getT2() {
		return null;
	}
}
public class q1{
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList();
		al.add(54);
		al.add(643);
		int a = (int) al.get(0);
		MyGeneric<String,Integer> g1 = new MyGeneric(23,"abc");
		String str = g1.getT1();
		Integer int1 = g1.getT2();
		System.out.println(str+" "+int1);
	}
}
