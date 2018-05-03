#include <iostream>
using namespace std;
int main() {
    int num_students, num_stuffs;
    int checked_students = 0, checked_stufffs = 0;
    cin >> num_students >> num_stuffs;
    bool stuff[10000] = {0};
    for (int i = 0; i < num_stuffs; i++) {
        int n;
        cin >> n;
        stuff[n] = 1;
    }
    for (int i = 0; i < num_students; i++) {
        string name;
        bool name_printed = false;
        int n;
        cin >> name >> n;
        for (int j = 0; j < n; j++) {
            int id;
            cin >> id;
            if (stuff[id] == 1) {
                if (!name_printed) {
                    name_printed = true;
                    cout << name << ":";
                }
                printf(" %04d", id);
                checked_stufffs++;
            }
        }
        if (name_printed) {
            checked_students++;
            cout << endl;
        }
    }
    cout << checked_students << " " << checked_stufffs << endl;
    return 0;
}
