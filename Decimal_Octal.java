// WAP To Convert Into Decimal To Octal.
import java.util.Scanner;
class Decimal_Octal
{
	public static void main(String alex[])
	{
		int r, s = 0, c = 1;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Number To Decimal Format : ");
		int n = sc.nextInt();
		while(n != 0)
		{
			r = n % 8;
			n /= 8;
			s += r * c;
			c *= 10;	
		}
		System.out.print("Converted Value Of Decimal To Octal : "+s);
	}
}