class Solution {
    public static int sumOfGoodNumbers(int[] nums, int k) {
        int sum = 0;
        int n = nums.length;
        for(int i=0; i<n; i++){
            boolean isGood = true;
            if(i-k >= 0)
            {
                if(nums[i] <= nums[i-k])
                {
                    isGood = false;
                }
            }
            if( isGood && i+k < n)
            {
                if(nums[i] <= nums[i+k])
                {
                    isGood = false;
                }
            }
            if(isGood){
            sum = sum + nums[i];
            }
        }
        return sum;
    }
    
 
 public static void main(String args[]){
    int nums[] = {1 , 3 , 2 , 1 , 5 , 4};
    int k = 2;
    System.out.println("sum of good numbers = " + sumOfGoodNumbers(nums , k));
}
}