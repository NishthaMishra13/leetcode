class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        int s = 0;
        int e = n - 1;

        while(s <= e){
            int mid = s + (e - s)/2;
            //for single element
            if(s == e){
                return nums[s];
            }
            //for multiple elements
            int currVal = nums[mid];
            int prevVal = -1;
            if(mid-1 >= 0){
                prevVal = nums[mid-1];
            }
            int nextVal = -1;
            if(mid+1 < n){
                nextVal = nums[mid+1];
            }
            if(currVal != prevVal && currVal != nextVal){
                return currVal;
            }
            if(currVal == prevVal && currVal != nextVal){
                int startIndex = mid-1;
                if((startIndex & 1) == 1){
                    //odd
                    e = mid-1;
                }
                else{
                    s = mid+1;
                }
            }
            if(currVal != prevVal && currVal == nextVal){
                int startIndex = mid;
                if((startIndex & 1) == 1){
                    //odd
                    e = mid-1;
                }
                else{
                    s = mid+1;
                }
            }
        }
        return -1;
    }
}