package Exceptionhandling;

public class exception {
	public static void main(String[] args) {
		int a=10;
		int b=0;
		int[] r= {1,2,3,4};
		
		int result;
		System.out.println("Operation start");
		try
		{
			result=a/b; //posibillity of exception
			System.out.println(result);
			System.out.println(r[5]);
		}
		catch(ArithmeticException e)
		{ 
			System.out.println("The value of b is zero");
	     	b=1;
			result=a/b;
			
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("given index is out of array size");
			System.out.println("last array index value is"+r[3]);
		}
		catch(Exception e) 
		{
			System.out.println("exception catche");
		}
		System.out.println("21may batch");
		//System.out.println("result is"+result);
	}

}
