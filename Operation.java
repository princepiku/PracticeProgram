public class Operation
{
	void add()
	{
		int a = 55, b = 87;
		System.out.println("Additon = "+(a+b));
	}
	void sub()
	{
		int a = 87, b = 35;
		System.out.println("Substraction = "+(a-b));
	}
	void mult()
	{
		int a = 55, b = 87;
		System.out.println("Multiplication = "+(a*b));
	}
	void div()
	{
		int a = 157, b = 27;
		System.out.println("Division = "+(a/b));
	}
	void rem()
	{
		int a = 157, b = 27;
		System.out.println("Remainder = "+(a%b));
	}
	
	public static void main(String alex[])
	{
		Operation s = new Operation();
		s.add();
		s.sub();
		s.mult();
		s.div();
		s.rem();
	}
}


