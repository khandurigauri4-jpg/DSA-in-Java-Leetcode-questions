class Solution {
    public String frequencySort(String s) {
        HashMap<Character , Integer>map = new HashMap<>();
        for(char c : s.toCharArray())
        map.put(c , map.getOrDefault(c , 0)+1);
        StringBuilder res = new StringBuilder();
        while(!map.isEmpty())
        {
            char maxchar = ' ';
            int maxfreq = 0;
            for(char c : map.keySet())
            {
                if(map.get(c) > maxfreq)
                {
                    maxfreq = map.get(c);
                    maxchar = c;
                }
            }
            for(int i=0; i<maxfreq; i++)
            {
                res.append(maxchar);
            }
            map.remove(maxchar);
            
            
        }
        return res.toString();
        
    }
}