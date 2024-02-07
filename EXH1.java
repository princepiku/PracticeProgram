public class EXH1
{
	public static void main(String alex[])
	{
		try
		{	
			int a = 10;
			int b = 0;
			int div = a / b;
			System.out.println(div);
		}
		catch(ArithmeticException e1)
		{
			System.out.println("I am 1 Exception Error !"+e1);
		}
		finally
		{
			System.out.println("Finally block is always executed.....");
		}
		System.out.println("Rest of the code.....");
		
	}
}

