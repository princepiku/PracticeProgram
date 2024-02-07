// WAP TO Print Series (1) 2 3 5 8 11 ----- n Time.
import java.util.Scanner;
class Series
{
	public static void main(String alex[])
	{
		int a = 2, b = 3;
		int c;
		Scanner sc = new Scanner(System.in);
		System.out.print("Please Enter The Number Of Time To Print : ");
		int n = sc.nextInt();
		System.out.print(a+" "+b );
		for(int i = 2; i<= n; i++)
		{
			c = a + 3;
			a = c;
			System.out.print(" "+c);
		}
	}
}