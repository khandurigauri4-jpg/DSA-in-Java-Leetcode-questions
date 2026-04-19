

class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // Count frequencies
        for (int card : deck) {
            map.put(card, map.getOrDefault(card, 0) + 1);
        }
        
        // Find GCD of all counts
        int gcdValue = 0;
        for (int count : map.values()) {
            gcdValue = gcd(gcdValue, count);
        }
        
        return gcdValue >= 2;
    }
    
    // GCD function
    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

        
    
}