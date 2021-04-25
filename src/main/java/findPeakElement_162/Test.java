package findPeakElement_162;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{1, 2, 3, 1};
        System.out.println(solution.findPeakElement(nums));
        nums = new int[]{1, 2, 1, 3, 5, 6, 4};
        System.out.println(solution.findPeakElement(nums));
        nums = new int[]{3, 2, 1};
        System.out.println(solution.findPeakElement(nums));
    }
}
