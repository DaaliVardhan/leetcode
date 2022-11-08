#include<iostream>
#include<string>
#include<bits/stdc++.h>
#include<math.h>

using namespace std;

string makegoodap1(string s){
    vector<char> stack;
    for(char& ch:s){
        if(!stack.empty() && abs(stack.back()-ch)==32)
            stack.pop_back();
        else
            stack.push_back(ch);
    }
    string ans(stack.begin(),stack.end());
    return ans;
}

int main(){

    return 0;
}