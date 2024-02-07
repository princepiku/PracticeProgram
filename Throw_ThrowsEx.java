public class Throw_ThrowsEx
{ 
    static void method() throws ArithmeticException  
    {  
        System.out.println("Inside the method()");  
        throw new ArithmeticException("Throwing ArithmeticException");
    }
    public static void main(String alex[])  
    {  
        try
        {  
            method();  
        }  
        catch(ArithmeticException e)  
        {  
            System.out.println("Caught in main() method");  
        }  
    }  
}
