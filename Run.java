/*
import java.util.Scanner;
public class Run
{
	public static void main(String alex[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number To Print Pattern : ");
		int n = sc.nextInt();
		int i, j,n1;
		for(i = 1; i <= n1; i++)
		{
			for(j = i; j >= 1; j--)
			
				if(i == n)
					System.out.print("*");
				else
					System.out.print(j+ " ");
			
			System.out.println( );
		}
	}
}
*/

import java.util.Scanner;
public class Run
{
	public static void main(String alex[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int number = sc.nextInt();
		if(number % 5 == 0)
			System.out.print("Fizz");
			else if(number % 3 == 0)
				System.out.print("Buzz");
				else if(number % 5 == 0 && number % 3 == 0)
					System.out.print("FizzBuzz");
					else
						System.out.print(number);
	}
}