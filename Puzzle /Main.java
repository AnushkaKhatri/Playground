#include<iostream>
int main()
{
  int r,c;
  std::cin>>r;
  std::cin>>c;
  int arr[r][c];
  int ne[c][r];
  int i,j;
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      std::cin>>arr[i][j];
    }
  }
  for(i=0;i<c;i++)
  {
    for(j=0;j<r;j++)
    {
      ne[i][j]=arr[j][i];
    }
  }
  for(i=0;i<c;i++)
  {
    for(j=0;j<r;j++)
    {
      std::cout<<ne[i][j]<<" ";
    }
    std::cout<<"\n";
  }
      
  
    
    // Type your code here
}