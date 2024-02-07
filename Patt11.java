/*
1 0 1 0
_ 0 1 0
_ _ 1 0
_ _ _ 0
*/
// WAP To Print The Pattern.
class Patt11
{
	public static void main(String alex[])
	{
		for(int i = 1; i <= 4; i++)
		{
			for(int j = 4; j <= i+2; j++)
				System.out.print("_ ");
			for(int j = i; j <= 4; j++)
				if(j %2 != 0)
				{	
					System.out.print("1 ");
				}
				else
					System.out.print("0 ");
				System.out.println();
		}
	}
}