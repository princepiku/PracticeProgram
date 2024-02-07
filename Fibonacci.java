// WAP To Display Fibonacci Series. 0  1  1  2  3  5  8  11  21  -----  n Time.
import java.util.Scanner;
class Fibonacci
{
	public static void main(String alex[])
	{
		int a = 0, b = 1;
		int c;
		Scanner sc = new Scanner(System.in);
		System.out.print("Please Enter The Number Of Time To Print : ");
		int n = sc.nextInt();
		System.out.println(a+ "  " +b );
		for(int i = 1; i <= n; i++)
		{
			c = a + b;
			System.out.print(c+"  ");
			a = b;
			b = c;
		}
	}
}	