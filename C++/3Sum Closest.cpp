class Solution {
public:
    int threeSumClosest(vector<int>& nums, int target) {
        // First apply sorting 
        sort(nums.begin(), nums.end());
        
        // Initial sum - assume that the closest sum will be the sum of first three elem.
        int sum = nums[0] + nums[1] + nums[2];
        
        for(int i = 0; i<nums.size()-2; i++){
            int j = i + 1;
            int k = nums.size() - 1;
            
            while(j<k){
                int tempSum = nums[i] + nums[j] + nums[k];
                if(abs(tempSum - target) < abs(sum - target))
                    sum = tempSum;
                if(tempSum<target){
                    j++;
                }else if(tempSum>target){
                    k--;
                }else return target;
            }
        }
        return sum;
    }
};