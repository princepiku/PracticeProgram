/*
D C B A				4 3 2 1
d c b				4 3 2
D C				4 3
d				4
*/
// WAP To Display Pattern.
import java.util.Scanner;
class Pattern14
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
				if(i % 2 == 0)
				{
					System.out.print((char)(96+j)+" ");
				}
				else
					System.out.print((char)(64+j)+" ");
			}
			System.out.println();
		}
	}
}