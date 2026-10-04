class Solution {
    static void solve(int[] candidates, int target, int index, List<List<Integer>> ans,List<Integer> output){
        if(index >= candidates.length){
            return;
        }
        if(target == 0){
            ans.add(new ArrayList(output));
            return;
        }
        if(target < 0){
            return;
        }
        int curVal = candidates[index];
        output.add(curVal);
        //include ans
        solve(candidates, target-curVal, index, ans, output);
        //backtrack
        output.remove(output.size()-1);
        //exclude ans
        solve(candidates, target, index+1, ans, output);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        int index = 0;
        solve(candidates, target, index, ans, output);
        return ans;
    }
}