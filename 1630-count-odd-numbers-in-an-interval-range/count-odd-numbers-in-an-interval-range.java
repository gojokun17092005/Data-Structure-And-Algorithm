class Solution {
    public int countOdds(int low, int high) {
        int total = high - low + 1;
        if (low % 2 == 0 && high % 2 == 0) {
            return total / 2;
        } else {
            return (total / 2) + (low % 2 == 1 && high % 2 == 1 ? 1 : 0);
        }
    }
}