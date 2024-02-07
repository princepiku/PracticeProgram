/*
1
2 3
4 5 6
7 8 9 10
*/
// WAP To Display Pattern.
import java.util.Scanner;
class Pattern14
{
	public static void main(String alex[])
	{
		int c = 1;		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Number : ");
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++)
		{
			for(int j = 1; j<= i; j++)
			{
				System.out.print(c+" ");
				c++;
			}
			System.out.println();
		}
	}
}