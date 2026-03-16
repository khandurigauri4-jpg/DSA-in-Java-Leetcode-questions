class Solution {
    public static int[] twoSum(int[] nums, int target) {
        int currentSum = 0;
        int a[] = new int[50];
        int k = 0;
for(int i=0; i<nums.length; i++)
{
currentSum = 0;
for(int j = i+1; j<nums.length; j++)
{
    currentSum = nums[i] + nums[j];
    if(currentSum == target)
    return new int[] {i , j};
}
   }
   return new int[] {};
    }
    public static void main(String args[])
    {
        int array[] = {2 , 7 , 11 , 15};
         int t = 9;
         System.out.println(twoSum(array , t));
    }
}