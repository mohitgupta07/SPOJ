#include <iostream>
#define PI 3.14159
using namespace std;

int main() {
	// your code goes here
	while(1)
	{
		long long int l;
		scanf("%lld",&l);
		if(l==0)
		break;
		double r=(double)l/(double)PI; 
		double area= (PI * r* r)/(double)2.0;
		printf("%.2lf\n",area);
	}
	return 0;
}
