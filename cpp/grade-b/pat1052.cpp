#include <iostream>
#include <vector>
using namespace std;
int main() {
    vector<vector<string>> v;
    for (int i = 0; i < 3; i++) {
        string s;
        getline(cin, s);
        vector<string> emojis;
        int j = 0, k = 0;
        while (j < s.length()) {
            if (s[j] == '[') {
                while (k++ < s.length()) {
                    if (s[k] == ']') {
                        emojis.push_back(s.substr(j + 1, k - j - 1));
                        break;
                    }
                }
            }
            j++;
        }
        v.push_back(emojis);
    }
    int n;

    cin >> n;
    for (int i = 0; i < n; i++) {
        int a, b, c, d, e;
        cin >> a >> b >> c >> d >> e;
        if (a <= v[0].size() && b <= v[1].size() && c <= v[2].size() && d <= v[1].size() && e <= v[0].size()
            && a > 0 && b > 0 && c > 0 && d > 0 && e > 0) {
                cout << v[0][a-1] << "(" << v[1][b-1] << v[2][c-1] << v[1][d-1] << ")" << v[0][e-1] << endl;
        } else {

            cout << "Are you kidding me? @\\/@" << endl;
        }
    }

    return 0;
}
