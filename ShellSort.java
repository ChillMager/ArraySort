package ArraySort;

public class ShellSort {
    public static void shellSort(int[] arr) {
        int n = arr.length;
        // 初始步长设定为数组长度的一半
        for (int gap = n / 2; gap > 0; gap /= 2) {
            // 从 gap 开始，对各个组内进行插入排序
            for (int i = gap; i < n; i++) {
                int temp = arr[i];
                int j = i;
                while (j >= gap && arr[j - gap] > temp) {
                    arr[j] = arr[j - gap];
                    j -= gap;
                }
                arr[j] = temp;
            }
        }
    }
}