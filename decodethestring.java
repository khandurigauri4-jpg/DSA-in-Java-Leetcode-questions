class Solution {
        public String decodeString(String s)
{
    Stack<Integer> countStack = new Stack<>();
    Stack<String> stringStack = new Stack<>();

    String current = "";
    int k = 0;

    for(char c : s.toCharArray())
    {
        if(Character.isDigit(c))
        {
            k = k * 10 + (c - '0');
        }
        else if(c == '[')
        {
            countStack.push(k);
            stringStack.push(current);

            k = 0;
            current = "";
        }
        else if(c == ']')
        {
            int repeat = countStack.pop();
            String prev = stringStack.pop();

            StringBuilder temp = new StringBuilder(prev);

            for(int i = 0; i < repeat; i++)
            {
                temp.append(current);
            }

            current = temp.toString();
        }
        else
        {
            current += c;
        }
    }

    return current;
}
        
    }
