include<iostream>
using namespace std;
class data
{ int a[5];
public:
void take();
void bsearch(int); //prototype decided by user
};
void data::take()//to init array
{
int i;
for(i=0;i<5;i++)
{
cin>>a[i];
}
}
void data::bsearch(int d)
{ int start=0,end=4;
int mid,cnt=0;
mid=(start+end)/2;
while(start<=end)
{if(a[mid]<d)//d is bigger than mid case 1
  start=mid+1;
else if(a[mid]==d)//d is equal to mid case 2
{
  cnt=1;
  break;
}
else
  end=mid-1; //d<mid case3
}
if(cnt==0)
cout<<"not found";
else
cout<<"found";
}
int main()
{ data d1;
int num;
d1.take();
cout<<"enter the number to search";
cin>>num;
d1.bsearch(num);

}
