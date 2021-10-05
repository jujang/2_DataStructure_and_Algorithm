#include<iostream>

using namespace std;

int N;
int K;
int coin[10];
int coin_cnt[10];
int total_coin = 0;

void greedy(void) {

    int remain = K;

    for(int i = N; i > 0; i--) {
        if(remain >= coin[i-1]) {
            coin_cnt[i-1] = remain/coin[i-1];
            remain = remain%coin[i-1];
        }
    }

    for(int j = 0; j < N; j++) {
        total_coin+= coin_cnt[j];
    }

}

int main() {

    cin >> N >> K;
    for(int i = 0; i < N; i++) {
        cin >> coin[i];
    }

    greedy();

    cout << total_coin;

    return 0;
}