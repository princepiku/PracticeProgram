public class ThrowsException
{
	public static int divideNum(int m, int n) throws ArithmeticException
	{  
		int div = m / n;  
		return div;
    }
    public static void main(String alex[])
	{  
        ThrowsException t = new ThrowsException();
        try
		{  
            System.out.println(t.divideNum(45, 0));  
        }
        catch(ArithmeticException e)
		{  
            System.out.println("Number cannot be divided by 0");  
        }
        System.out.println("Rest of the code.....");  
    }  
}
 