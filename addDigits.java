class Solution {
    public static int addDigits(int num) {
        if(num>=0 && num<=9)
        return num;
        int sum = 0;
            while(num>=10)
            {
             sum = 0;
             while(num>0){
             sum = sum + (num%10);
             num = num/10;
            }
            num = sum;
            }
            return sum;

        }
        public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter a number");
            int n = sc.nextInt();
            System.out.println("sum of digits = " + addDigits(n));
        }
}