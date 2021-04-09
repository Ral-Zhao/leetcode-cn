package rappingRainWater_42;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] height = new int[]{0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(solution.trapUseDP(height));
        height = new int[]{4,2,0,3,2,5};
        System.out.println(solution.trapUseDP(height));
    }
}
