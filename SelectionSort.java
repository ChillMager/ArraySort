package ArraySort;

public class SelectionSort {
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        // 遍历整个数组
        for (int i = 0; i < n - 1; i++) {
            // 假设当前位置的元素为最小值
            int minIndex = i;
            // 在剩余未排序的部分中找到最小值的索引
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // 将最小值交换到当前位置
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}