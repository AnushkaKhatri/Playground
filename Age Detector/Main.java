#include<iostream>
using namespace std;
int main()
{
  int n,age;
  int m;
  cin>>n;
  cin>>m;
  if(n<m)
  {
    age=m-n;
  }
  if(n>m)
  {
    age=(100-n)+m;
  }
  cout<<age;
  //Type your code here.
}