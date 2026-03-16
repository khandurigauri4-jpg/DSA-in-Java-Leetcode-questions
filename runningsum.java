class Solution {
    public static int[] runningSum(int[] nums) {
        int s = 0 , k = 0;
        int a[] = new int[nums.length];
        for(int i=0; i<nums.length; i++)
        {
            s = 0;
        for(int j = 0 ; j<=i; j++)
            {
                s += nums[j];
            }
            a[k] = s;
            k++;
        }
        return a;

}

public static void main(String args[])
{
    int nums[] = {1 , 2 , 3 , 4};
    System.out.println(runningSum(nums));
}
}