/*
_ _ _ 4
_ _ 4 3
_ 4 3 2
4 3 2 1
_ 4 3 2
_ _ 4 3
_ _ _ 4
*/
// WAP To Print The Pattern.
class Java
{
	public static void main(String alex[])
	{
		int i,j;
		for( i = 4; i >= 1; i--)
		{
			for( j = i+3; j >= 5; j--)
				System.out.print("_ ");
			for( j = 4; j >= i; j--)
					System.out.print(j+" ");
			System.out.println();
		}
		for( i = 2; i <=4; i++)
		{
			for( j = i+3; j >= 5; j--)
				System.out.print("_ ");
			for( j = 4; j >= i; j--)
					System.out.print(j+" ");
			System.out.println();
		}
	}
}