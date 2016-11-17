#include <iostream>
using namespace std;

int main() {
	// your code goes here
	long long int t,x,y,sum;
	scanf("%lld",&t);
	while(t--)
	{
		scanf("%lld%lld%lld",&x,&y,&sum);
		long long int n=(sum*2)/(x+y);
		long long int d=(y-x)/(n-5);
		long long int a=x-(2*d);
		printf("%lld\n",n);
		long long int an=a;
		for(int i=1;i<=n;i++)
		{
			
			printf("%lld ",an);
		an=an+d;
		}
		printf("\n");
	}
	return 0;
}
