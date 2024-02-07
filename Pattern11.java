/*
D c B a				4 3 2 1
D c B				4 3 2
D c				4 3
D				4
*/
// WAP To Display Pattern.
import java.util.Scanner;
class Pattern11
{
	public static void main(String alex[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Number : ");
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++)
		{
			for(int j = n; j>= i; j--)
			{
				if(j % 2 == 0)
				{
					System.out.print((char)(64+j)+" ");
				}
				else
					System.out.print((char)(96+j)+" ");
			}
			System.out.println();
		}
	}
}