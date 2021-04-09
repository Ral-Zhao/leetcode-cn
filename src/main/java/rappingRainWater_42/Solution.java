package rappingRainWater_42;

import java.util.Stack;

/**
 * 给定 n 个非负整数表示每个宽度为 1 的柱子的高度图，计算按此排列的柱子，下雨之后能接多少雨水。
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：height = [0,1,0,2,1,0,1,3,2,1,2,1]
 * 输出：6
 * 解释：上面是由数组 [0,1,0,2,1,0,1,3,2,1,2,1] 表示的高度图，在这种情况下，可以接 6 个单位的雨水（蓝色部分表示雨水）。
 * 示例 2：
 * <p>
 * 输入：height = [4,2,0,3,2,5]
 * 输出：9
 *  
 * <p>
 * 提示：
 * <p>
 * n == height.length
 * 0 <= n <= 3 * 104
 * 0 <= height[i] <= 105
 * <p>
 * <p>
 * 链接：https://leetcode-cn.com/problems/trapping-rain-water
 */
public class Solution {
    /*
    使用双指针
     */
    public int trap(int[] height) {
        int sum = 0;
        for (int i = 0; i < height.length; i++) {
            if (i == 0 || i == height.length - 1) {
                continue;
            }
            int lMax = height[i];
            int rMax = height[i];
            for (int j = i + 1; j < height.length; j++) {
                if (height[j] > rMax) {
                    rMax = height[j];
                }
            }
            for (int j = i - 1; j >= 0; j--) {
                if (height[j] > lMax) {
                    lMax = height[j];
                }
            }
            int minHeight = Math.min(lMax, rMax) - height[i];
            if (minHeight > 0) {
                sum += minHeight;
            }
        }
        return sum;
    }

    /*
    使用单调栈
     */
    public int trapUseStack(int[] height) {
        if (height == null || height.length < 3) {
            return 0;
        }
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        int sum = 0;
        for (int i = 1; i < height.length; i++) {
            if (height[i] < height[stack.peek()]) {
                stack.push(i);
            } else if (height[i] == height[stack.peek()]) {
                stack.pop();
                stack.push(i);
            } else {
                while (!stack.isEmpty() && height[i] > height[stack.peek()]) {
                    int cur = stack.pop();
                    if (!stack.isEmpty()) {
                        //只计算减去中间层之上的数量
                        int min = Math.min(height[stack.peek()], height[i]) - height[cur];
                        sum += min * (i - stack.peek() - 1);
                    }
                }
                stack.push(i);
            }
        }
        return sum;
    }

    /*
    利用动态规划
     */
    public int trapUseDP(int[] height) {
        if (height == null || height.length < 3) {
            return 0;
        }
        int[] leftMax = new int[height.length];//左边的最高点
        int[] rightMax = new int[height.length];//右边的最高点
        leftMax[0] = height[0];
        for (int i = 1; i < height.length; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }
        rightMax[height.length - 1] = height[height.length - 1];
        for (int i = height.length - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }
        int sum = 0;
        for (int i = 0; i < height.length; i++) {
            int h = Math.min(leftMax[i], rightMax[i]) - height[i];
            if (h > 0) {
                sum += h;
            }
        }
        return sum;
    }

}
