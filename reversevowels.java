class Solution {
    public String reverseVowels(String s) {
        
        char[] ar = s.toCharArray();
        int left = 0;
        int right = ar.length-1;
        while(left<right)
        {
            while(left<right && !isVowel(ar[left]))
            left++;
            while(left<right && !isVowel(ar[right]))
            right--;
            char temp = ar[left];
            ar[left] = ar[right];
            ar[right] = temp;
            left++;
            right--;
        }
        return new String(ar);
    }
    private boolean isVowel(char c)
    {
        c = Character.toLowerCase(c);
        return(c=='a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
    }
}