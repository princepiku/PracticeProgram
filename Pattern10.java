/*
0 1 0 1
1 0 1
0 1
1
*/
// WAP To Display Pattern.
import java.util.Scanner;
class Pattern10
{
	public static void main(String alex[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Number : ");
		int n = sc.nextInt();
		for(int i = n; i >= 1; i--)
		{
			for(int j = i; j>= 1; j--)
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