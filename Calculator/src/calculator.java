
public class calculator {
	
	
	private int sum(int num1, int num2)
	{
		return num1 + num2;
	}
	
	public int sub(int num1, int num2)
	{
		 
		return num1 - num2;
	}
	public int mul(int num1, int num2)
	{
		System.out.println(sum(num1,num2));	 
		return num1 * num2;
	}
	public int div(int num1, int num2)
	{
		return num2 / num1;
	}
	
	public static void name()
	{
		System.out.println("Sameer");
	}
	
	
	public int fact(int num1)
	{		
			int result=1;
			for (int i=1;i<=num1;i++)
			{
			result=result*i;
			}
			
		return result;
		
	}
}

