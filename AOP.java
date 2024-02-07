import java.util.*;
import java.util.Scanner;
public class AOP
{
	public static void main(String alex[])
	{
		int num1,num2,sum,sub,mult,div,rem;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the First Number : ");
		num1 = sc.nextInt();
		System.out.print("Enter the Second Number : ");
		num2 = sc.nextInt();
		sum = num1 + num2;
		sub = num1 - num2;
		mult = num1 * num2;
		div = num1 / num2;
		rem = num1 % num2;
		System.out.println("Addition = "+sum);
		System.out.println("Substracton = "+sub);
		System.out.println("Multiplication = "+mult);
		System.out.println("Division = "+div);
		System.out.println("Remainder = "+rem);
	}
}

		