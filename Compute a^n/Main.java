#include<iostream>
using namespace std;
int pow(int a,int n)
{
  
  if(n==0)
  {
    return 1;
  }
  else
  {
  return a*pow(a,n-1);
  }
}
int main()
{
  int a,n;
  std::cin>>a;
  std::cin>>n;
  std::cout<<"Enter the value of a"<<"\n";
  std::cout<<"Enter the value of n"<<"\n";
  std::cout<<"The value of "<<a<<" power "<<n<<" is "<<pow(a,n);
  //Type your code here.
}