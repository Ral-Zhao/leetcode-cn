package utils;

public class ArrayUtil {
    public static void printArray(int[] arr) {
        if (arr == null) {
            System.out.println("null");
            return;
        }
        if (arr.length == 0) {
            System.out.println("[]");
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]).append(",");
        }
        sb.deleteCharAt(sb.length() - 1).append("]");
        System.out.println(sb.toString());
    }
}
