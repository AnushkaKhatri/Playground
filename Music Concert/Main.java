#include<iostream>
#include<cstdlib>
int main(){
  int* a;
  int n,j;
  std::cin>>n;
  a= (int*)malloc(n*sizeof(int));
  int i;
  for(i=0;i<n;i++)
  {
    std::cin>>a[i];
  }
  int even=0;
  int odd=0;
  for(i=0;i<n;i++)
  {
    if(*(a+i)%2==0)
    {
    even=even+1;
    }
    else
    {
      odd=odd+1;
    }
  }
  std::cout<<odd<<"\n";
  std::cout<<even<<"\n";
  free(a);

  // Type your code here
  return 0;
}