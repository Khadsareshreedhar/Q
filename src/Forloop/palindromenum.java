package Forloop;

import java.util.Scanner;

public class palindromenum
{
	public static void main(String[] args) 
	{  Scanner s =new Scanner(System.in);
	    System.out.println("enter number");
             int no=s.nextInt();	
	
		//   int no=1331;
		   int temp=no;
		   int rev=0;
		   int rem;
		   while(temp != 0) 
		   {
			   rem=temp%10;
			   rev=rev*10+rem;
			   temp=temp/10;
			   
		   }if(no==rev)
		   {
			   System.out.println(no+"is pallindrom");
		   }
		   
		   else
		   {
			   System.out.println(no+" is not pallindrom");
			   }
				  System.out.println("===================");
				  
				  
				  
				  
				   
			   
				 
	}
}
	
