// WAP To Print The Average Of Result
import java.util.Scanner;
public class Result
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		float Avg, Physics, Chemistry, Mathematics, Hindi, English;
		System.out.print("Enter Number in Physics : ");
		Physics = sc.nextFloat();
		System.out.print("Enter Number in Chemistry : ");
		Chemistry = sc.nextFloat();
		System.out.print("Enter Number in Mathematics : ");
		Mathematics = sc.nextFloat();
		System.out.print("Enter Number in Hindi : ");
		Hindi = sc.nextFloat();
		System.out.print("Enter Number in English : ");
		English = sc.nextFloat();
		Avg = (Physics+Chemistry+Mathematics+Hindi+English)/5f;
		System.out.print("Average Of Result = " +Avg);
	}
}

			