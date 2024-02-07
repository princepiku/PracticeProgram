import java.util.Scanner;
import java.util.*;
public class TD_Array
{
	public static void main(String alex[])
	{
		int a[][];
		int b[][];
		int i,j;
		int sum[][];
		Scanner pk = new Scanner(System.in);
		System.out.print("Enter a Number of Row : ");
		a[5][5] = pk.nextInt();
		System.out.print("Enter a Number of Column : ");
		b[5][5] = pk.nextInt();
		System.out.println("Enter a Number of Elements : ");
		for(i = 0; i < a[i][j]; i++)
		{
			for(j = 0; j < b[i][j]; j++)
			{
				sum[i][j] = a[i][j] + b[i][j];
				System.out.println("Sum of two Matrix : "+sum[i][j]);
			}
		}
	}
}

		
		
		