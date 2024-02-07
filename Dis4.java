/*
1 2 3 4
2 3 4
3 4
4
3 4
2 3 4
1 2 3 4
*/
// WAP To Display The Pattern.
import java.util.Scanner;
class Dis4
{
	public static void main(String alex[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Number : ");
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++)
		{
			for(int j = i; j <= n; j++)
				System.out.print(j+" ");
			System.out.println();
		}
		for(int i = n-1; i >= 1; i--)
		{
			for(int j = i; j <= n; j++)
				System.out.print(j+" ");
			System.out.println();
		}
	}
}