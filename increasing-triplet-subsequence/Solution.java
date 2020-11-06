class Solution {
    public boolean increasingTriplet(int[] nums) {
        if(nums.length<3){
            return false;
        }
        int minValue=nums[0];
        int count=1;
        for(int i=1;i<nums.length;i++){
            if(minValue<nums[i]){
                count++;
                minValue=nums[i];
            }

        }
        if(count>2){
            return true;
        }
        count=1;
        int maxValue=nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--){
            if(maxValue>nums[i]){
                count++;
                maxValue=nums[i];
            }

        }
        if(count>2){
            return true;
        }
        return false;
    }
}