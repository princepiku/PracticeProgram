public class Complex
{
	int real, imaginary;
	Complex(int tempReal, int tempImaginary)
	{
		real = tempReal;
		imaginary = tempImaginary;
	}
	Complex addComp(Complex C1, Complex C2)
	{
		Complex temp = new Complex();
		temp.real = C1.real + C2.real;
		temp.imaginary = C1.imaginary + C2.imaginary;
		return temp;
	}
	Complex()
	{
		
	}

	public static void main(String alex[])
	{
		Complex C1 = new Complex(8, 4);
		System.out.println("Complex number 1 : " +C1.real+ " + i"+C1.imaginary);
		Complex C2 = new Complex(6, 3);
		System.out.println("Complex number 2 : " +C2.real+ " + i"+C2.imaginary);
		Complex C3 = new Complex();
		C3 = C3.addComp(C1, C2);
		System.out.println("Sum of complex number : "+C3.real+ " + i"+C3.imaginary);
	}
}


	