#include <iostream>
using namespace std;
int main() {
    int scores[100000] = {0};
    int n, max_score = 0, max_index;
    cin >> n;
    for (int i = 0; i < n; i ++) {
        int index, score;
        cin >> index >> score;
        scores[index] += score;
        if (scores[index] > max_score) {
            max_score = scores[index];
            max_index = index;
        }
    }
    cout << max_index << " " << max_score << endl;
    return 0;
}
