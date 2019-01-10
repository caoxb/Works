package tarena.day13;

import java.util.HashMap;
import java.util.Map;

public class Ex1 {
    public static void main(String[] args) {
        Map<String, Integer> map =
                tongJi("啊 啊 哦 哦 饿 饿 一 一 一 无无无  无无无");
        System.out.println(map);
    }

    // 统计单词在字符串中出现的次数
    public static Map<String, Integer> tongJi(String s) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        String[] arr = s.split(" +");
        for (String word : arr) {
            if ("".equals(word)) {
                continue;
            }
            Integer c = map.get(word);
            if (c == null) {
                map.put(word, 1);
            } else {
                map.put(word, c + 1);
            }
        }
        return map;
    }
}









