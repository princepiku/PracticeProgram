// WAP To Count The Total Number Of Notes in Given Amount.
import java.util.Scanner;
public class Count_Notes
{
	public static void main(String args[])
	{		
		int N2000, N500, N200, N100, N50, N20, N10, N5;
		int Amount;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Amount : ");
		Amount = sc.nextInt();
		N2000 = Amount / 2000;
		Amount = Amount % 2000;
		N500 = Amount / 500;
		Amount = Amount % 500;
		N200 = Amount / 200;
		Amount = Amount % 200;
		N100 = Amount / 100;
		Amount = Amount % 100;
		N50 = Amount / 50;
		Amount = Amount % 50;
		N20 = Amount / 20;
		Amount = Amount % 20;
		N10 = Amount / 10;
		Amount = Amount % 10;
		N5 = Amount / 5;
		Amount = Amount % 5;
		System.out.println("RS.2000 ~ Notes - " +N2000);
		System.out.println("RS.500 ~ Notes - " +N500);
		System.out.println("RS.200 ~ Notes - " +N200);
		System.out.println("RS.100 ~ Notes - " +N100);
		System.out.println("RS.50 ~ Notes - " +N50);
		System.out.println("RS.20 ~ Notes - " +N20);
		System.out.println("RS.10 ~ Notes - " +N10);
		System.out.print("RS.5 ~ Notes - " +N5);
	}
}