class Solution {
    public int maxEqualRowsAfterFlips(int[][] matrix) {
        
        
    HashMap<String, Integer> map = new HashMap<>();
    int max = 0;

    for(int[] row : matrix)
    {
        StringBuilder key = new StringBuilder();

    
        if(row[0] == 1)
        {
            for(int num : row)
            {
                key.append(1 - num); 
            }
        }
        else
        {
            for(int num : row)
            {
                key.append(num);
            }
        }

        String pattern = key.toString();

        map.put(pattern, map.getOrDefault(pattern, 0) + 1);

        max = Math.max(max, map.get(pattern));
    }

    return max;
}
    }
