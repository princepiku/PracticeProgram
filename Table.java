// WAP To Print The Formated Table In Any Number.
import java.util.Scanner;
class Table
{
	public static void main(String alex[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Number To Print Table : ");
		int n = sc.nextInt();
		int i = 1;
		int table;
		while(i <= 10)
		{
			table = n * i;
			System.out.println(n+" x "+i+" = "+table);
			i++;
		}
	}
}







