/* package whatever; // don't place package name! */

import java.math.BigInteger;
import java.util.Scanner;

/* Name of the class has to be "Main" only if the class is public. */
class JuliaBigAddition
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		
		for(int i=0;i<10;i++)
		{BigInteger b=new BigInteger(s.next());
			BigInteger c=new BigInteger(s.next());
			BigInteger d=(b.subtract(c));
			d=d.divide(new BigInteger(2+""));
			if(d.add(d.add(c)).equals(b))
			System.out.println(d.add(c)+"\n"+d);
//System.out.println(d.intValue());
		}

	}
}
