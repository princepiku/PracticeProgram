// 6. Demonstrate the Method OverLoading to Add 2 Integer and Concat 2 String.

public class Method_OverLoading
{
	void operation(int a, int b)
    {
        int sum = a + b;
        System.out.println("Sum of 2 Int : "+sum);
    }
	void operation(String s1, String s2)
	{
		String c = s1 + s2;
		System.out.println("Concatenation of Two String : "+c);
	}
	
    public static void main(String alex[])
    {
        Method_OverLoading m = new Method_OverLoading();
        m.operation(50,20);
		m.operation("Prince"," Sinha");
    }
}

