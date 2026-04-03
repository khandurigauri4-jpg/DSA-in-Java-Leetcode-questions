class Solution {
    public boolean detectCapitalUse(String word) {
        String s = word.toUpperCase();
        if(s.equals(word))
        return true;
        String s1 = word.toLowerCase();
        if(s1.equals(word))
        return true;
        if(Character.isUpperCase(word.charAt(0)) && word.substring(1).toLowerCase().equals(word.substring(1))){
        return true;
        }
        return false;
    }
}