//import java.util.*;
import java.util.Scanner;
public class String_Operation
{
	public static void main(String alex[])
	{
		String s1;
		String s2;
		Scanner pk = new Scanner(System.in);
		System.out.print("Enter Your 1st String : ");
		s1 = pk.nextLine();
		System.out.print("Enter Your 2nd String : ");
		s2 = pk.nextLine();
		String s3 = s1.concat(s2);
		System.out.println("The Concatenated String : "+s3);
		System.out.println("Length of the 1st String : "+s1.length());
		System.out.println("Length of the 2nd String : "+s2.length());
		System.out.println("The Length of both String : "+s3.length());
		System.out.println("String are EQUAL or NOT EQUAL(Comparing) : "+s1.equals(s2));
	}
}

