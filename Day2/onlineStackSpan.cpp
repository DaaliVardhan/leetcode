#include<iostream>
#include<bits/stdc++.h>
#include<stack>

using namespace std;
    
int main(){
    stack<pair<int,int>> stack;
    int next(int price) {
        int ans = 1;
        while (!stack.empty() && stack.top().first <= price) {
            ans += stack.top().second;
            stack.pop();
        }
        
        stack.push({price, ans});
        return ans;
    }
    return 0;
}
