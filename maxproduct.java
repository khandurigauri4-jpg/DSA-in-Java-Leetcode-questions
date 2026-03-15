class Solution {
    public static int maxProduct(int n) {
        int max = 0 , prod;
        int i = 0;
        int a[] = new int[50];
        while(n>0)
        {
            a[i] = n%10;
            n = n/10;
            i++;
        }
          for(i=0; i<a.length; i++)
          {
         for(int j =i+1; j<a.length; j++)
         {
           prod = a[i] * a[j];
           if(max<prod)
           max = prod;
         }
          }
          return max;
        
    }
    public static void main(String args[])
    {
        int num = 31;
        System.out.println(maxProduct(num));
    }
}