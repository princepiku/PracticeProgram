import java.util.Scanner;
public class Sample
{
	public static void main(String[] alex)
	{
		int a[][] = {
						{1,2,3},
						{1,2,3},
						{1,2,3},
						{4,5,6},
						{4,5,6},
						{7,8,9},
					};
					System.out.println("***** My Array *****");
					for(int i = 0; i < a.length; i++)
					{
						for(int j = 0; j < a[i].length; j++)
						System.out.print(a[i][j]+"  ");
						System.out.println();
					}		
	}
}