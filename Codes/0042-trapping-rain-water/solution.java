class Solution {
    public int trap(int[] height) {
        int l=0;
        int r=height.length-1;
        int lmax=0;
        int rmax=0;
        int water=0;
        while(l<r){
            lmax=Math.max(height[l],lmax);
            rmax=Math.max(height[r],rmax);
            if(lmax<rmax){
                water+=lmax-height[l];
                l++;
            }
            else{
                water+=rmax-height[r];
                r--;
            }
        }
        return water;
    }
}
