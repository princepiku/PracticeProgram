/*
1 2 3 4
1 2 3
1 2
1
1 2
1 2 3
1 2 3 4
*/
// WAP To Display The Pattern.
import java.util.Scanner;
class Dis6
{
	public static void main(String alex[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Number : ");
		int n = sc.nextInt();
		for(int i = n; i >= 1; i--)
		{
			for(int j = 1; j <= i; j++)
				System.out.print(j+" ");
			System.out.println();
		}
		for(int i = 2; i <= n; i++)
		{
			for(int j = 1; j <= i; j++)
				System.out.print(j+" ");
			System.out.println();
		}
	}
}