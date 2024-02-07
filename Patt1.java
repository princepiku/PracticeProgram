/*
_ _ _ 1
_ _ 1 2
_ 1 2 3
1 2 3 4
*/
// WAP To Print Pattern.
import java.util.Scanner;
class Patt1
{
	public static void main(String alex[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Number : ");
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++)
		{
			for(int j = i-n+1; j <= i; j++)
				if(j <= 0)
					System.out.print("_ ");
				else
					System.out.print(j+" ");
			System.out.println();
		}
	}
}