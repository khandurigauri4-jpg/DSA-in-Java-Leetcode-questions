class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        int i=0 , j=0;
        int p1=0 , p2=0;
        while(i<word1.length && j<word2.length)
        {
            if(word1[i].charAt(p1) != word2[j].charAt(p2))
            return false;
            p1++;
            p2++;
            if(p1 == word1[i].length())
            {
                p1 = 0;
                i++;
            }
            if(p2 == word2[j].length())
            {
                p2 = 0;
                j++;
            }
        }
        return i==word1.length && j==word2.length;
        
    }
}