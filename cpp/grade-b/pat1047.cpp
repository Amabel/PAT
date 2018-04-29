#include <iostream>
using namespace std;
int main() {
    int n, teamNum, maxScore = 0;
    int team[1001] = {0};
    cin >> n;

    for (int i = 0; i < n; i++) {
        int score;
        scanf("%d-%*d %d", &teamNum, &score);
        team[teamNum] += score;
    }

    for (int i = 0; i < 1001; i++) {
        if (team[i] > maxScore) {
            maxScore = team[i];
            teamNum = i;
        }
    }
    cout << teamNum << " " << maxScore << endl;
    return 0;
}
