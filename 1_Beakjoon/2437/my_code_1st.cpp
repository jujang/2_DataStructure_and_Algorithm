#include<iostream>
#include<algorithm>
#include<vector>

using namespace std;


int num;
int w[1001];
vector<int>v;
int sol;

void greedy(void) {

    sort(v.begin(), v.end());

    int a = 1;
    while(1){
        //if()
    }
}


int main(void) {

    cin >> num;
    for(int i = 1; i <= num; i++) {
        int a;
        scanf("%d", &a);
        v.push_back(a);
    }

    greedy();

    cout << sol;

    return 0;
}