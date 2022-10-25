#include <iostream>
#include <vector>
using namespace std;

int fastExp(int x, int n) {

    if (n == 0) {
        return 1;
    }

    int temp = fastExp(x, n / 2);

    if (!(n & 1)) {
        return temp * temp;
    } else {
        return x * temp * temp;
    }
}

int main() {
    cout << fastExp(5, 5) << endl;
}
