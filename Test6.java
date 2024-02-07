// WAP To Check The Number Divisible By 5 And 7 Or Not Or Both.
class Test6
{
	public static void main(String alex[])
	{
		int x = Integer.parseInt(alex[0]);
			if(x % 5 == 0 && x % 7 == 0)
			System.out.println(x+" is Divisible By Both");
			else if(x % 5 == 0)
				System.out.println(x+" is Divisible By 5");
			else if(x % 7 == 0)
				System.out.println(x+" is Divisible By 7");
			else
				System.out.println(x+" is Not Divisible By 5 & 7");
	}
}