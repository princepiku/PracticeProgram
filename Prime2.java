// WAP To Print Prime Number Or Not.
import java.util.Scanner;
class Prime2
{
	public static void main(String alex[])
	{
		int temp = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Number : ");
		int n = sc.nextInt();
		for(int i = 2;i <= n - 1;i++)
		{
			if(n % i == 0)
			{
				temp = temp +1;
			}
		}
		if(temp == 0)
		{
			System.out.print(n+"  is Prime Number");
		}
		else
			System.out.print(n+" is Not Prime Number");
	}
}