// WAP To Print The Compound Interest.
import java.util.Scanner;
public class Compound_Interest
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		double CI, Principle, Rate_Of_Interest, Time;
		System.out.print("Enter Principle : ");
		Principle = sc.nextDouble();
		System.out.print("Enter Rate Of Interest : ");
		Rate_Of_Interest = sc.nextDouble();
		System.out.print("Enter Time : ");
		Time = sc.nextDouble();
		CI = Principle * Math.pow((1 + Rate_Of_Interest / 100), Time);
		System.out.print("Compound_Interest = " +CI);
	}
}