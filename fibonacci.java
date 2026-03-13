class Solution {
    public static int fib(int n) {
        if(n==0)
        return 0;
        if(n==1)
        return 1;
        else
        return(fib(n-1) + fib(n-2));
        
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("enter a number\n");
        num = sc.nextInt();
        System.out.println("fibonacci series is ");
        for(int i=0; i<=num; i++)
        {
            System.out.println(fib(i) + "\t");
        }
    }
}