#include<stdio.h>

// Function to swap two integers.
void swap(int *xp, int *yp) {
    int temp = *xp;
    *xp = *yp;
    *yp = temp;
}

int main() {
    int a[10], i, j, n, min_idx;

    printf("Enter the number of elements to be sorted (max 10): ");
    scanf("%d", &n);

    printf("Enter the elements to be sorted: ");
    for(i = 0; i < n; i++)
        scanf("%d", &a[i]);

    printf("Original list:\n");
    for(i = 0; i < n; i++)
        printf("%d\t", a[i]);

    // Implementing Selection Sort
    for (i = 0; i < n-1; i++) {
        min_idx = i;
        for (j = i+1; j < n; j++) {
            if (a[j] < a[min_idx])
                min_idx = j;
        }
        swap(&a[min_idx], &a[i]);
    }

    printf("\nSorted list:\n");
    for(i = 0; i < n; i++)
        printf("%d\t", a[i]);

    return 0;
}

