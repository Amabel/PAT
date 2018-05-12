#include <iostream>
using namespace std;
int main() {
    string a, b;
    cin >> a >> b;
    for (int i = 0; i < b.length(); i++) {
        for (int j = 0; j < a.length(); j++) {
            if (a[j] == b[i]) {
                a[j] = '-';
                b[i] = '-';
            }
        }
    }
    int count1 = 0, count2 = 0;
    for (int i = 0; i < a.length(); i++) {
        if (a[i] != '-') {
            count1++;
        }
    }
    for (int i = 0; i < b.length(); i++) {
        if (b[i] !='-') {
            count2++;
        }
    }
    if (count2 == 0) {
        cout << "Yes " << count1;
    } else {
        cout << "No " << count2;
    }
    return 0;
}
