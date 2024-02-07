// 9. Implement an Abstract Class.

abstract class Parent
{
	abstract void show();
	abstract void add(int a, int b);
	void display()
	{
		System.out.println("Parent Class Method Display");
	}
}
class Child extends Parent
{
	public void show()
	{
		super.display();
		System.out.println("Child Class Method Show");
	}
	public void add(int a, int b)
	{
		int sum = a + b;
		System.out.println("Addition : "+sum);
	}
}
public class Abstract_Class
{
	public static void main(String alex[])
	{
		Child c = new Child();
		c.show();
		c.add(10,20);
	}
}


	