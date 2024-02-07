// Display Formula.
class Test
{
	public static void main(String alex[])
	{
		int a = Integer.parseInt(alex[0]);
		int b = Integer.parseInt(alex[1]);
		int c = a*a + b*b + 2*a*b;
		int d = a*a + b*b - 2*a*b;
		int e = (a+b)*(a+b)*(a+b) - 3*a*b*(a+b);
		int f = (a-b)*(a-b)*(a-b) - 3*a*b*(a-b);
		System.out.println("(a+b)^2 = " +c);
		System.out.println("(a-b)^2 = " +d);
		System.out.println("a^3+b^3 = " +e);
		System.out.print("a^3-b^3 = " +f);
	}
}