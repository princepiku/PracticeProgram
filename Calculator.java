// WAP To The Calculator.
import java.util.Scanner;
public class Calculator
{
	public static void main(String arg [])
	{
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Number 1st : ");
		int Num1 = sc.nextInt();
		System.out.print("Enter The Number 2nd : ");
		int Num2 = sc.nextInt();
		System.out.println("Please Enter Case : \n + For Addition \n - For Substraction \n * For Multiplication \n / For Division \n % For Remainder");
		ch = sc.next().charAt(0);
		System.out.println(Num1+"\t&\t"+Num2);
		switch(ch)
		{
			case '+' : System.out.print("[Addition] = "+(Num1+Num2));
			break;
			case '-' : System.out.print("[Substraction] = "+(Num1-Num2));
			break;
			case '*' : System.out.print("[Multiplication] = "+(Num1*Num2));
			break;
			case '/' : System.out.print("[Division] = "+(Num1/Num2));
			break;
			case '%' : System.out.print("[Remainder] = "+(Num1%Num2));
			break;
			default: System.out.print("Oops Sorry Invalid Input!");
		}
	}
}