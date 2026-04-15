class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        HashSet<Character>set = new HashSet<>();
        for(char c : allowed.toCharArray())
        {
            set.add(c);
        }
        for(String word : words)
        {
            boolean valid = true;
            for(char c : word.toCharArray())
            {
                if(!set.contains(c))
                {
                    valid = false;
                    break;
                }
            }
            if(valid)
            count++;
        }
        return count ; 
    }
}