/*
1 0 1 0
0 1 0
1 0
0
*/
// WAP To Display Pattern.
import java.util.Scanner;
class Pattern9
{
	public static void main(String alex[])
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Number : ");
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++)
		{
			for(int j = i; j<= n; j++)
			{
				if(j % 2 == 0)
				{
					System.out.print("0 ");
				}
				else
				System.out.print("1 ");
			}
			System.out.println();
		}
	}
}