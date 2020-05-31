#include<iostream>
int main()
{
  int count=0;
  int n;
  std::cin>>n;
  int arr[n];
  int i;
  for(i=0;i<n;i++)
  {
    std::cin>>arr[i];
  }
  int meera;
  std::cin>>meera;
  for(i=0;i<n;i++)
  {
    if(arr[i]==meera)
    {
      count=count+1;
    }
  }
  if(count>0)
  {
    std::cout<<"She passed her exam";
  }
  else
  {
    std::cout<<"She failed";
  }
  // Type your code here
}