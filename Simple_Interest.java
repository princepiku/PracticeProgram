// WAP To Print The Simple Interest.
import java.util.Scanner;
public class Simple_Interest
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		double SI, Principle, Rate_Of_Interest, Time;
		System.out.print("Enter Principle : ");
		Principle = sc.nextDouble();
		System.out.print("Enter Rate Of Interest : ");
		Rate_Of_Interest = sc.nextDouble();
		System.out.print("Enter Time : ");
		Time = sc.nextDouble();
		SI = (Principle * Rate_Of_Interest * Time)/100;
		System.out.print("Simple_Interest = " +SI);
	}
}