// WAP To Print Odd And Even(Nested-if Statement).
class Test5
{
	public static void main(String alex[])
	{
		int x = Integer.parseInt(alex[0]);
		int y = Integer.parseInt(alex[1]);
		int z = Integer.parseInt(alex[2]);
		if(x >= y && x >= z)
		System.out.print(x+ " is a Greater");
		else if(y >= z)
			System.out.print(y+ " is a Greater");
			else
				System.out.print(z+ " is a Greater");
	}
}