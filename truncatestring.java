class Solution {
    public String truncateSentence(String s, int k) {
        s = s.trim();
        String arr[] = s.split(" ");
        String result[] = new String[k];
        for(int i=0; i<k; i++)
        {
          result[i] = arr[i];
        }
        
    
    return String.join(" " , result);
}
}