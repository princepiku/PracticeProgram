// 3. Print the Sum of Digits and Check for Palindrome(Reverse).

import java.util.Scanner;
public class Reverse_Palindrome
{
	public static void main(String alex[])
	{
		int rev = 0, sum = 0;
		int rem, num, n;
		Scanner pk = new Scanner(System.in);
		System.out.print("Enter the number : ");
		n = pk.nextInt();
		num = n;
		while(n != 0)
		{
			rem = n % 10;
			rev = rev * 10 + rem;
			n = n / 10;
			sum = sum + rem;
		}
		System.out.println("Sum of digits : "+num+" = "+sum);
		System.out.println(+num+" Reverse is : "+rev);
		if(num == rev)
		{
			System.out.println(+num+" is Palindrome number.");
		}
		else
			System.out.println(+num+" is not Palindrome number.");
	}
}

