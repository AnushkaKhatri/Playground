#include<iostream>
using namespace std;
int pow(int n)
{
  if(n<10)
  {
    return n;
  }
  else
  {
   int x= (n%10)+pow(n/10);
    n=x;
   return pow(n);
  }
}
      
int main()
{
  int n;
  std::cin>>n;
 std::cout<<pow(n);
}