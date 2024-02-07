/*
a b c d				1 2 3 4
B C D				2 3 4
c d				3 4
D				4
*/
// WAP To Print Pattern.
import java.util.Scanner;
class Pattern13
{
	public static void main(String alex[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Number : ");
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++)
		{
			for(int j = i; j <= n; j++)
			{
				if(i % 2 == 0)
				{
					System.out.print((char)(j+64)+" ");
				}
				else
					System.out.print((char)(j+96)+" ");
			}	
			System.out.println();
		}
		
	}
}