class Solution {
    static void solve(String digits, List<String> result, StringBuilder output, int index, String[] mapped){
        //base case
        if(index >= digits.length()){
            result.add(output.toString());
            return;
        }
        int value = digits.charAt(index) - '0';
        String mappedString = mapped[value];
        for(int i=0; i<mappedString.length(); i++){
            output.append(mappedString.charAt(i));
            solve(digits, result, output, index+1, mapped);
            output.deleteCharAt(output.length()-1);
        }
    }
    public List<String> letterCombinations(String digits) {
        String[] mapped = {"", "", "abc", "def","ghi","jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> result = new ArrayList<>();
        StringBuilder output = new StringBuilder();
        int index = 0;
        solve(digits, result, output, index, mapped);
        return result;
    }
}