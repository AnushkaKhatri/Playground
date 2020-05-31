#include<iostream>
int gcd(int small,int n,int m)
{
  if(n%small==0 && m%small==0)
  {
    return small;
  }
  else
  {
    return gcd(small-1,n,m);
  }
}
  
int main()
{
int n,small;
int m;
std::cin>>n;
std::cin>>m;
  if(n<=m)
  {
    small=n;
  }
  else
  {
    small=m;
  }
std::cout<<"G.C.D of "<<n<<" and "<<m<<" = "<<gcd(small,n,m);
}
