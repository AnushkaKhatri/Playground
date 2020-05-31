#include<iostream>
using namespace std;
int main()
{
  float mileage;
  int liters, distance;
  cin>>mileage;
  cin>>liters;
  cin>>distance;
  float x = distance/liters;
  
  if(x<mileage)
  {
    cout<<"Can reach";
  }
  else
  {
    cout<<"Cannot reach";
  }
  //Type your code here.
}