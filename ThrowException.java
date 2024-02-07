public class ThrowException
{  
    public static void checkNum(int num)
	{  
        if(num < 1)
		{  
            throw new ArithmeticException("\nNumber is negative, cannot calculate square !");  
        }  
        else
		{  
            System.out.println("Square of " + num + " is " + (num * num));  
        }  
    }   
    public static void main(String alex[])
	{
		ThrowException t = new ThrowException();
		t.checkNum(-3);  
        System.out.println("Rest of the code.....");  
    }  
}

