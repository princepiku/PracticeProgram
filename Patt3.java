/*
1 2 3 4
_ 2 3 4
_ _ 3 4
_ _ _ 4
*/
// WAP To Print The Pattern.
import java.util.Scanner;
class Patt3
{
	public static void main(String alex[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Number : ");
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++)
		{
			for(int j = 1; j <= n; j++)
				if(j <= i-1)
					System.out.print("_ ");
				else
					System.out.print(j+" ");
			System.out.println();
		}
	}
}