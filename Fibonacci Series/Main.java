#include<iostream>
using namespace std;
int fib(int n)
{
  if(n==0)
  {
    return 0;
  }
  else if(n==1)
  {
    return 1;
  }
  else
  {
    return fib(n-1)+fib(n-2);
   }
}
int main()
{
  int a;
  std::cin>>a;
  int n=a-1;
  std::cout<<"The term "<<a<<" in the fibonacci series is "<<fib(n);
  //Type your code here.
}