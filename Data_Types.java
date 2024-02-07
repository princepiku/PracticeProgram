import java.util.*;
import java.util.Scanner;
public class Data_Types
{
	public static void main(String alex[])
	{
		String SRN;
		String name;
		String phone;
		String email;
		double salary;
		Scanner pk = new Scanner(System.in);
		System.out.print("Enter Your SRN No : ");
		SRN = pk.nextLine();
		System.out.print("Enter Your Name : ");
		name = pk.nextLine();
		System.out.print("Enter Your Phone No : ");
		phone = pk.nextLine();
		System.out.print("Enter Your Email-id : ");
		email = pk.nextLine();
		System.out.print("Enter Your Salary : ");
		salary = pk.nextDouble();
		System.out.println("Your SRN : "+SRN);
		System.out.println("Your Name : "+name);
		System.out.println("Your Phone No : "+phone);
		System.out.println("Your Email-id : "+email);
		System.out.println("Your Salary : "+salary);
	}
}

	
	