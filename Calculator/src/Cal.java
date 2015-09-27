
public class Cal {

	public static void main(String[] args) {
		
		int num1=5,num2=10;
		
		calculator obj1=new calculator();
		
		//System.out.println(obj1.sum(num1,num2));
		System.out.println(obj1.sub(num1,num2));
		System.out.println(obj1.mul(num1,num2));
		System.out.println(obj1.div(num1,num2));
		calculator.name();
		System.out.println("Factorial "+obj1.fact(num1));
		
	}

}
