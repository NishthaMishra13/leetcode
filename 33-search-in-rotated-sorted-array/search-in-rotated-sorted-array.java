class Solution {
    public int pivotIndex(int[] nums){
        int n = nums.length;
        int start = 0;
        int end = n-1;
        int ans = -1;
        if(nums[start] < nums[end]){
            return -1;
        }
        while(start<=end){
            int mid = start + (end - start)/2;
            if(nums[mid] > nums[n-1]){
                ans = mid;
                start = mid + 1;
            }
            else{
                //nums[mid] <= nums[n-1]
                end = mid-1;
            }        
        }
        return ans;
    }
    public int binarySearch(int[] nums, int target, int start, int end) {
       int n = nums.length;
       while(start <= end){
            int mid = start + ((end - start) / 2);
            if(nums[mid] == target){
                return mid;
            }
            else if(target > nums[mid]){
                // right
                start = mid + 1;
            }
            else{
                //left
                end = mid - 1;
            }
       }
       return -1; 
    }
    public int search(int[] nums, int target) {
        int pivotIndex = pivotIndex(nums);
        int n = nums.length;
        //pivot nhi h, array ascending order me h, rotated nhi h
        if(pivotIndex == -1){
            int ans = binarySearch(nums, target, 0, n-1);
            return ans;
        }
        else{
            //rotated h
            //L1 me search kro
            int startArr1 = 0;
            int endArr1 = pivotIndex;
            if(target >= nums[startArr1] && target <= nums[endArr1]){
                int ans = binarySearch(nums, target, startArr1, endArr1);
                return ans;
            } 
            
            //L2 me search kro
            int startArr2 = pivotIndex+1;
            int endArr2 = n-1;
            if(target >= nums[startArr2] && target <= nums[endArr2]){
                int ans = binarySearch(nums, target, startArr2, endArr2);
                return ans;
            }

        }
        return -1;
    }
}