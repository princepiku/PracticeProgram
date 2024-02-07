import java.util.Scanner;

public class AM
{
	public static void main(String alex[])
	{
		int a[][] = new int[10][10];
		int b[][] = new int[10][10];
		int mult[][] = new int[10][10];
		int r,c,i,j,k;
		Scanner pk = new Scanner(System.in);
		System.out.print("Enter row : ");
		r = pk.nextInt();
		System.out.print("Enter Column : ");
		c = pk.nextInt();
		
		System.out.println("Enter the 1st Matrix : ");
		for(i = 0; i < r; i++)
		{
			for(j = 0; j < c; j++)
			{
				System.out.print("Enter value of a & b : ");
				a[i][j] = pk.nextInt();
				//System.out.println();
			}
		}
		
		System.out.println("Enter the 2nd Matrix : ");
		for(i = 0; i < r; i++)
		{
			for(j = 0; j < c; j++)
			{
				System.out.print("Enter value of b & a : ");
				b[i][j] = pk.nextInt();
				//System.out.println();
			}
		}
		System.out.println(" : Matrix of Multiplication : ");
		for(i = 0; i < r; i++)
		{
			for(j = 0; j < c; j++)
			{
				mult[i][j] = 0;
				for(k = 0; k < c; k++)
				{
					mult[i][j] += a[i][k] * b[k][j];
				}
			}
		}
		for(i = 0; i < r; i++)
		{
			for(j = 0; j < c; j++)
			{
				System.out.print(" "+mult[i][j]);
			}
			System.out.println();
		}
	}
}

				
				