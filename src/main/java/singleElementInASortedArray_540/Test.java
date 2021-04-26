package singleElementInASortedArray_540;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{1, 1, 2, 3, 3, 4, 4, 8, 8};
        System.out.println(solution.singleNonDuplicate(nums));
        nums = new int[]{3, 3, 7, 7, 10, 11, 11};
        System.out.println(solution.singleNonDuplicate(nums));
        nums = new int[]{1, 3, 3, 7, 7, 11, 11};
        System.out.println(solution.singleNonDuplicate(nums));
        nums = new int[]{1, 1, 3, 3, 7, 7, 11, 11, 12};
        System.out.println(solution.singleNonDuplicate(nums));
        nums = new int[]{7, 11, 11};
        System.out.println(solution.singleNonDuplicate(nums));
        nums = new int[]{7, 7, 11};
        System.out.println(solution.singleNonDuplicate(nums));
    }
}
