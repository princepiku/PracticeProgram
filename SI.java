// 8. (1) Demonstrate the Single(Simple) Inheritance.

class Parent
{
	void display()
	{
		System.out.println("I am Parent Class Display Method");
	}
}
class Child extends Parent
{
	void show()
	{
		System.out.println("I am Child Class Show Method");
	}
}

public class SI
{
	public static void main(String alex[])
	{
		Child c = new Child();
		c.display();
		c.show();
	}
}


