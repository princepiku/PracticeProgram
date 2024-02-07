/*
_ _ _ 1
_ _ 2 3
_ 4 5 6
7 8 9 10
*/
// WAP To Print The Pattern.
class Patt8
{
	public static void main(String alex[])
	{
		int c = 1;
		for(int i = 1; i <= 4; i++)
		{
			for(int j = i+1; j <= 4; j++)
			{
				System.out.print("_ ");	
			}
			for(int j = 1; j <= i; j++)
			{
				System.out.print(c+" ");
				c++;
			}
			System.out.println();
		}
	}
}