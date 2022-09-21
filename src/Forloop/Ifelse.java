package Forloop;

import java.util.Scanner;

public class Ifelse 
{ public static void main(String[] args) 
    { 
	  Scanner s = new Scanner (System.in);
      System.out.println("enter numbers");
      
	   int a=s.nextInt();
	   int b=s.nextInt();
	   int c=s.nextInt();
	   int d=s.nextInt();
	
	   if(a>b) 
	   {
		   if(a>c) 
		   {
			   if(a>d) 
			   {
				   System.out.println(a+"a is greater");
			   }
			   else 
			   {
				   System.out.println(d+"d is greater");
			   }
		   }
	   }
	   else if(b>c) 
	   {
		   if(b>d) 
		   {
			   System.out.println(c+"c is greater");
		   }
		   else 
		   {
			   System.out.println(d+"d is greater");
		   }
	   }
	   else 
	   {
	   if(c>d)
	      {
		   System.out.println(c+ "c is greater ");
		   }
	   
	   else 
	   {
		   System.out.println(d+ "d is greater");
	   }
		   
	   }System.out.println("==========================");
	   
	   
	   
	  
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	
	   
    }
}

