#include<iostream>
#include<vector>
#include<algorithm>
#include<string>

using namespace std;

int num;
int length;
string str[1001];
string sol_1;
int sol_2 = 0;

void greedy(void) {

    for(int i = 0; i < length; i++) {
        vector<pair<int, int>> v;
        v.push_back(make_pair(0,65)); // A의 아스키코드
        v.push_back(make_pair(0,67)); // C의 아스키코드
        v.push_back(make_pair(0,71)); // G의 아스키코드
        v.push_back(make_pair(0,84)); // T의 아스키코드

        for(int j = 1; j <= num; j++) {
            if(str[j][i] == 'A') v[0].first++;
            else if(str[j][i] == 'C') v[1].first++;
            else if(str[j][i] == 'G') v[2].first++;
            else v[3].first++;
        }
        
        sort(v.begin(), v.end());  //오름차순 정렬
        if(v[0].first == v[1].first && v[1].first == v[2].first && v[2].first == v[3].first) sol_1 += char(v[0].second);
        else if(v[1].first == v[2].first && v[2].first == v[3].first) sol_1 += char(v[1].second);
        else if(v[2].first == v[3].first) sol_1 += char(v[2].second);
        else sol_1 += char(v[3].second); //제일 큰 값의 second(아스키코드)값을 문자로 전달
    }
    

    for(int x = 0; x < length; x++) {
        for(int y = 1; y <= num; y++) {
            if(sol_1[x] != str[y][x]) sol_2++;
        }
    }

}


int main(void) {

    cin >> num;
    cin >> length;
    for(int i = 1; i <= num; i++) {
        cin >> str[i];
    }

    greedy();

    cout << sol_1 << endl << sol_2;

}