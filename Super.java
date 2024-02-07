// 13. Illustrate the Java Keywords. (1) Super Keywords

class Parent
{
	void show()
	{
		System.out.println("Parent Class - Show Method");
	}
}
class Child extends Parent
{
	void display()
	{
		super.show();
		System.out.println("Child Class - Display Method");
	}
}
public class Super
{
	public static void main(String alex[])
	{
		Child c = new Child();
		c.display();
	}
}

