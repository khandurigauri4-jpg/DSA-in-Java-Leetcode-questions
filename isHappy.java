class Solution {
    public static boolean isHappy(int n) {
        HashSet<Integer>set = new HashSet<>();
        while(n!=1 && !set.contains(n))
        {
            set.add(n);
            int s = 0;
            while(n>0)
            {
                int rem = n%10;
                s += rem * rem;
                n /= 10;
            }
            n = s;
        }
        return n == 1;
    }
public static void main(String args[])
{
    System.out.println(isHappy(19));
}

}