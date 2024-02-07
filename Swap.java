// WAP To Print The Swap Of Two Number.
import java.util.Scanner;
class Swap
{
	public static void main(String alex[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Value Of A : ");
		int a = sc.nextInt();
		System.out.print("Enter The Value Of B : ");
		int b = sc.nextInt();
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("After The Swap Value Of A = " +a);
		System.out.print("After The Swap Value Of B = " +b);
	}	
}