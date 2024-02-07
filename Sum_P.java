import java.util.*;
import java.util.Scanner;
public class Sum_P
{
	public static void main(String alex[])
	{
	
		int r, sum = 0, temp;
		//int n = 454;
		int n = 123;
		/*
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the First Number : ");
		int num1 = sc.nextInt();
		System.out.print("Enter the  Second Number : ");
		int num2 = sc.nextInt();
		int sum = num1 + num2;
		int average = num1 + num2 / 2;
		System.out.println("Addition of Number : "+sum);
		System.out.println("Average of Number : "+average);
		*/
		temp = n;
		while(n > 0)
		{
			r = n % 10;
			sum = (sum * 10) + r;
			n = n / 10;
		}	
		if(temp == sum)
		{
			System.out.println(+sum+" is Palindrome number.");
		}
		else
			System.out.println(+sum+" is not Palindrome number.");
	}
}
