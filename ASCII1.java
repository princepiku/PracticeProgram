// WAP To Find The ASCII Value Of Any Alphabet, Digit Or Special Symbol.
import java.util.Scanner;
public class ASCII1
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		char ch;
		System.out.print("Enter Any Alphabet, Digit, Or Symbol : ");
		ch = sc.next().charAt(0);
		System.out.print("The ASCII Value Of " +ch+ " ==> " +(int)ch);
	}
}