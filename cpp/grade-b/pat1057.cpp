#include <iostream>
#include <cctype>
using namespace std;
int main() {
    string line;
    getline(cin, line);
    int sum = 0;
    for (int i = 0; i < line.length(); i++) {
        if (isalpha(line[i])) {
            line[i] = tolower(line[i]);
            sum += line[i] - 'a' + 1;
        }
    }
    int count0 = 0, count1 = 0;
    while (sum > 0) {
        if (sum % 2 == 0) {
            count0++;
        } else {
            count1++;
        }
        sum = sum / 2;
    }
    cout << count0 << " " << count1 << endl;
    return 0;
}
