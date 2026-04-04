class Solution {
    public String toLowerCase(String s) {
        String s1 = "";
        for(int i=0; i<s.length(); i++)
        {
            char c = s.charAt(i);
            if(Character.isUpperCase(c))
            s1 = s1 + Character.toLowerCase(c);
            else
            s1 = s1 + c;
        }
        return s1;
        
    }
}