/*
4
3 4
2 3 4
1 2 3 4
*/
// WAP To Display Pattern.
import java.util.Scanner;
class Pattern4
{
	public static void main(String alex[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Number : ");
		int n = sc.nextInt();
		for(int i = n; i >= 1; i--)
		{
			for(int j = i; j<= n; j++)
				System.out.print(j+" ");
			System.out.println();
		}
	}
}