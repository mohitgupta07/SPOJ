
import java.util.Arrays;
import java.util.Scanner;

public class FenwickINVCNT {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int t=s.nextInt();
int value=1;
while(t-->0)
{
	int n=s.nextInt();
	int a[]=new int[n];
	for(int i=0;i<n;i++)
	{
		a[i]=s.nextInt();
	}
	_convertToRank(a,n);
	int b[]=new int[n+1];
	long sum=0;
	for(int i=n;i>0;i--)
	{
		int key=a[i-1];
		
		_fenwickUpdate(key, value, a, b, n);
		sum=sum+_getsum(b, key-1);
	}
	System.out.println(sum);
}
	}
	static void _convertToRank(int a[],int n)
	{
		int c[]=a.clone();
		Arrays.sort(c);
		for(int i=0;i<n;i++)
		{
			int p=Arrays.binarySearch(c, a[i])+1;
		//	System.out.print(p+" ");
			a[i]=p;
		}
		//System.out.println();
	}
	static long _getsum(int b[],int j)
	{
		long sum=0;
		j=j;//not j+1
		while(j>0)
		{
			sum=sum+b[j];
			j=_getparent(j);
		}
		
		return sum;
	}
	static void _fenwickUpdate(int key,int value,int a[],int b[],int n)
	{
		int vala=value;
		int j=key;//not key+1
		while(j<=(n))
		{
			b[j]=b[j]+vala;
			j=_getnext(j);
		}
		
	}
	static int _getnext(int val)
	{
		val=((~val+1)&val)+val;
		//System.out.println(val);

		return val;
	}
	static int _getparent(int val)
	{
		val=val-((~val+1)&val);
		//System.out.println(val);

		return val;
	}
}
