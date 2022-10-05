#include<stdio.h>
#include<conio.h>
void main()
{
int n,i,j,temp,arr[50];
clrscr();
printf("Enter the number of elements to array\n");
scanf("%d",&n);
printf("Enter %d integers\n",n);
for(i=0;i<n;i++)
{
scanf("%d",&arr[i]);
}
for (i=1;i<=n-1;i++)
{
j=i;
while(j>0 && arr[j-1]>arr[j])
{
temp=arr[j];
arr[j]=arr[j-1];
arr[j-1]=temp;
j--;
}
}
printf("sorted list in accending order:\n");
for(i=0;i<=n-1;i++)
{
printf("%d\t",arr[i]);
}
getch();
}
