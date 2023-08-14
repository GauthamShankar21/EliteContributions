#include<iostream>


using namespace std;

bool linearSearch(int num, int *array)
{

	for(int i=0;array[i];i++)
		if(array[i]==num)
			return 1;
	return 0;
}

int main()
{
	
	int n,num;
	int array[100];

	cout<<"Enter the number of values to be inserted in the array.\n";
	cin>>n;
	cout<<"Enter "<<n<<" numbers:\n";
	for(int i=0;i<n;i++)
		cin>>array[i];
	cout<<"Enter the element to search in the array.\n";
	cin>>num;
	if(linearSearch(num,array))
		cout<<"The number is found in the array.\n";
	else
		cout<<"The number is not found in the array.\n";

	return 0;



}
