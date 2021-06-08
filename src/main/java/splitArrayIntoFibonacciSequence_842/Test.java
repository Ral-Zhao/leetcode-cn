package splitArrayIntoFibonacciSequence_842;

import com.alibaba.fastjson.JSON;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        List<Integer> result;
        result = solution.splitIntoFibonacci("123456579");
        System.out.println(JSON.toJSONString(result));
        result = solution.splitIntoFibonacci("11235813");
        System.out.println(JSON.toJSONString(result));
        result = solution.splitIntoFibonacci("112358130");
        System.out.println(JSON.toJSONString(result));
        result = solution.splitIntoFibonacci("1101111");
        System.out.println(JSON.toJSONString(result));
        result = solution.splitIntoFibonacci("0123");
        System.out.println(JSON.toJSONString(result));
        result = solution.splitIntoFibonacci("0000");
        System.out.println(JSON.toJSONString(result));
        result = solution.splitIntoFibonacci("539834657215398346785398346991079669377161950407626991734534318677529701785098211336528511");
        System.out.println(JSON.toJSONString(result));
        result = solution.splitIntoFibonacci("1023");
        System.out.println(JSON.toJSONString(result));
    }
}
