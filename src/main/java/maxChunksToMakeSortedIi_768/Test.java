package maxChunksToMakeSortedIi_768;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{1, 2, 1, 3, 4, 4};
        System.out.println(solution.maxChunksToSorted(nums));
        nums = new int[]{2,1,3,4,4};
        System.out.println(solution.maxChunksToSorted(nums));
        nums = new int[]{5,4,3,2,1};
        System.out.println(solution.maxChunksToSorted(nums));
    }
}
