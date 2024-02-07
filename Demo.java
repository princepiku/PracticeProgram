// WAP To Print The (BitWise & Logical).
class Demo
{
	public static void main(String alex[])
	{
		int x = 10;
		int y = 12;
		System.out.println("BitWise:");
		System.out.println(x+ " & " +y+ " = " +(x&y));
		System.out.println(x+ " | " +y+ " = " +(x|y));
		System.out.println(x+ " ^ " +y+ " = " +(x^y));
		System.out.println(" ~ " +x+ " = " +(~x));
		boolean x1 = true;
		boolean y1 = false;
		System.out.println("Logical:");
		System.out.println(x1+ " && " +y1+ " = " +(x1&&y1));
		System.out.println(x1+ " || " +y1+ " = " +(x1||y1));
		
	
		/*int a = 10;
		int b = 20;
		boolean r = ++a > b++ & a++ != ++b;
		System.out.print("Bitwise Operator => a "+a+ ", b = "+b+", Result = "+r);
		
		a = 10; // 11
		b = 20; // 21
		r = ++a > b++ && a++ != ++b;
		11 > 20
		System.out.print("Logical Operator => a = "+a+ ", b = "+b+", Result = "+r);*/
		 
	}
}