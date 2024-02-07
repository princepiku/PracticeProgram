// Using Command Line  Argument.
class Condition
{
	public static void main(String alex[])
	{
		int x = Integer.parseInt(alex[0]);
		int y = Integer.parseInt(alex[1]);
		int z = (x > y) ? x : y;
		String str = (z % 2 == 0) ? "Even Number" : "Odd Number";
		System.out.print("Greatest Number = "+z+"\nAnd It is : "+str);
		
		//int x = Integer.parseInt(alex[0]); // 10
		//int y = integer.parseInt(alex[1]); // 20
		//x += y; // x = x+y
		//x -= y; // x = x-y
		//System.out.println("x + y = "+x);
		//System.out.println("x - y = "+x);
		//boolean b1 = true;
		//boolean b2 = true;
		//b1 &= b2; // b1 = b1 7 b2
		//System.out.print("b1 &= b2 = "+b1);	
	}
}