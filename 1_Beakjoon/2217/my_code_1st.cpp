#include<iostream>
#include<vector>
#include<algorithm>

using namespace std;

int N;
vector<int>rope;
vector<int>max_weight;
int max_k;

void greedy(void) {

    sort(rope.begin(), rope.end());

    for(int i = 0; i < N; i++) {
        int a = N-i;
        max_weight.push_back(a*rope.at(i));
    }

    sort(max_weight.begin(), max_weight.end());

    max_k = max_weight.at(N-1);

}

int main() {

    cin >> N;
    for(int i = 0; i < N; i++) {
        int a;
        cin >> a;
        rope.push_back(a);
    }

    greedy();

    cout << max_k;

    return 0;
}