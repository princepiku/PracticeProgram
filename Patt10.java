/*
0 1 0 1
_ 0 1 0
_ _ 0 1
_ _ _ 0
*/
// WAP To Print The Pattern.
class Patt10
{
	public static void main(String alex[])
	{
		for(int i = 1; i <= 4; i++)
		{
			for(int j = i+3; j >= 5; j--)
				System.out.print("_ ");
			for(int j = 4; j >= i; j--)
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