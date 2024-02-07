// 10. Demonstrate the Method OverRiding. (Using Super Keywords)

class Parent
{
	void Display()
	{
		System.out.println("I am Parent Class Display Method");
	}
}
class Child extends Parent
{
	void Display()
	{
		super.Display();
		System.out.println("I am Child Class Display Method");
	}
}
public class Method_OverRiding
{
	public static void main(String alex[])
	{
		Child c = new Child();
		c.Display();
	}
}

