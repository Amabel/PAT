#include <iostream>
using namespace std;
void enc(string s) {
    for (int i = 0; i < s.length(); i++) {
        int count = 1;
        char c = s[i];
        while (c == s[i + 1]) {
            count++;
            i ++;
        }
        if (count > 1) {
            cout << count << c;
        } else if (count == 1) {
            cout << c;
        }
    }
}
void dec(string s) {
    string n = "";
    for (int i = 0; i < s.length(); i++) {
        if ('0' <= s[i] && s[i] <= '9') {
            n += s[i];
        } else {
            int count = 1;
            if (n != "") {
                count = stoi(n);
            }
            for (int j = 0; j < count; j++) {
                cout << s[i];
            }
            n = "";
        }
    }
}
int main() {
    char c;
    string s;
    cin >> c;
    getchar();
    getline(cin, s);
    if (c == 'C') {
        enc(s);
    } else if (c == 'D') {
        dec(s);
    }
    return 0;
}
