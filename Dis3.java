/*
4 3 2 1
4 3 2
4 3
4
4 3
4 3 2
4 3 2 1
*/
// WAP To Display The Pattern.
import java.util.Scanner;
class Dis3
{
	public static void main(String alex[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Number : ");
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++)
		{
			for(int j = n; j >= i; j--)
				System.out.print(j+" ");
			System.out.println();
		}
		for(int i = n; i >= 1; i--)
		{
			for(int j = n; j >= i; j--)
				System.out.print(j+" ");
			System.out.println();
		}
	}
}