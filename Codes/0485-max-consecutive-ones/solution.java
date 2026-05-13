class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n=nums.length;
        int maxCount=0;
        int currentCount=0;
        for(int i=0; i<n; i++){
            if(nums[i]==1){
                currentCount++;
            }
            else{
                maxCount=Math.max(maxCount, currentCount);
                currentCount=0;
            }
        }
        return Math.max(maxCount, currentCount); // when loop gets end our else statement dont trigger and maxCount dont update his value in return we check our last updated values in currentCount maxCount.
    }
}
