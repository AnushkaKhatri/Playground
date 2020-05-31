#include<iostream>
int power(int m,int n)
{
    int j,i;
    for(i=1,j=1;i<=n;i++)
        j=j*m;
    return j;
}
int arm(int n)
{
  int p=n,count=0;
  while(n!=0)
  {
    n=n/10;
    count=count+1;
  }
  n=p;
  int rem,x,sum=0;
  while(n!=0)
  {
  rem=n%10;
  x=power(rem,count);
  sum=sum+x;
  n=n/10;
  }
 
  if(sum==p)
  {
    return 1;
  }
  else
  {
    return 0;
  }
  
  
    //Your code goes here
}
int main()
{
    int n;
    std::cin>>n;
  
    if(arm(n)==1)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
    
}