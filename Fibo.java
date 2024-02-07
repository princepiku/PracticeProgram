import java.util.Scanner;
import java.util.*;
public class Fibo
{
	void fib()
	{
		int a = 0, b = 1, c, n, count = 0;
		Scanner pk = new Scanner(System.in);
		System.out.print("Enter the number for print : ");
		n = pk.nextInt();
		System.out.print(+a+" ");
		System.out.print(+b+" ");
		while(count < n)
		{
			c = a + b;
			System.out.print(+c+" ");
			a = b;
			b = c;
			count++;
		}
	}
	public static void main(String alex[])
	{
		Fibo f = new Fibo();
		f.fib();
	}
}
		