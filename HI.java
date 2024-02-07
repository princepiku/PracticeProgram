class Parent
{
	void show()
	{
		System.out.println("I am Parnet Class Show Method");
	}
}
class Child extends Parent
{
	void display()
	{
		System.out.println("I am Child Class Display Method");
	}
}
class Son extends Parent
{
	void view()
	{
		System.out.println("I am Son Class View Method");
	}
}
public class HI
{
	public static void main(String alex[])
	{
		//Parent p = new Parent();
		//p.show();
		Child c = new Child();
		c.display();
		//p.show();
		Son s = new Son();
		s.view();
		s.show();
		//s.display();
	}
}
