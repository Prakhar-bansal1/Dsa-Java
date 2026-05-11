class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int maxarea=0;
        while(left<=right){
            int h=Math.min(height[left],height[right]); // store minimum height
            int w=right-left; // width
            int area=h*w; // area that stores water
            maxarea=Math.max(area,maxarea);
            if(height[left]<=height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxarea;
    }
}
