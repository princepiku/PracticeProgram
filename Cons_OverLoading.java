// 7. Demonstrate the Constructor OverLoading with different Parameter and Find the Area of the Rectangle.

public class Cons_OverLoading
{
	int length;
	int width;
	
	void rect_area()
	{
		
	}
	
	Cons_OverLoading()
	{
		length = 15;
		width = 13;
		int area = length * width;
		System.out.println("Area of Rectangle Without Parameter : "+area);
	}
	
	Cons_OverLoading(int a)
	{
		length = width = a;
		int area = length * width;
		System.out.println("Area of Rectangle Single Parameter : "+area);
	}
	
	Cons_OverLoading(int a, int b)
	{
		length = a;
		width = b;
		int area = length * width;
		System.out.println("Area of Rectangle Double Parameter : "+area);
	}
	
	public static void main(String alex[])
	{
			Cons_OverLoading a1 = new Cons_OverLoading();
			Cons_OverLoading a2 = new Cons_OverLoading(7);
			Cons_OverLoading a3 = new Cons_OverLoading(12,14);
			a1.rect_area();
			a2.rect_area();
			a3.rect_area();
	}		
}



    
	
	