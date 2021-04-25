package findTheDuplicateNumber_287;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{1, 3, 4, 2, 2};
        System.out.println(solution.findDuplicate(nums));
        nums = new int[]{3, 1, 3, 4, 2};
        System.out.println(solution.findDuplicate(nums));
        nums = new int[]{1, 1};
        System.out.println(solution.findDuplicate(nums));
        nums = new int[]{1, 1, 2};
        System.out.println(solution.findDuplicate(nums));
        nums = new int[]{2, 2, 2};
        System.out.println(solution.findDuplicate(nums));
    }
}
