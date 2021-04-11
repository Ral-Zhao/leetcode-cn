package maxConsecutiveOnes_485;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{1,1,1,0,1,1,0,1,1};
        System.out.println(solution.findMaxConsecutiveOnes(nums));
        nums = new int[]{0,0,1};
        System.out.println(solution.findMaxConsecutiveOnes(nums));
        nums = new int[]{0,0,0};
        System.out.println(solution.findMaxConsecutiveOnes(nums));
    }
}
