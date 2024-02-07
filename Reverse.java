// WAP To Enter Number And Print The Reverse Number.
import java.util.Scanner;
class Reverse
{
	public static void main(String alex[])
	{
		int Remainder;
		int Reverse = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Number To Reverse : ");
		int n = sc.nextInt();
		while(n > 0) // while(n != 0)
		{
			Remainder = n % 10;
			n = n / 10;
			Reverse = Reverse * 10 + Remainder;
		}
		System.out.print("Reversed Number : "+Reverse);
	}
}