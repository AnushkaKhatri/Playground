#include<iostream>
#include<cstring>
using namespace std;
int main()
{
  char s1[50];
  char s2[50];
  std::cin.getline(s1,50);
  std::cin.getline(s2,50);
  int len=strlen(s1);
  if(memcmp(s1,s2,len)==0)
  {
    std::cout<<"It is correct";
  }
  else
  {
    std::cout<<"It is wrong";
  }
  //Type your code here.
}