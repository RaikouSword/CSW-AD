package oops;
interface Topic{
	void understand();
}
class Topic1 implements Topic{
	@Override
	public void understand() {
		System.out.println("Topic1 understood");
	}
}
class Topic2 implements Topic{
	public void understand(){
		System.out.println("Topic2 understood");
	}
}
public class loose_coupling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Topic t = new Topic1();
		t.understand();
	}

}
