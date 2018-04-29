#include <iostream>
using namespace std;
int main() {
    int n;
    int num1, guess1, num2, guess2;
    int res1 = 0, res2 = 0;
    cin >> n;
    for (int i = 0; i < n; i++) {
        cin >> guess1 >> num1 >> guess2 >> num2;
        int sum = guess1 + guess2;
        if (num1 == sum && num2 != sum) res2 ++;
        if (num1 != sum && num2 == sum) res1 ++;
    }
    cout << res1 << " " << res2 << endl;
    return 0;
}
