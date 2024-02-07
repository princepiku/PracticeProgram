/*
A b C d
_ b C d
_ _ C d
_ _ _ d
*/
// WAP To Print The Pattern.
class Patt9
{
	public static void main(String alex[])
	{
		for(int i = 1; i <= 4; i++)
		{
			for(int j = 1; j <= i-1; j++)
				System.out.print("_ ");
			for(int j = i; j <= 4; j++)
				if(j % 2 != 0)
				{
					System.out.print((char)(j+64)+" ");
				}
				else
					System.out.print((char)(j+96)+" ");
				System.out.println();
		}
	}
}