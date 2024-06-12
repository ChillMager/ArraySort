package ArraySort;
//直接插入排序 --插入排序
public class InsertionSort {
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        //i 从1到n-1
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            // 将 arr[0..i-1] 中大于 key 的元素向右移动一个位置
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}
