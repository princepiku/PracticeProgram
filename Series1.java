// WAP TO Print Series (2) 5 10 8 13 11 ----- n Time.
import java.util.Scanner;
class Series1
{
	public static void main(String alex[])
	{
		int s = 5;
		Scanner sc = new Scanner(System.in);
		System.out.print("Please Enter The Number : ");
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++)
		{
			
			System.out.print(" "+s);
			if(i % 2 != 0)
				s += 5;
				else
					s -= 2;	
		}	
	}
}