#include <iostream>
#include <set>
using namespace std;
int main() {
    int m, n, s;
    set<string> nameSet;
    bool won = false;
    cin >> m >> n >> s;
    for (int i = 1; i < m + 1; i++) {
        string str;
        cin >> str;
        if (nameSet.count(str) != 0) {
            s = s + 1;
        } else if (i == s && nameSet.count(str) == 0) {
            nameSet.insert(str);
            won = true;
            s += n;
            cout << str << endl;
        }
    }
    if (!won) {
        cout << "Keep going...";
    }
    return 0;
}
