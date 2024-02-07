/*
          1
        1 2 1
      1 2 3 2 1
    1 2 3 4 3 2 1
  1 2 3 4 5 4 3 2 1
*/
// WAP To Print The Pattern.
import java.util.Scanner;
class Java2 
{
	public static void main(String alex[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Number : ");
		int n = sc.nextInt();
		int p1 = n+1, p2 = n-1;
		for(int i = 1; i <= n; i++)
		{
			p1--;
			p2++;
			int rj = 0;
			for(int j = 1; j < 2*n; j++)
			{
				if(j >= p1 && j <= p2)
				{
					if(j <= n)
						rj++;
					else
						rj--;
					System.out.print(rj);
				}
				else
					System.out.print(" ");
			}
			System.out.println();			
		}
	}
}