import java.util.Scanner;

public class Multiplication
{
	public static void main(String alex[])
	{
		int product = 1, limit;
		Scanner sc = new Scanner(System.in);
		System.out.println("Calculates Product of first n numbers");
		System.out.println("-------------------------------------");
		System.out.print("Enter limit number:");
		limit = sc.nextInt();
		int i=1;
		while(i<=limit)
		{
			product *= i;
			i++;
		}
		System.out.println("Product of first '"+limit+"' numbers: " + product);
	}
}


/*

import java.util.Scanner;

class ProductTest
{
	public static void main(String alex[])
	{
		int product = 1, limit;
		Scanner sc = new Scanner(System.in);
		System.out.println("Calculates Product of first n numbers");
		System.out.println("-------------------------------------");
		System.out.print("Enter limit number:");
		limit = sc.nextInt();
		for(int i=1;i<=limit;i++)
		{
			product *= i;
		}
		System.out.println("Product of first '"+limit+"' numbers: " + product);
	}
}

*/