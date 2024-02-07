/*
      4
    4 3
  4 3 2
4 3 2 1
  4 3 2
    4 3
      4
*/
// WAP To Print The Pattern.
class Java1
{
	public static void main(String alex[])
	{
		int i,j,ri = 5;
		for( i = 1; i <= 7; i++)
		{
			if(i <= 4)
				ri--;
			else 
				ri++;
			for( j = ri+3; j >= ri; j--)
			{
				if(j >= 5)
					System.out.print(" ");
				else
					System.out.print(j);
			}
			System.out.println();			
		}
	}
}