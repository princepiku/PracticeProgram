// Print ArmStrong Number.
import java.util.Scanner;
public class ArmStrong
{
	public static void main(String alex[])
	{
		int temp, rem;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int number = sc.nextInt();
		temp = number;
		while(temp != 0)
		{
			rem = temp % 10;
			sum = sum + (rem * rem * rem);
			temp = temp / 10;
		}
		if(number == sum)
			System.out.print(number+ " is ArmStrong Number");
			else
				System.out.print(number+ " is not ArmStrong Number");
	}
}