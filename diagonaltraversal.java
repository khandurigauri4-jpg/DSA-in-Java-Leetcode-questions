class Solution {
    public static int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int index = 0;
        int i , j;
        int result[] = new int[m*n];
        for(int d=0; d<m+n-1; d++)
        {
            List<Integer>temp = new ArrayList<>();
            int r = (d<n)? 0:d-n+1;
            int c = (d<n)? d:n-1;
            while(r<m && c>=0)
            {
                temp.add(mat[r][c]);
                r++;
                c--;
            }
            if(d%2 == 0)
            Collections.reverse(temp);
            for(int num : temp)
            result[index++] = num;
    }
    return result;
        
    }
    public static void main(String args[])
    {
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(findDiagonalOrder(mat));
    }
}