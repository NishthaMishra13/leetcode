class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rowLen = matrix.length;
        int colLen = matrix[0].length;

        int row = 0;
        int col = colLen-1;

        while(row < rowLen && col >= 0){
            if(matrix[row][col] == target){
                return true;
            }
            else if(matrix[row][col] > target){
                col--;
            }
            else{
                //matrix[row][col] < target
                row++;
            }
        }
        return false;
    }
}