#include <iostream>
#include<math.h>
using namespace std;

int main() {
	// your code goes here
	long long int t,sum=0;
	scanf("%lld",&t);
	for(long long int i=1;i<=t;i++)
	{
		long long int val=1;
		long long int len=sqrt(i);
		for(long long int j=2;j<=len;j++)
		{
			if(i%j==0)
			val++;
		}
	sum+=val;
	}
	printf("%lld\n",sum);
	return 0;
}
