class Solution {
    public int countAsterisks(String s) {
        int count =0;
        boolean insidePipe = false;
        for(char c : s.toCharArray())
        {
            if(c == '|')
            {
                insidePipe = !insidePipe;
            }
            else if(c == '*' && !insidePipe)
            {
                count++;
            }
        }
        return count;
    }
}