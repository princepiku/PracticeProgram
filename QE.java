import java.util.Scanner;

/*Step 1: StartStep 2: Declare variables a, b, c, D, x1, x2, rp and ip;Step 3: Calculate discriminant D ← b2-4acStep 4: If D ≥ 0 x1 ← (-b+√D)/2a x2 ← (-b-√D)/2a Display r1 and r2 as roots. Else Calculate real part and imaginary part rp ← -b/2a ip ← √(-D)/2a Display rp+j(ip) and rp-j(ip) as rootsStep 5: Stop */
public class QE
{
	public static void main(String alex[])
	{
		double a, b, c, D, x1, x2, rp, ip;
		Scanner pk = new Scanner(System.in);
		System.out.print("Enter the coefficient a : ");
		a = pk.nextDouble();
		System.out.print("Enter the coefficient b : ");
		b = pk.nextDouble();
		System.out.print("Enter the coefficient c : ");
		c = pk.nextDouble();

		D = b * b - 4 * a * c;

		if(D >= 0)
		{
			x1 = (- b + Math.sqrt(D)) / 2 * a;
			x2 = (- b + Math.sqrt(D)) / 2 * a;
			System.out.println("Root 1 is "+x1);
			System.out.println("Root 2 is "+x2);
		}
		else
		{
			rp = -b / 2 * a;
			ip = (Math.sqrt(-D)) / 2 * a;
			System.out.println("Root 1 : " + rp + " + j(" + ip + ")");
			System.out.println("Root 2 : " + rp + " - j(" + ip + ")");
		}
	}
}
