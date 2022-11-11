
class Main{
    static int removeDuplicates(int[] nums){
        int low=0;
        for(int right=0;right<nums.length;right++){
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
    public static void main(String args[]){
        int[] nums=new int[]{0,0,1,1,1,2,2,3,3,4};
        int ans=removeDuplicates(nums);
        for(int i=0;i<ans;i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();

    }
}