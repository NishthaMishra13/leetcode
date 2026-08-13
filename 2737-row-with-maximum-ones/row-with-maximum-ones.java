class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int maxOne = 0;
        int maxOneRow = 0;
        int totalRow = mat.length;  //row length
        int totalCol = mat[0].length;   //col length
       //loop for row
       for(int row=0; row<totalRow; row++){
        int oneCount = 0;
        //loop for col
        for(int col=0; col<totalCol; col++){
            if(mat[row][col] == 1){
                oneCount++;
            }
        }
        if(oneCount > maxOne){
            maxOne = oneCount;
            maxOneRow = row;
        }
       }
       int[] result = {maxOneRow, maxOne};
       return result;
    }   
}