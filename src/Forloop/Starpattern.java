package Forloop;

public class Starpattern 
{
	public static void main(String[]args) 
	{
		for (int i=1; i<5; i++)  //square
		{
			for (int j=1; j<5; j++)
			{
				System.out.print("*");
			}
			System.out.println();
	} System.out.println("=====================");
		
		
		
		for (int i=1; i<=5; i++)  //quadrant 1
		{
			for(int j=1; j<i; j++) 
			{
				System.out.print("*");
			}System.out.println();
		}System.out.println("================");
		
		
		
		for (int i=1; i<5; i++)   //quadrant4
		{
			for (int j=5; j>i; j--) 
			{
				System.out.print("*");
			}System.out.println();
		}System.out.println("==================");
		
		
		
	     for(int i=1; i<5; i++)        //quadrant 1 & quadrant 4
	     {
	    	for(int j=1; j<=i;j++) 
	    	{
	    		System.out.print("*");
	    	}System.out.println();
	     }
	     for (int i=1; i<4;i++) 
	     {
	    	 for (int j=4; j>i; j--)
	    	 {
	    		 System.out.print("*");
	    	 }System.out.println();
	     }System.out.println("===============");
	     
	     
	     
	     for (int i=1; i<=5; i++) 
	     {
	    	 for(int j=5; j>i; j--)
	    	 {
	    		 System.out.print(" ");
	    	 }
	    	 for(int k=1; k<i;k++) 
	    	 {
	    		 System.out.print("*");
	    	 }System.out.println();
	     }System.out.println("===================");
	    	 
	     
	    	for(int i=1; i<5; i++) 
	    	{
	    		for(int j=1; j<i; j++) 
	    		{
	    			System.out.print(" ");
	    		}
	    		for(int k=5; k>i; k--) 
	    		{
	    			System.out.print("*");
	    		}System.out.println();
	    	}System.out.println("==============");
	    	
	    	
	    	for(int i=1; i<=5; i++) // Quadrant 2&3 
	    	{
	    		for(int j=5; j>i; j--) 
	    		{
	    			System.out.print(" ");
	    		}
	    		for(int k=1;k<i;k++) 
	    		{
	    			System.out.print("*");
	    		}System.out.println();
	    	}
	    	for(int i=1; i<4; i++) 
	    	{
	    		for(int j=1; j<=i; j++) 
	    		{
	    			System.out.print(" ");
	    		}
	    		for(int k=4; k>i;k--) 
	    		{
	    			System.out.print("*");
	    		}System.out.println();
	    	}System.out.println("=====================");
	   
	    	for(int i=1; i<5; i++)  //Rhombus
	    	{
	    		for(int j=i; j<5; j++)
	    		{
	    			System.out.print(" ");
	    		}
	    		for(int k=1;k<5;k++) 
	    		{
	    			System.out.print("*");
	    		}System.out.println();
	    	}
	    	 
	    	}
	     }
 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	


