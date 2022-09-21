package Array;

public class pimeevenodd
{
	public static void main(String[] args) 
	{
		int q[]= {1,2,3,4,5,6,7};
		
		for(int i=0; i<=q.length-1; i++) 
		{
			System.out.println(q[i]+"");
		}System.out.println("==========");
		
		
		int a[]= {11,22,33,44};
		
		System.out.println(a.length);
		System.out.println("==============");
		
		int size=a.length;                        //print array
		for(int i=0; i<=size-1; i++)
		{
			System.out.println(a[i]);
		}System.out.println("==============");
		
		for(int i=size-1; i>=0; i--)            
		{
			System.out.println(a[i]);
		}System.out.println("================");
		
		
		int b[]= {1,2,3,4,5,6,7,8,9,10};
	int	temp=0;
	int	sizeb =b.length;
		for(int i=0; i<=sizeb; i++) 
		{
			for(int j=2; j<=b[i]-1; j++)
			{
				if(b[i]%j==0) 
				{
					temp=temp+1;
				}
			}
			if(temp==0) 
			{
				System.out.println(b[i]+" ");
			}
			else 
			{
				temp=0;
			}
			}
		}
	
		
		
		
		
		
		
		
		
		
		
		
	}


