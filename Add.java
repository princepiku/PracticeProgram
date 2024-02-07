import java.util.Scanner;

public class Add
{
	public static void main(String alex[])
	{
		int num1, num2, sum;
		Scanner pk = new Scanner(System.in);
		System.out.print("Enter the Number1 : ");
		num1 = pk.nextInt();
		System.out.print("Enter the Number2 : ");
		num2 = pk.nextInt();
		sum = num1 + num2;
		System.out.println("Addition of two Number : "+sum);
	}
}

