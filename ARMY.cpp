#include <iostream>
using namespace std;

int main() {
	// your code goes here
	long long int tmp,t,x,y,n,m,i;
	scanf("%lld",&t);
	while(t-->0)
	{x=0;
	y=0;
		scanf("%lld%lld",&n,&m);
		for(i=0;i<n;i++)
		{
			scanf("%lld",&tmp);
			if(x<tmp)
			x=tmp;
		}
		for(i=0;i<m;i++)
		{
			scanf("%lld",&tmp);
			if(y<tmp)
			y=tmp;
		}
		if(x>=y)
		printf("Godzilla\n");
		else
		printf("MechaGodzilla\n");
	}
	return 0;
}
