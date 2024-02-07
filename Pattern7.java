/*
4 3 2 1
4 3 2
4 3
4
*/
// WAP To Display Pattern.
import java.util.Scanner;
class Pattern7
{
	public static void main(String alex[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Number : ");
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++)
		{
			for(int j = n; j>= i; j--)
				System.out.print(j+" ");
			System.out.println();
		}
	}
}