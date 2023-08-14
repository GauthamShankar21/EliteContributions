#include<iostream>

using namespace std;
bool leapYear(int year)
{
	if(year%400==0&&(year%4==0||year%100!=0))
		return 1;

	return 0;
}

int main()
{
	int year;
	cout<<"Enter a year.\n";
	cin>>year;

	if(leapYear(year))
		cout<<"The year "<<year<<" is a leap year\n";
	else
		cout<<"The year "<<year<<" is not a leap year\n";

	return 0;
		
}
