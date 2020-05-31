#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  int m,n,req;
  std::cin>>m;
  std::cin>>n;
  std::cin>>req;
  if(req<=pow(m,n))
  {
    std::cout<<"Doctor, you can proceed with your experiment.";
  }
  else
  {
    std::cout<<"Sorry Doctor! You need more bacteria.";
  }
}
  