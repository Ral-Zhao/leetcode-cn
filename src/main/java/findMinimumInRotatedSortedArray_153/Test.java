package findMinimumInRotatedSortedArray_153;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{3, 4, 5, 1, 2};
        System.out.println(solution.findMin(nums));
        nums = new int[]{4, 5, 6, 7, 0, 1, 2};
        System.out.println(solution.findMin(nums));
        nums = new int[]{11, 13, 15, 17};
        System.out.println(solution.findMin(nums));
        nums = new int[]{11, 13, 15, 17, 10};
        System.out.println(solution.findMin(nums));
    }
}
