#include <stdio.h>

int main ()
{
    int num , sum = 0;
    printf("Enter the value of num");
    scanf("%d", &num);
    // iteratively check for all numbers in range [1, 27]
    for(int i = 1; i < num; i++){
        // check if i is a divisor, if yes then add to sum
        if(num % i == 0)
            sum = sum + i;
    }
    
    if(sum == num)
        printf("%d is a perfect number",num);
    else
        printf("%d is not a perfect number",num);
    

}
