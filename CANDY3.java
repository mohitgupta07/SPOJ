/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class candy3
{
	public static void main (String[] args) throws java.lang.Exception
	{
Scanner s=new Scanner(System.in);
	long t=s.nextLong();
	while(t-->0)
	{
		Long n=s.nextLong();
		//int a[]=new int[n];
		long sum=0;
		for(int i=0;i<n;i++)
		{
		long tmp=s.nextLong();
			sum+=tmp;
		sum=sum%n;
		}
		//// check for integer
	
		if( sum==0)//avg is integer
		{
			
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
	}

	}
}
