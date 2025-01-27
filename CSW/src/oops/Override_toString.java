package oops;
class Stud1{
	int rollno;
	String name;
	String city;
	Stud1(int rollno, String name, String city){
		this.rollno = rollno;
		this.name = name;
		this.city = city;
	}
	public String toString() {
		return rollno+" "+name+" "+city;
	}
}
public class Override_toString {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stud1 s1 = new Stud1(101,"Raj","lucknow");
		Stud1 s2 = new Stud1(102,"Vijay","ghaziabad");
		System.out.println(s1);
		System.out.println(s2);
	}
}
