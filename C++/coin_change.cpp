#include <iostream>
#include <vector>
using namespace std;
int memo[12][10000 + 1];

int coinChangeRecursiveDP(int c_index, int amount, vector<int> &coins) {
    if (amount == 0) {
        return 0;
    }
    if (c_index == 0) {
        if (amount % coins[0] == 0) {
            return amount / coins[0];
        } else {
            return 214748364;
        }
    }
    if (memo[c_index][amount] != -1) {
        return memo[c_index][amount];
    }

    int picked = 214748364;
    int notPicked = coinChangeRecursiveDP(c_index - 1, amount, coins);

    if (coins[c_index] <= amount) {
        picked = 1 + coinChangeRecursiveDP(c_index, amount - coins[c_index], coins);
    }
    int value = min(picked, notPicked);
    // memoization
    memo[c_index][amount] = value;
    return value;
}
int coinChange(vector<int> &coins, int amount) {
    for (int i = 0; i < 12; i++) {
        for (int j = 0; j < amount + 1; j++) {
            memo[i][j] = -1;
        }
    }
    int n = coins.size();
    int value = coinChangeRecursiveDP(n, amount, coins);
    return value != 214748364 ? value : -1;
}

int main(int argc, char const *argv[]) {
    vector<int> coins = {1, 2, 5};
    cout << coinChange(coins, 11);
    return 0;
}
