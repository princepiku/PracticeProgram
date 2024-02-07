// WAP To Convert Into Binary To Decimal.
import java.util.Scanner;
class Binary_Decimal
{
	public static void main(String alex[])
	{
		int r, s = 0, c = 1;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Number To Binary Format : ");
		int n = sc.nextInt();
		while(n != 0)
		{
			r = n % 10;
			n /= 10;
			s += r * c;
			c *= 2;	
		}
		System.out.print("Converted Value Of Binary To Decimal : "+s);
	}
}