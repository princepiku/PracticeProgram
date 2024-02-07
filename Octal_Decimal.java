// WAP To Convert Into Octal To Decimal.
import java.util.Scanner;
class Octal_Decimal
{
	public static void main(String alex[])
	{
		int r, s = 0, c = 1;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Number To Octal Format : ");
		int n = sc.nextInt();
		while(n != 0)
		{
			r = n % 10;
			n /= 10;
			s += r * c;
			c *= 8;	
		}
		System.out.print("Converted Value Of Octal To Decimal : "+s);
	}
}