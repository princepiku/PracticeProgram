/*
_ _ _ _ 5
_ _ _ 5 4
_ _ 5 4 3
_ 5 4 3 2
5 4 3 2 1
*/
// WAP To Print The Pattern.
import java.util.Scanner;
class Patt2
{
	public static void main(String alex[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Number : ");
		int n = sc.nextInt();
		for(int i = n; i >= 1; i--)
		{
			for(int j = i+n-1; j >= i; j--)	
				if(j >= n+1)
					System.out.print("_ ");
				else
					System.out.print(j+" ");
			System.out.println();
		}
	}
}