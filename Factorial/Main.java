#include<iostream>
using namespace std;
int fact(int n)
{
  int x;
  if(n==0 || n==1)
  {
    return 1;
  }
  return n*fact(n-1);
  
}
int main()
{
  int n;
  std::cin>>n;
  std::cout<<"The factorial of "<<n<<" is "<<fact(n);
  
  
  //Type your code here.
}