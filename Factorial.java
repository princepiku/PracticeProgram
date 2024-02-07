// 2. Find the Factorial.

import java.util.Scanner;
public class Factorial
{
	public static void main(String alex[])
	{
		int fact = 1;
		int i = 1, no;
		Scanner pk = new Scanner(System.in);
		System.out.print("Enter The Number : ");
		no = pk.nextInt();
		if(no >= 0)
		{
			for(i = 1; i <= no; i++)
			{
				fact = fact * i;
			}
			System.out.print(+no+ "! = "+fact);
		}
		else
			System.out.print("Invalid Input");
	}
}

