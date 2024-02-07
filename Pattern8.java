/*
1 2 3 4
2 3 4
3 4
4
*/
// WAP To Display Pattern.
import java.util.Scanner;
class Pattern8
{
	public static void main(String alex[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Number : ");
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++)
		{
			for(int j = i; j<= n; j++)
				System.out.print(j+" ");
			System.out.println();
		}
	}
}