class Solution {
    public static int lengthOfLastWord(String s) {
        s = s.trim();
        String a[] = s.split(" ");
        int l = a.length;
        String word = a[l-1];
        int len = word.length();
        return len;
}
    public static void main(String args[])
    {
        String str = "Hello World";
         System.out.println(lengthOfLastWord(str));
    }
}