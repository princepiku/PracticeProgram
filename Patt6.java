/*
1 2 3 4
_ 1 2 3
_ _ 1 2
_ _ _ 1
*/
// WAP To Print The Pattern.
import java.util.Scanner;
class Patt6
{
	public static void main(String alex[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Number : ");
		int n = sc.nextInt();
		for(int i = n; i >= 1; i--)
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