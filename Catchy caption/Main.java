#include <cstring>
#include <iostream>
int main()
{
char s[100];
std::cin.getline(s,100);
int len = strlen(s);
int word=0;
for(int i=0;i<len;i++)
{
if(s[i]==' ')
{word++;}
}
if(word<=10)
{
 std::cout<<"Caption eligible for the contest";
}  
else 
{
 std::cout<<"Caption not eligible for the contest";
}
}
