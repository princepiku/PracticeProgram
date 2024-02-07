import java.util.*;
import java.util.Scanner;

public class OP 
{
	void add(double a, double b)
	{
		System.out.println("Additon = "+(a+b));
	}
	void sub(double a, double b)
	{
		System.out.println("Substraction = "+(a-b));
	}
	void mult(double a, double b)
	{
		System.out.println("Multiplication = "+(a*b));
	}
	void div(double a, double b)
	{
		System.out.println("Division = "+(a/b));
	}
	public static void main(String alex[])
	{
		OP o = new OP();
		o.add(10,20);
		o.sub(18,7);
		o.mult(15,7);
		o.div(19,2);
	}
}


