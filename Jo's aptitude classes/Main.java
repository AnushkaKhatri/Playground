#include<iostream>
using namespace std;
int main()
{
int a,b,c,d,i,small,ans;
std::cin>>a;
std::cin>>b;
std::cin>>c;
std::cin>>d;
if(a>b && b>c)
{
small=c;
}
else if(b>c && c>a)
{
small=a;
}
else
{
small=b;
}
for(i=small;i>=1;i--)
{
if(c%i==0 && a%i==0)
{
if(b%i==0)
{
ans=i;
}
break;
}
}
if(d==ans)
{
std::cout<<"Answer is correct.";
}
else
{
std::cout<<"Answer is wrong.";
}
}
