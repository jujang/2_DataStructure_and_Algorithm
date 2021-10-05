#include<iostream>

using namespace std;

int money;

int changes;


void greedy(void) {

    int remain = 1000 - money;
    int coin_500 = 0;
    int coin_100 = 0;
    int coin_50 = 0;
    int coin_10 = 0;
    int coin_5 = 0;
    int coin_1 = 0;

    while(remain >= 1) {
        if(remain >= 500) {
            coin_500 = remain/500;
            remain = remain%500;
        }
        if(remain >= 100) {
            coin_100 = remain/100;            
            remain = remain%100;
        }
        if(remain >= 50) {
            coin_50 = remain/50;
            remain = remain%50;
        }
        if(remain >= 10) {
            coin_10 = remain/10;
            remain = remain%10;
        }
        if(remain >= 5) {
            coin_5 = remain/5;
            remain = remain%5;
        }
        if(remain >= 1) {
            coin_1 = remain/1;
            remain = remain%1;
        }
    }

    changes = coin_500 + coin_100 + coin_50 + coin_10 + coin_5 + coin_1;
}

int main() {

    cin >> money;

    greedy();

    cout << changes;

    return 0;
}