package ArraySort;

public class BinaryInsertionSort {
    public static void binaryInsertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int left = 0;
            int right = i - 1;

            // 使用二分查找找到插入位置
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (arr[mid] < key) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

            // 将 arr[left..i-1] 中大于 key 的元素向右移动一个位置
            for (int j = i - 1; j >= left; --j) {
                arr[j + 1] = arr[j];
            }
            arr[left] = key;
        }
    }
}