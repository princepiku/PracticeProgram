// WAP To Print The Area Of The Circle.
import java.util.Scanner;
class Circle
{
	public static void main(String alex[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Radious Of The Circle : ");
		double r = sc.nextDouble();
		double area = 3.14 * r * r;
		System.out.print("Area Of The Circle = "+area);
	}	
}