#include<iostream>

using namespace std;

int num[25];
char st[25];
int sol = 0;
int n = 0;

void greedy(void) {

 sol += num[0];
 bool flag = false;
 for (int i = 1; i < n; i++) {
  if (st[i] == '-') {
   flag = true;
  }
  if (flag == false) sol += num[i];
  else sol -= num[i];
 }
}

int main(void) {

 while (1) {
  scanf("%d", &num[n++]); //cin >> num[n];
  scanf("%c", &st[n]); //cin >> st[n];
  if (st[n] == '\n') break;
 }
 //순서는 최초의 값이 num[0], 그 후로는 기호와 값이 쌍으로 st[1],num[1]식으로 되어있음 마지막 끝은 n-1이고 st[n-1], num[n-1]로 끝남
 //왜냐면 st[n]이 받은 값이 없기 때문임

 greedy();

 cout << sol;

 return 0;
}