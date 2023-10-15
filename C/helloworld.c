#include <stdio.h>
int main() {
   int n;
   printf("Enter the number of times to print "hello world");
   scanf("%d",&n);
   for(int i=0;i<n;i++)
      {
   printf("Hello, World!");
      }
   return 0;
}
