/*
A b C d			1 2 3 4
b C d			2 3 4
C d			3 4
d			4
*/
// WAP To Print Pattern.
import java.util.Scanner;
class Pattern17
{
	public static void main(String alex[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Number : ");
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++)
		{
			for(int j = i; j <= n; j++)
			{
				if(j % 2 == 0)
				{
					System.out.print((char)(j+96)+" ");
				}
				else
					System.out.print((char)(j+64)+" ");
			}	
			System.out.println();
		}
		
	}
}