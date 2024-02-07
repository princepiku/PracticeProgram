// WAP TO Convert Into Decimal To Binary.
import java.util.Scanner;
class Decimal_Binary
{
	public static void main(String alex[])
	{
		int r, s = 0, c = 1;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Number To Decimal Format : ");
		int n = sc.nextInt();
		while(n != 0) // while(n > 0)
		{
			r = n % 2;		// r %= 2;
			n = n / 2;		// n /= 2;
			s = s + r * c;	// s += r * c;
			c = c * 10;		// c *= 10;	
		}
		System.out.print("Converted Value Of Decimal To Binary : "+s);
	}
}