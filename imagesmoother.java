class Solution {
    public static int[][] imageSmoother(int[][] img) {
        
        int r = img.length;
        int c = img[0].length;
        int[][] result = new int[r][c];
        int[] dr = {-1,-1,-1,0,0,1,1,1};
        int[] dc = {-1,0,1,-1,1,-1,0,1};
        for(int i=0; i<r; i++)
        {
            for(int j=0; j<c; j++)
            {
                int sum = img[i][j];
                int count = 1;
                for(int k=0; k<8; k++)
                {
                    int ni = i + dr[k];
                    int nj = j + dc[k];
                    if(ni>=0 && nj>=0 && ni<r && nj<c){
                    sum += img[ni][nj];
                    count++;
                    }
                }
                result[i][j] = sum/count;
                
                
            }
        }
        return result;
    }
}