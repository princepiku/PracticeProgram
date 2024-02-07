// 1. Find Biggest of 3 Number. (Using Command Line Argument)

import java.util.Scanner;
public class Largest
{
	public static void main(String alex[])
	{
		int n1, n2, n3, big;
		n1 = Integer.parseInt(alex[0]);
		n2 = Integer.parseInt(alex[1]);
		n3 = Integer.parseInt(alex[2]);
		if(n1 > n2 && n1 > n3)
			big = n1;
		else if(n2 > n3)
			big = n2;
		else
			big = n3;
		System.out.println("Largest Number : "+big);
	}
}


















/*


public class Largest
{
	void larg()
	{
		Scanner pk = new Scanner(System.in);
		System.out.print("Enter first number : ");
		int n1 = pk.nextInt();
		System.out.print("Enter Second number : ");
		int n2 = pk.nextInt();
		if(n1 > n2)
		{
			int large = n1;
			int small = n2;
			System.out.println(+n1+" is Greatest Number.");
			System.out.println(+n2+" is Smallest Number.");
		}
		else
		{
			int large = n2;
			int small = n1;
			System.out.println(+n2+" is Greatest Number.");
			System.out.println(+n1+" is Smallest Number.");
		}
	}
	
	public static void main(String alex[])
	{
		Largest l = new Largest();
		l.larg();
	}
}


public class Largest
{
	public static void main(String alex[])
	{
		int n1, n2, n3, g;
		Scanner pk = new Scanner(System.in);
		System.out.print("Enter first number : ");
		n1 = pk.nextInt();
		System.out.print("Enter Second number : ");
		n2 = pk.nextInt();
		System.out.print("Enter third number : ");
		n3 = pk.nextInt();
		g = (n1 > n2) ? (n1 > n3 ? n1 : n3) : (n2 > n3 ? n2 : n3);
		System.out.println(+g+" is greatest number.");
	}
}


*/