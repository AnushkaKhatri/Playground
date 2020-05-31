#include<iostream>
int main()
{
  int r,c;
  std::cin>>r;
  std::cin >>c;
  int i,j;
  int arr[r][c];
  int arr2[r][c];
  int sum[r][c];
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      std::cin>>arr[i][j];
    }
  }
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      std::cin>>arr2[i][j];
    }
  }
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      sum[i][j]=arr[i][j]+arr2[i][j];
    }
  }
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      std::cout<<sum[i][j]<<" ";
    }
    std::cout<<"\n";
  }
    // Type your code here
}