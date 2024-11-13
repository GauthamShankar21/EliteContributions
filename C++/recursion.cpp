#include <iostream>
using namespace std;

//Find the sum of a number
void find_sum(int n, int sum){
    if(n < 1){
        cout<<sum;
        return ;
    }
    find_sum(n-1, sum + n);
}

int find_sum2(int n){
    
    if(n == 0){
        return 0;
    }
    return n + find_sum2(n-1);
}

//Find the multiplication using recursion
int factorial(int n){
    
    if(n == 1){
        return 1;
    }
    return n + factorial(n-1);
}

int main() {

    // find_sum(3,0);
    // cout<<find_sum2(3);
    cout<<factorial(6);

    return 0;
}