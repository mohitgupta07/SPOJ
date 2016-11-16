import java.util.HashMap;
import java.util.Scanner;


 class dpbitland {
	static HashMap<Long, Long> hm; 
public static void main(String args[])throws Exception
{
	Scanner s=new Scanner(System.in);
	hm=new HashMap<>();
	hm.put(0L,0L);
	while(s.hasNext())
	{
		int n=s.nextInt();
		long max=coins(n);
	System.out.println(max);
	}
}
static long coins(long n)
{
	long a=n/2;
	Long test=hm.get(a);
if(test==null)
{
	a=coins(a);
}
else
	a=test;
	
	long b=n/3;
	 test=hm.get(b);
if(test==null)
{
	b=coins(b);
}
else
	b=test;
		
	long c=n/4;
	 test=hm.get(c);
if(test==null)
{
	c=coins(c);
}
else
	c=test;
	
	
	long val=Math.max(a+b+c,n);
	hm.put(n, val);
	return val;
}
}
