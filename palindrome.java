class Solution {
    public static boolean isPalindrome(int x) {
        int rev = 0;
        int temp = x;
        while(temp>0)
        {
            int rem = temp%10;
            rev = (rev*10) + rem;
            temp = temp/10;
        }
        if(rev == x)
        return true;
        else
        return false;
        
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("enter a number");
        n = sc.nextInt();
        System.out.println("result = " + isPalindrome(n));
    }
}