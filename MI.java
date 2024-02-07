// 8. (2) Demonstrate the Multilevel Inheritance.

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
class Son extends Child
{
	void view()
	{
		System.out.println("I am Son Class View Method");
	}
}

public class MI
{
	public static void main(String alex[])
	{
		Son s = new Son();
		s.display();
		s.show();
		s.view();
	}
}