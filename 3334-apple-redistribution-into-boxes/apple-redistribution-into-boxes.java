class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int totalApples = 0;
        for (int a : apple) {
            totalApples += a;
        }
        Arrays.sort(capacity);
        
        int usedCapacity = 0;
        int boxCount = 0;
        for (int i = capacity.length - 1; i >= 0; i--) {
            usedCapacity += capacity[i];
            boxCount++;

            if (usedCapacity >= totalApples) {
                return boxCount;
            }
        }

        return boxCount;
    }
}