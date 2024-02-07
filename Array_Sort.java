// 4. Print the names in Sorted Order. (Using Arrays)

import java.util.*;
import java.util.Arrays;

public class Array_Sort
{
	public static void main(String alex[])
	{
		String arr[] = {"Prince","Kumar","Sinha","Alex","Zoe","Patna","Bihar","Raj"};
		System.out.println("Original Array : "+Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("Sorted Array : "+Arrays.toString(arr));
	}
}

