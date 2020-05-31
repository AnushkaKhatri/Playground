#include<iostream>
int main()
{
  int n;
  std::cin>>n;
  int arr[n];
  int i;
  for(i=0;i<n;i++)
  {
    std::cin>>arr[i];
  }
  int max=arr[0];
  for(i=1;i<n;i++)
  {
    if(max<arr[i])
    {
      max=arr[i];
    }
  }
  std::cout<<max;
  // Type your code here
}