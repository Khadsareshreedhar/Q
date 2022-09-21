package Forloop;

public class No 
{
	public static void main(String[] args) 
  {
	for(int i=1; i<=10; i++) // even no
		
	{ 
	if(i%2==0) 
	    {
		
		System.out.println(i+"Even number");
		}
	else {
		System.out.println(i+"not even number");
	     }
		
	
	}System.out.println("=================");
	 
	 
	for(int i=1; i<=10; i++) 
	{
		if(i%2!=0) 
		{
			System.out.println(i);
		}
		
	}System.out.println("==================");
	
    int no =7; int temp=0;   //prime no
    for (int i=1; i<no; i++)
    {
    	if(no%2==0) 
    	{
    		temp=temp + 1;
    	}
    }
        if(temp>0) 
        {
        	System.out.println("not prime");
        }
        else 
        {
        	System.out.println("prime");
        }System.out.println("==============");
	
        int n=10;          //Fibbonance
        int a=0;
        int b=1;
        int c;     //1,2,3,4,5
        
        for(int i=1; i<=n; i++) 
        {
        	c=a+b;
        	System.out.println(c);
        	a=b;
        	b=c;
        	
        }System.out.println("=============");
        
        
        int i=1;   //factorial
         int num=5;
         int fact=1;
         for(i=1; i<=num; i++) 
         {
        	 fact = fact *i;
        	 
         } System.out.println(fact);
        System.out.println("================");
        
            
  }
}