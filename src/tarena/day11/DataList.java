package tarena.day11;

import java.util.Arrays;

/*
 * 不受限制的存入多个数据的数据容器
 */
public class DataList {
    private int[] arr = new int[5];
    private int index;

    public void add(int n) {
        // 检查数组是否已满
        if (index >= arr.length) {
            // 复制原数组 1.5 倍长度的新数组
            arr = Arrays.copyOf(arr, arr.length * 3 / 2 + 1);
        }
        // 向指针位置放入数据并后移指针
        arr[index++] = n;
    }

    public int get(int i) {
        return arr[i];
    }

    public int size() {
        return index;
    }

    public DieDaiQi diedaiqi() {
        return new Ddq();
    }

    private class Ddq implements DieDaiQi {
        int i = 0;

        public int next() {
            return arr[i++];
        }

        public boolean hasNext() {
            return i < index;
        }
    }

}
