// 13. (3) Final Keywords.

final class Parent
{
	final int a = 10;
	final void diaplay()
	{
		System.out.println("Parent Class A : "+a);
	}
}
class Child extends Parent
{
	void display()
	{
		int a = a + 20;
		System.out.println("Child Class A : "+a);
	}
}
public class Final
{
	public static void main(String alex[])
	{
		Child c = new Child();
		c.diaplay();
	}
}

