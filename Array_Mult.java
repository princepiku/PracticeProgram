// 5. Compute Matrix Multiplication. (using Arrays)

import java.util.Scanner;
public class Array_Mult
{
	public static void main(String alex[])
	{
		int a[][] = new int [5][5];
		int b[][] = new int [5][5];
		int mult[][] = new int [5][5];
		int r, c, i, j, k;
		Scanner pk = new Scanner(System.in);
		System.out.print("Enter the number of row : "); 
		r = pk.nextInt();
		System.out.print("Enter the number of column : ");
		c = pk.nextInt();
		System.out.print(": Enter the first matrix element :\n");    
		for(i = 0; i < r; i++)
		{    
			for(j = 0; j < c; j++)    
			{    
				System.out.print("Enter a&b value : ");
				a[i][j] = pk.nextInt();
			}    
		}    
		System.out.print(": Enter the second matrix element :\n");   
		for(i = 0; i < r; i++)    
		{    
			for(j = 0; j < c; j++)    
			{
				System.out.print("Enter b&a value : ");
				b[i][j] = pk.nextInt();
			}    
		}    
		System.out.print(": Multiplication of the matrix :\n");    
		for(i = 0; i < r; i++)    
		{    
			for(j = 0; j < c; j++)    
			{    
				mult[i][j] = 0;    
				for(k = 0; k < c; k++) 
				{    
					//mult[i][j] = mult[i][j] + a[i][k] * b[k][j];
					mult[i][j] += a[i][k] * b[k][j];
				}    
			}    
		}
		//for printing result.
		for(i = 0; i < r; i++)    
		{    
			for(j = 0; j < c; j++)    
			{    
				System.out.print(" "+mult[i][j]);
			}    
			System.out.print("\n");
		}
	}
}


/*

public class Array_Mult
{
	public static void main(String alex[])
	{
		int a[][] = {{1,2}, {3,4}};
		int b[][] = {{2,4}, {6,8}};
		int m[][] = new int[2][2];
		int i, j, k;
		System.out.println(" : Multiplication of Two Matrix : ");
		for(i = 0; i < 2; i++)
		{
			for(j = 0; j < 2; j++)
			{
				m[i][j] = 0;
				for(k = 0; k < 2; k++)
				{
					m[i][j] = m[i][j] + a[i][k] * b[k][j];
				}
			}
		}
		for(i = 0; i < 2; i++)
		{
			for(j = 0; j < 2; j++)
			{
				System.out.print("     \t"+m[i][j]+" ");
			}
			System.out.print("\n");
		}
	}
}

*/
		