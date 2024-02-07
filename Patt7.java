/*
_ _ _ 1
_ _ 2 1
_ 3 2 1
4 3 2 1
*/
// WAP To Print The Pattern.
import java.util.Scanner;
class Patt7
{
	public static void main(String alex[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Number : ");
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++)
		{
			for(int j = n; j >= 1; j--)
				if(j >= i+1)
				System.out.print("_ ");
				else
				System.out.print(j+" ");
			System.out.println();
		}
	}
}