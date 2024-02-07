// WAP To Print First Ten Odd Number.
class Odd
{
	public static void main(String alex[])
	{
		int x = 1;
		while(x <= 10)
		{
			System.out.print(" "+(2 * x - 1)); // Tn = a+(n-1)d , 2n-1 Where a = First Term And d = Comman Difference Term = 2 
			x++;
		}
	}
}