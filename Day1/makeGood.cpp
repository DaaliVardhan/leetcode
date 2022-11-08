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

string makegoodap2(string s){
    int left=0;
    for(int right=0;right<s.size();right++){
        if(left>0 and abs(s[right]-s[left-1])==32)
            left--;
        else{
            s[left]=s[right];
            left++;
        }
    }
    
    return s.substr(0,left);
}

int main(){
    string s="LeEetcode";
    string ans1=makegoodap1(s);
    string ans2=makegoodap2(s);
    cout<<ans1<<" "<<ans2;
    return 0;
}