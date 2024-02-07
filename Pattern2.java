/*
1 
2 1
3 2 1
4 3 2 1
*/
// WAP To Display Pattern.
import java.util.Scanner;
class Pattern2
{
	public static void main(String alex[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Number : ");
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++)
		{
			for(int j = i; j>= 1; j--)
				System.out.print(j+" ");
			System.out.println();
		}
	}
}