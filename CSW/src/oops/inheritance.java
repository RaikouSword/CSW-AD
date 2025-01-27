package oops;
class Anime{
	String name;
	final int health = 100;
	void f() {
		System.out.println(name + "is dead");
	}
}
class Crossover extends Anime{
	private String name = "Madara Uchiha";
	private String slut = "Mitsuru";
	void f(){
		System.out.println(name+" f* "+ slut);
	}
}
public class inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Anime c = new Crossover();
		c.f();
	}

}
