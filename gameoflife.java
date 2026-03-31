class Solution {
    public void gameOfLife(int[][] board) {
        int m = board.length;
        int n = board[0].length;
        int dr[] = {-1,-1,-1,0,0,1,1,1};
        int dc[] = {-1,0,1,-1,1,-1,0,1};
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                int live = 0;
                for(int k=0; k<8; k++)
                {
                    int ni = i + dr[k];
                    int nj = j + dc[k];
                    if(ni>=0 && nj>=0 && nj<n && ni <m)
                    {
                        if(Math.abs(board[ni][nj]) == 1)
                        live++;
                    }
                }
                if(board[i][j] == 1)
                {
                    if(live<2 || live>3)
                    {
                        board[i][j] = -1;
                    }
                }
                else
                {
                    if(live == 3)
                    board[i][j] = 2;
                }
            }
        }
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(board[i][j] > 0)
                board[i][j] = 1;
                else
                board[i][j] = 0;
            }
        }
        
    }
}