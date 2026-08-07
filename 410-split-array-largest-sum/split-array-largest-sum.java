class Solution {
    public boolean isValid(int[] nums, int splits, int mid){
        int splitCount = 1;
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            if(sum + nums[i] <= mid){
                sum += nums[i];
            }
            else{
                splitCount++;
                if(splitCount > splits || nums[i] > mid){
                    return false;
                }
                else{
                    sum = 0;
                    sum += nums[i];
                }
            }
        } 
        return true;
    }
    public int splitArray(int[] nums, int k) {
        //nums -> array
        // k -> no of splits
        int s = 1;
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
        }
        int e = sum;
        int ans = 0;
        while(s <= e){
            int mid = s+(e-s)/2;
            if(isValid(nums, k, mid)){
                ans = mid;
                e = mid-1;
            }
            else{
                s = mid+1;
            }
        }
        return ans;
    }
}