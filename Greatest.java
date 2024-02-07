// WAP To Print The Greatest Number b/w Three Number(Using Conditional Operator).
class Greatest
{
	public static void main(String alex[])
	{
		int a = 55;
		int b = 35;
		int c = 45;
		int greatest = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
		System.out.print("Greatest Number = "+greatest);
	}
}