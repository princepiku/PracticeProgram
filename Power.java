import java.util.Scanner; 

public class Power
{ 
	public static void main(String alex[])
	{      
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);   
		System.out.print("Enter The Base Number = ");    
		int base = sc.nextInt();      
		int temp = base;  
		System.out.print("Enter The Exponent Number = ");     
		int exp = sc.nextInt();      
		for (int i = 1; i < exp; i++)
		{         
			temp = temp * temp;
		} 
		System.out.println("Result of "+base+" Power "+exp+" is = "+temp);   
	}
}