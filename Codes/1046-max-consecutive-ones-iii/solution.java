class Solution {
    public int longestOnes(int[] nums, int k) {
        int l=0;
        int n=nums.length;
        int zeroCount=0;
        for(int r=0; r<n; r++){
            if(nums[r]==0){
                zeroCount++;
            }
            if(zeroCount>k){
                if(nums[l]==0){
                    zeroCount--;
                }
                l++;
            }
        }
        return n-l;
    }
}
