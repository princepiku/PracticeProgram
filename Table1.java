import java.util.Scanner;
import java.util.*;
public class Table1
{
	void Mult()
	{
		int i,j,mult;
		Scanner pk = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = pk.nextInt();
		for(i = 1; i <= n; i++)
		{
			for(j = 1; j <= n; j++)
			{
				mult = i * j;
				System.out.println(+i+" x "+j+" = "+mult);
			}
		}
	}
	public static void main(String alex[])
	{
		Table1 t = new Table1();
		t.Mult();
	}
}
