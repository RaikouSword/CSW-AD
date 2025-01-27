package oops;

public class encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stud s1 = new stud();
		s1.setName("Roe");
		System.out.println(s1.getName());
	}

}
class stud{
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
