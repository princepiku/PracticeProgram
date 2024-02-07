// 14. Demonstrate the Exception Handling :- Single Catch Block and Multiple Catch Block.

public class EXH2
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
		catch(Exception e2)
		{
			System.out.println("I am 2 Exception Error !"+e2);
		}
		finally
		{
			System.out.println("Finally block is always executed.....");
		}
		System.out.println("Rest of the code.....");
	}
}

