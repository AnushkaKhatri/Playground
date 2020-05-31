#include<iostream>
#include<cstring>
using namespace std;
int main()
{
  char s[200];
  cin>>s;
  int len=strlen(s);
  int i;
  for(i=0;i<len;i++)
  {
    if((s[i]>=97 && s[i]<=122)||(s[i]>=65 && s[i]<=90))
    { 
      cout<<s[i];
    }
  }
  //Type your code here.
}