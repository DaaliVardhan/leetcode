

#include<iostream>
#include<vector>

using namespace std; 

int removeDuplicates(vector<int>& nums){
    int low=0;
    for(int right=0;right<nums.size();right++){
        if(low!=0 && nums[low-1]==nums[right]){
            continue;
        }
        else{
            nums[low]=nums[right];
            low++;
        }
        
    }
    return low;
}

int main(){

    vector<int> nums={0,0,1,1,1,2,2,3,3,4};
    int ans=removeDuplicates(nums);
    for(int i=0;i<ans;i++){
        cout<<nums[i]<<" ";
    }
    cout<<endl;
    return 0;
}