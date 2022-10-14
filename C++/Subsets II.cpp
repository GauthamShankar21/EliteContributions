class Solution {
public:
    vector<vector<int>> ans;
    void findSubsets(int i, vector<int>& nums, vector<int>& ds, int n){
        ans.push_back(ds);
        for(int j = i; j<n; j++){
            if(j>i && nums[j]==nums[j-1]) continue;
            ds.push_back(nums[j]);
            findSubsets(j+1,nums,ds,n);
            ds.pop_back();
        }
    }
    vector<vector<int>> subsetsWithDup(vector<int>& nums) {
        vector<int> ds;
        sort(nums.begin(), nums.end());
        int n = nums.size();
        findSubsets(0,nums,ds,n);
        return ans;
    }
};