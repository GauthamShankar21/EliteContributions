#include<stdio.h>
#include<conio.h>
void main()
{
int a[10],i,j,n,small,loc;
clrscr();
printf("Enter the Number of Elements to be sorted: ");
scanf("%d",&n);
printf("Enter the elements to be sorted: ");
for(i=0;i<n;i++)
scanf("%d",&a[i]);
printf("Original list:\n");
for(i=0;i<n;i++)
printf("%d\t",a[i]);
for(i=0;i<n;i++)
{
small=a[i];
loc=i;
for(j=i+1;j<n;j++)
{
if(a[j]<small)
{
small=a[j];
loc=j;
}
}
a[loc]=a[i];
a[i]=small;
}
printf("\nSorted list: \n");
for(i=0;i<n;i++)
printf("%d\t",a[i]);
getch();
}
