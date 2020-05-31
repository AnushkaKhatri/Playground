#include<stdio.h>
#include<string.h>
int main()
{
  char s[50], temp;
  	int i, j, len;
  	gets(s);
  	len = strlen(s) - 1;
 for (i = 0; i < strlen(s)/2; i++)
  	{
  		temp = s[i];
  		s[i] = s[len];
  		s[len--] = temp;
  	}
  char a[50];
  scanf("%s",a);
  
  if(strcmp(s,a)==0)
  {
    printf("It is correct");
  }
  else
  {
    printf("It is wrong");
  }
}