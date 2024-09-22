package programs;

public class MathFunctions {

	public void Addition(int a, int b) {

	int c = 0;
	
	c = a + b;
	
	System.out.println("Addition of two numbers a & b is : " +c);
	
	}
	
	public void Subtraction(int a, int b) {
		
		int c = a - b;
		
		System.out.println("Subtraction of two numbers a & b  :" +c);
	}
	
	
	public static void main(String[] args) {
	
		MathFunctions mf = new MathFunctions();
		mf.Addition(10,20);
		mf.Subtraction(100, 20);

		
		
		
	}

}
