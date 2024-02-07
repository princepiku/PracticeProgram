// WAP To Print The Swapping Of Two Number & Using Third Variable Method.
import java.util.Scanner;
public class Swap1
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int A, B;
		int X, Y, temp;
		System.out.println("Swap The Value Of Without Using Third Variable :");
		System.out.print("Enter The Value Of A : ");
		A = in.nextInt();
		System.out.print("Enter The Value Of B : ");
		B = in.nextInt();
		System.out.println("Before Swapping : \nA = " +A+ "\nB = " +B);
		A = A + B;
		B = A - B;
		A = A - B;
		System.out.println("After Swapping : \nA = " +A+ "\nB = " +B);
		
		System.out.println("Swap The Value Of Using Third Variable :");
		System.out.print("Enter The Value Of X : ");
		X = in.nextInt();
		System.out.print("Enter The Value Of Y : ");
		Y = in.nextInt();
		System.out.println("Before Swapping : \nX = " +X+ "\nY = " +Y);
		temp = X;
		X = Y;
		Y = temp;
		System.out.print("After Swapping : \nX = " +X+ "\nY = " +Y);
	}
}