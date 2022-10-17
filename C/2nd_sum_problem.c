// Print summation of all odd numbers up to n

#include <stdio.h>
int main(void)
{
int n, sum = 0;
printf("Please enter a number:");
scanf("%i", &n);
for(int i=1; i<=n; i++)
{
if(i%2==1)
sum += i;
}
printf("Sum: %i", sum);
return 0;
}
