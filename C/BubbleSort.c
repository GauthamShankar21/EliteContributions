// Bubble Sort
#include <stdio.h>

int main()
{
    int size;
    printf("Enter the size of the array: ");

    // Validate input for size
    if (scanf("%d", &size) != 1 || size <= 0) {
        printf("Invalid input. Please enter a positive integer for the size of the array.\n");
        return 1; // Exit the program with an error code
    }
    
    int arr[size];
    input(arr,size);
    sortArray(arr,size);
    display(arr,size);
}

void input(int b[],int N)
{
    printf("Enter values of %d array: ",N);
    for(int i = 0;i < N; i++)
    {
        scanf("%d",&b[i]);
    }
}

void display(int b[],int N)
{
    printf("Enter values of array are: ");
    for(int i = 0; i < N; i++)
    {
        printf("%d ",b[i]);
    }
    printf("\n");
}

void sortArray(int b[],int N)
{
    int temp;
    for(int i = 0; i < N; i++)
    {
        for(int j = 0; j < N-i; j++)
        {
            if(b[j] > b[j+1])
            {
                temp = b[j+1];
                b[j+1] = b[j];
                b[j] = temp;
            }
        }
    }
}
