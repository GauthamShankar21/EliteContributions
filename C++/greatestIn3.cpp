#include<iostream>

using namespace std;

int greatestOfThree(int num1, int num2, int num3)
{
	int gr;
	num1>num2?(num1>num3?(gr = num1):(gr = num3)):(num2>num3?(gr =num2):(gr = num3));
	return gr;
}

int main()
{
	int num1,num2,num3;

	cout<<"Enter three numbers.\n";
	cin>>num1>>num2>>num3;

	cout<<"The greatest of the entered three numbers is "<<greatestOfThree(num1,num2,num3);
	return 0;


}
