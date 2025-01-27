package oops;

class Account1 {
	int acc_no;
	String name;
	String email;
	double amt;

	public int getAcc_no() {
		return acc_no;
	}

	public void setAcc_no(int acc_no) {
		this.acc_no = acc_no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getAmt() {
		return amt;
	}

	public void setAmt(double amt) {
		this.amt = amt;
	}
}

public class Account {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account1 a = new Account1();
		a.setAcc_no(002);
		a.setAmt(89.56);
		a.setEmail("tayewr@emil.com");
		a.setName("Nyx");
		System.out.println("Account holder name is: " + a.getName());
		System.out.println("Acount holder email is: " + a.getEmail());
		System.out.println("Accound holder acc_no is: " + a.getAcc_no());
		System.out.println("Accoutn holder balance is: " + a.getAmt());
	}

}
