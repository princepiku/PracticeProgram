// WAP To Print The Area Of Triangle.
import java.util.Scanner;
class Triangle
{
	public static void main(String alex[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Base Of Triangle : ");
		double b = sc.nextDouble();
		System.out.print("Enter The Height Of Triangle : ");
		double h = sc.nextDouble();
		//double area = (double)(b * h / 2);
		double area = b * h * 0.5;
		System.out.print("Area Of Triangle = "+area);
	}
}