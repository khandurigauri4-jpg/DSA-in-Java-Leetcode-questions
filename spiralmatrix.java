class Solution {
    public static int[][] generateMatrix(int n) {
        int top = 0 , bottom = n-1;
        int[][] matrix = new int[n][n];
        int left = 0 , right = n-1;
        int i , j;
        int num = 1;
        while(top<=bottom && left<=right)
        {
            for(j=left; j<=right; j++ )
            matrix[top][j] = num++;
            top++;
            for(i=top; i<=bottom ; i++)
            matrix[i][right] = num++;
            right--;
            for(j=right; j>=left; j--)
            matrix[bottom][j] = num++;
            bottom--;
            for(i=bottom; i>=top; i--)
            matrix[i][left] = num++;
            left++;
            
            
        }
        return matrix;

        
    }
    public static void main(String args[])
    {
        System.out.println(generateMatrix(3));
    }
}