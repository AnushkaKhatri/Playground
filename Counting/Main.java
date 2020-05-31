#include<iostream>
#include<cstring>
using namespace std;
int main()
{
  int vowels=0,symbol=0, consonant=0, digit=0, space=0;
  char str[200];
  cin.getline(str,200);
  int i;
  for(i=0;i<strlen(str);i++)
  {
    if(str[i]=='a'|| str[i]=='e' || str[i]=='i' || str[i]=='o' || str[i]=='u' || str[i]=='A' || str[i]=='E' || str[i]=='I' || str[i]=='O' || str[i]=='U')
    {
      vowels++;
    }
    if(str[i]>=48 && str[i]<=57)
    {
      digit++;
    }
    if(str[i]==32)
    {
      space++;
    }
    if(str[i]>=33 && str[i]<=47)
    {
      symbol++;
    }
    if(str[i]>=65 && str[i]<=90 || str[i]>=97 && str[i]<=122)
    {
      consonant++;
    }
  }
  cout<<"Vowels:"<<vowels<<endl;
  cout<<"Consonants:"<<consonant-vowels<<endl;
  cout<<"White Spaces:"<<space<<endl;
  cout<<"Digits:"<<digit<<endl;
  cout<<"Symbols:"<<symbol<<endl;
  
  //Type your code here.
}