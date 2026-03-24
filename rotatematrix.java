class Solution {
    public static void rotate(int[][] matrix) {
        int temp;
        int r = matrix.length;
        int c = matrix[0].length;
        for(int i=0; i<r; i++)
        {
            for(int j=i; j<c; j++)
            {
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int i=0; i<r; i++)
        {
            int left = 0;
            int right = r-1;
            while(left<right)
        {
            int temp1 = matrix[i][left];
            matrix[i][left] = matrix[i][right];
            matrix[i][right] = temp1;
            left++;
            right--;
        }
        }
    }
    public static void main(String args[])
    {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        rotate(matrix);
    }
}
    