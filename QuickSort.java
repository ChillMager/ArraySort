package ArraySort;

public class QuickSort {
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // 划分数组，并返回划分点的位置
            int pi = partition(arr, low, high);

            // 对划分点左侧和右侧的子数组进行递归排序
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;

                // 交换 arr[i] 和 arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // 交换 arr[i+1] 和 arr[high]，将 pivot 放在正确的位置上
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
}