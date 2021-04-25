package searchInRotatedSortedArray_33;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{4, 5, 6, 7, 0, 1, 2};
        System.out.println(solution.search(nums, 0));
        nums = new int[]{4, 5, 6, 7, 0, 1, 2};
        System.out.println(solution.search(nums, 3));
        nums = new int[]{4, 5, 6, 7, 0, 1, 2};
        System.out.println(solution.search(nums, 2));
        nums = new int[]{4, 5, 6, 7, 0, 1, 2};
        System.out.println(solution.search(nums, 4));
        nums = new int[]{2};
        System.out.println(solution.search(nums, 3));
    }
}
