class Solution {
    public String capitalizeTitle(String title) {
        String word = "" , str = "";
        title = title + " ";
        for(int i=0; i<title.length(); i++)
        {
            char ch = title.charAt(i);
            if(ch == ' ')
            {
                if(word.length() == 1 || word.length() == 2){
                word = word.toLowerCase();
                str = str + word + " ";
                }
                else
                {
                    String w = word.substring(1);
                    str = str + Character.toUpperCase(word.charAt(0)) + w.toLowerCase() + " ";
                }
                word = "";
                
            }
            else
            word += ch;
        }
        return str.trim();
        
    }
}