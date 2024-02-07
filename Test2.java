// WAP To Display Addition, Substraction, Multiplication, Division, Remainder.
import java.util.Scanner;
class Test2
{
	public static void main(String alex[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The First Number(1) = ");
		double a = sc.nextInt();
		System.out.print("Enter The Second Number(2) = ");
		double b = sc.nextInt();
		double sum = a + b;
		double sub = a - b;
		double mult = a * b;
		double div = a / b;
		double remain = a % b;
		System.out.println("Addition = "+sum);
		System.out.println("Substraction = "+sub);
		System.out.println("Multiplication = "+mult);
		System.out.println("Division = "+div);
		System.out.print("Remainder = "+remain);	
	}	
}