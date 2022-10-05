#include<iostream>
using namespace std;
int n;
int top=-1;
void push(int a[],int n)
{
if(top==n-1)
{
cout<<"STACK FULL";
return;
}
cout<<"ENTER ELEMENT TO PUSH IN STACK:\t";
top++;
cin>>a[top];
}
void pop(int a[])
{
if(top==-1)
{
cout<<"EMPTY STACK";
return ;
}
--top;
}
int peek(int a[],int top)
{
if(top==-1)
{
cout<<"EMPTY STACK";
return -1;
}
return a[top];
}
void display(int a[],int top)

{
if(top==-1)
{
cout<<"EMPTY STACK";
return;
}
for(int i=top;i>=0;i--)
cout<<a[i]<<endl;
}
bool isempty(int top)
{
if(top==-1)
return true;
return false;
}
int main()
{
int n,num;
cout<<" \n";
cout<<"STACK FUNCTIONS\nENTER THE HEIGHT OF STACK:\t";
cin>>n;
int a[n];
while(num!=-1)
{
cout<<"ENTER ELEMENT TO PUSH IN STACK(-1 TO STOP):\t";
cin>>num;
if(top==n-1)
{
cout<<"STACK FULL\n";
break;
}
if(num!=-1)
{
a[++top]=num;
}
}
int choice=0;
do
{
cout<<"CHOOSE THE OPERATION TO PERFORM(PRESS 0 TO EXIT):\n1.PUSH\t2.POP\t3.PEEK\t4.DISPLAY\t5.ISEMPTY\t";
cin>>choice;
switch(choice)
{
case 0:

break;
case 1:
{
push(a,n);
break;
}
case 2:
{
pop(a);
break;
}
case 3:
{
cout<<"TOPMOST ELEMENT IS "<<peek(a,top)<<endl;
break;
}
case 4:
{
display(a,top);
break;
}
case 5:
{
bool ise=isempty(top);
if(ise)
cout<<"EMPTY";
else
cout<<"NOT EMPTY";
break;
}
default:
cout<<"INVALID INPUT";
}
}
while(choice);
return 0;
}