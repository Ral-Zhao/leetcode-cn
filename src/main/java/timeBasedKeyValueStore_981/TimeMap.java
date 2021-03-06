package timeBasedKeyValueStore_981;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 创建一个基于时间的键值存储类 TimeMap，它支持下面两个操作：
 * <p>
 * 1. set(string key, string value, int timestamp)
 * <p>
 * 存储键 key、值 value，以及给定的时间戳 timestamp。
 * 2. get(string key, int timestamp)
 * <p>
 * 返回先前调用 set(key, value, timestamp_prev) 所存储的值，其中 timestamp_prev <= timestamp。
 * 如果有多个这样的值，则返回对应最大的  timestamp_prev 的那个值。
 * 如果没有值，则返回空字符串（""）。
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：inputs = ["TimeMap","set","get","get","set","get","get"], inputs = [[],["foo","bar",1],["foo",1],["foo",3],["foo","bar2",4],["foo",4],["foo",5]]
 * 输出：[null,null,"bar","bar",null,"bar2","bar2"]
 * 解释： 
 * TimeMap kv;  
 * kv.set("foo", "bar", 1); // 存储键 "foo" 和值 "bar" 以及时间戳 timestamp = 1  
 * kv.get("foo", 1);  // 输出 "bar"  
 * kv.get("foo", 3); // 输出 "bar" 因为在时间戳 3 和时间戳 2 处没有对应 "foo" 的值，所以唯一的值位于时间戳 1 处（即 "bar"）  
 * kv.set("foo", "bar2", 4);  
 * kv.get("foo", 4); // 输出 "bar2"  
 * kv.get("foo", 5); // 输出 "bar2"  
 * <p>
 * 示例 2：
 * <p>
 * 输入：inputs = ["TimeMap","set","set","get","get","get","get","get"], inputs = [[],["love","high",10],["love","low",20],["love",5],["love",10],["love",15],["love",20],["love",25]]
 * 输出：[null,null,null,"","high","high","low","low"]
 *  
 * <p>
 * 提示：
 * <p>
 * 所有的键/值字符串都是小写的。
 * 所有的键/值字符串长度都在 [1, 100] 范围内。
 * 所有 TimeMap.set 操作中的时间戳 timestamps 都是严格递增的。
 * 1 <= timestamp <= 10^7
 * TimeMap.set 和 TimeMap.get 函数在每个测试用例中将（组合）调用总计 120000 次。
 * <p>
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/time-based-key-value-store
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
class TimeMap {

    private Map<String, List<Entry>> map;

    /**
     * Initialize your data structure here.
     */
    public TimeMap() {
        this.map = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        List<Entry> list = map.getOrDefault(key, new ArrayList<>());
        list.add(new Entry(value, timestamp));
        map.put(key, list);
    }

    public String get(String key, int timestamp) {
        List<Entry> list = map.get(key);
        if (list == null) {
            return "";
        }
        int left = 0;
        int right = list.size() - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            Entry entry = list.get(mid);
            if (entry.timestamp == timestamp) {
                return entry.value;
            } else if (entry.timestamp < timestamp) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        if (right < 0) {
            return "";
        }
        return list.get(left - 1).value;
    }

    private class Entry {
        String value;
        int timestamp;

        public Entry(String value, int timestamp) {
            this.timestamp = timestamp;
            this.value = value;
        }
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */
