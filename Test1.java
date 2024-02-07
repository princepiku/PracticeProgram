// WAP To Print(Prefix & Postfix).
class Test1
{
	public static void main(String alex[])
	{
		//int a = 2;
		//int b = 3;
		//int c = 5;
		//int x = a++ + ++b - c++;
		//int y = ++a - b-- + --c;
		//int z = a++ + --b - c--;
		//System.out.println("Value Of X = " +x);
		//System.out.println("Value Of y = " +y);
		//System.out.println("Value Of Z = " +z);
		//System.out.println("Value Of A = " +a);
		//System.out.println("Value Of B = " +b);
		//System.out.println("Value Of C = " +c);
		
		int a = 139;
		int b = -276;
		int x = a++ + ++b;
		a = x++ + --b + ++a - ++x;
		int y = ++x - a-- - b-- - x++;
		b = y-- - x++ - --b + --a;
		System.out.println("Value of x = " +x);
		System.out.println("Value of A = " +a);
		System.out.println("Value of y = " +y);
		System.out.print("Value of B = " +b);
		
		//int a = 3;
		//int b = -2;
		//int x = a++ + b++;
		//a = a++ - ++b + ++x;
		//int y = x++ - ++a - ++b;
		//b = y-- + ++x - a-- + ++b;
		//System.out.println("Value Of X = " +x);
		//System.out.println("Value Of A = " +a);
		//System.out.println("Value Of Y = " +y);
		//System.out.println("Value Of B = " +b);
		
		
	}
}