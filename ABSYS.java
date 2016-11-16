import java.util.Scanner;


 class ABSYS {
public static void main(String argsp[])throws Exception
{
	Scanner s=new Scanner(System.in);
	int t=Integer.parseInt(s.nextLine());
	while(t-->0)
	{
		//String tmp=s.nextLine();
		String a=s.nextLine();
		if(a.equals(""))
		{t++;
		//	System.out.println(2);
		continue;
		}
		//System.out.println(1+" "+a);
		String b[]=a.split(" ");
		//0-+-2-=-4
		int pos=0;
		for(int i=0;i<=4;i=i+2)
		{
			if(b[i].contains("machula"))
			{
				pos=i;
			}
		}
		//System.out.println(pos);--correct
	if(pos==4)
	{
		b[4]=(Integer.parseInt(b[0])+Integer.parseInt(b[2]))+"";
	}
	else if(pos==2)
	{
		b[2]=(Integer.parseInt(b[4])-Integer.parseInt(b[0]))+"";
			
	}
	else
	{
		b[0]=(Integer.parseInt(b[4])-Integer.parseInt(b[2]))+"";
			
	}
	String ans="";
	for(int i=0;i<5;i++)
	{
		ans=ans+b[i];
		if(i!=4)
			ans+=" ";
	}
	System.out.println(ans);
	
	}
}
}
