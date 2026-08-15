class Solution {
    public String removeDuplicates(String s) {
        StringBuilder ans = new StringBuilder();

        for(int i=0; i<s.length(); i++){
            //current char -> ch
            char ch = s.charAt(i);
            //rightmost char is = to current char
            if(ans.length() > 0 && ans.charAt(ans.length()-1) == ch){
                ans.deleteCharAt(ans.length()-1);
            }
            else{
                //rightmost char is != to current char
                ans.append(ch);
            }
        }
        return ans.toString();
    }
}