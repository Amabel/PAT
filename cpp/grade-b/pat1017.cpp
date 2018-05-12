#include <iostream>
using namespace std;
int main() {
    string s;
    int d;
    cin >> s >> d;
    int len = s.length();
    int t = s[0] - '0';
    t = t / d;
    if ((t != 0 && len > 1) || len == 1) {
        cout << t;
    }
    int rem = (s[0] - '0') % d;
    for (int i = 1; i < len; i++) {
        t = (rem * 10 + s[i] - '0') / d;
        cout << t;
        rem = (rem * 10 + s[i] - '0') % d;
    }
    cout << " " << rem;
    return 0;
}
