#include<iostream>
#include<bits/stdc++.h>
#include<string>

using namespace std;
string removeDuplicate(string s){
    list<char> stack;
    for(char& a:s){
        if(!stack.empty() && stack.back() ==a)
            stack.pop_back();
        else
            stack.push_back(a);
    }
    string ans;
    for(auto &a:stack){
        ans+=a;
    }
    return ans;
}
string removeDuplicate_(string s){
    int left=0;
    for(int right=0;right<s.size();right++){        
        if(left!=0 && s[left-1]==s[right])
            left--;
        else{
            s[left]=s[right];
            left++;
        }
    }
    return s.substr(0,left);
}


int main(){
    string s="azxxzyb";
    cout<<removeDuplicate(s)<<endl;
    cout<<removeDuplicate_(s);
    return 0;
}