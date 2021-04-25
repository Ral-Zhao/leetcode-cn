package timeBasedKeyValueStore_981;

public class Test {
    public static void main(String[] args) {
        TimeMap map = new TimeMap();
        map.set("love","high",10);
        map.set("love","low",20);
        System.out.println(map.get("love", 5)); // 输出
        System.out.println(map.get("love", 10)); // 输出
        System.out.println(map.get("love", 15)); // 输出
    }
}
