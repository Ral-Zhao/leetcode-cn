package peakIndexInAMountainArray_852;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = new int[]{0, 1, 0};
        System.out.println(solution.peakIndexInMountainArray(arr));
        arr = new int[]{0, 2, 1, 0};
        System.out.println(solution.peakIndexInMountainArray(arr));
        arr = new int[]{0, 10, 5, 2};
        System.out.println(solution.peakIndexInMountainArray(arr));
        arr = new int[]{3, 4, 5, 1};
        System.out.println(solution.peakIndexInMountainArray(arr));
        arr = new int[]{24, 69, 100, 99, 79, 78, 67, 36, 26, 19};
        System.out.println(solution.peakIndexInMountainArray(arr));
        arr = new int[]{12,24, 69, 100, 99, 79, 78, 67, 36, 26, 19};
        System.out.println(solution.peakIndexInMountainArray(arr));
    }
}
