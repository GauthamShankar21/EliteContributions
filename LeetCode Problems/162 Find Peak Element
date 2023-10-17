class Solution {
    public int findPeakElement(int[] nums) {
        int ret = 0;
        if(nums.length==2){
            if(nums[0]>nums[1]){
                return 0;
            }
            else{
                return 1;
            }
        }
        for(int i=1;i<nums.length-1;i++){
            if(nums[i]>nums[i-1] && nums[i]>nums[i+1]){
               ret = i;
               break;
            }
        }
        if(ret==0){
            if(nums[0]>nums[nums.length-1]){
                return 0;
            }
            else{
                return nums.length-1;
            }
        }
        return ret;
    }
}
