class Solution {
    public String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();
        int i = s.length()-1;

        while(i >= 0){
            //remove trailing spaces
            while(i >= 0 && s.charAt(i) == ' '){
                i--;
            }
            //chack value of i if it is valid or not
            if(i < 0){
                break;
            }
            int j = i;
            while(j >= 0 && s.charAt(j) != ' '){
                j--;
            }
            //jb j space wale char pr ayega ruk jayega, word ko ans me store kr lo
            ans.append(s.substring(j+1, i+1));
            //remove extra spaces
            while(j >= 0 && s.charAt(j) == ' '){
                j--;
            }
            //agar j valid h mtlb abhi words h aur space append kr do
            if(j >= 0){
                ans.append(' ');
            }
            //replce i 
            i = j;
        }
        return ans.toString();
    }
}