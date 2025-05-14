package cswlab;

public class Question2 {
	@FunctionalInterface
	interface printingSomeText{
		void print(String anyValue);
		
		
	}
	public void printLambdaText(String lambdaText, printingSomeText pst) {
		pst.print(lambdaText);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Question2 lmd1 =new Question2();
		String LambdaText ="Understanding Lambdas ";
		printingSomeText pst=(String letsprint)
		

	}

}

