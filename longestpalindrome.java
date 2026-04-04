class Solution {
    public int longestPalindrome(String s) {
        int[] count = new int[128];
        for(char c : s.toCharArray())
        count[c]++;
        int len = 0;
        boolean hasOdd = false;
        for(int f : count)
        {
            if(f%2 == 0)
            len += f;
            else
            {
                len += f-1;
                hasOdd = true;
            }
        }
        if(hasOdd)
        len += 1;
        return len;
        
    }
}