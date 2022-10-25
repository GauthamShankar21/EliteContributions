class Solution {
public:
    int largestSumAfterKNegations(vector<int>& nums, int k) {
         int i=0;
    while(i<k)
    {
        sort(nums.begin(),nums.end());
        if(nums[0]==0)  
            goto ab;
        else
            nums[0]=-nums[0];
        i++;
    }
    ab:
    int sum=0;
    for(i=0;i<nums.size();i++)
        sum=sum+nums[i];
    return sum;
    }
};