class Solution {
    public int trap(int[] height) {
        int[] peaks = new int [height.length];
        int max = 0;
        int maxIndex = 0;
        for(int i = 0;i<height.length;i++){
            if(height[i]>max){
                max = height[i];
                maxIndex = i;
            }
            peaks[i]=max;
        }
        max = 0;
        for(int i = height.length-1;i>=maxIndex;i--){
            if(height[i]>max){
                max=height[i];
            }
            peaks[i]=max;
        }
        max = 0;
        for(int i = 0;i<height.length;i++){
            max+=(peaks[i]-height[i]);
        }
        return max;
    }
}