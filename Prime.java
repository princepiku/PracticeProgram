// WAP To Check The Prime Number Or Not.(Divisible By 1 And It Self = Prime Number)
class Prime
{
	public static void main(String alex[])
	{
		int n = Integer.parseInt(alex[0]);
		int i = 2;
		boolean b = true;
		while(i < n)
		{
			if(n % i == 0) 
				b = false;
				i++;
		}
		if(b)
			System.out.print(n+" Is A Prime Number");
		else
			System.out.print(n+" Is Not A Prime Number");
	}
}