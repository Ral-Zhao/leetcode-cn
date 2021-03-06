package utils;

public class FormatHelper {
    public static void main(String[] args) {
        print("", 0);
    }

    private static void print(String input, int num) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (i != 0 && input.charAt(i - 1) == '-') {
                if (c >= 'a' && c <= 'z') {
                    c -= 32;
                }
            }
            if (input.charAt(i) != '-') {
                sb.append(c);
            }
        }
        sb.append("_").append(num);
        System.out.println(sb.toString());
    }


}
