#include <iostream>
using namespace std;
int main() {
    int n, t;
    cin >> n;
    int res[n] = {0};
    for (int i = 1; i < n + 1; i++) {
        cin >> t;
        res[abs(t - i)]++;
    }
    for (int i = n - 1 ; i >= 0 ; i--) {
        if (res[i] > 1) {
            cout << i << " " << res[i] << endl;
        }
    }
    return 0;
}
