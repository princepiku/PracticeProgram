// WAP To Print The Area Of Square.
import java.util.Scanner;
class Square
{
	public static void main(String alex[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Side Of Square : ");
		double a = sc.nextDouble();
		double area = a*a;
		System.out.print("Area Of The Square = "+area);
	}	
}