class Solution {
    public static String firstPalindrome(String[] words) {
        String rev = "";
        for(int i=0; i<words.length; i++)
        {
            rev = "";
            int l = words[i].length();
            for(int j = l-1; j>=0; j--)
            {
                rev += words[i].charAt(j);
            }
            if(words[i].equals(rev))
            {
                return words[i];
            }
        }
        return "" ;
    }
    public static void main(String args[])
    {
        String s[] = { "abc" , "car" ,"ada" , "racecar", "cool" };
        System.out.println(firstPalindrome(s));
    }
}