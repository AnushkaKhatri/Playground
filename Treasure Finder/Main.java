#include<iostream>
using namespace std;
int main()
{
  int num[3];
  int i,j,temp;
  for(i=0;i<3;i++)
  {
   cin>>num[i];
  }
  int max=num[0];
  for(i=0;i<3;i++)
  {
    for(j=i+1;j<3;j++)
    {
      if(num[i]>num[j])
      {
        temp=num[i];
        num[i]=num[j];
        num[j]=temp;
      }
    }
  }
  cout<<"The treasure is in box which has number "<<num[1]<<endl;
 
  for(i=num[0];i>=1;i--)
  {
    if(num[0]%i==0 && num[1]%i==0)
    {
      if(num[2]%i==0)
      break;
    }
  }
cout<<"The code to open the box is "<<i;
  //Type your code here.
}