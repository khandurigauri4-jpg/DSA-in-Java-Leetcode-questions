class Solution {
    public String reverseWords(String s) {
        String[] ar = s.trim().split("\\s+");
        StringBuilder result = new StringBuilder();
        for(int i= ar.length-1; i>=0; i--)
        {
            result.append(ar[i]);
            if(i!= 0)
            result.append(" ");
        }
        return result.toString();
        
    }
}