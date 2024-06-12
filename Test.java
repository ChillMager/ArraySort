package ArraySort;
//升序排序
public class Test {
    public static void main(String[] args) {
        int[] arr = {8, 1, 0, 9, 7, 5};
//      InsertionSort.insertionSort(arr); //直接插入排序 --插入排序
//      BinaryInsertionSort.binaryInsertionSort(arr); //折半插入排序 --插入排序
//      ShellSort.shellSort(arr); //希尔排序 --插入排序
//      BubbleSort.bubbleSort(arr); //冒泡排序 --交换排序
//      QuickSort.quickSort(arr,low,high); //快速排序 --交换排序
//      SelectionSort.selectionSort(arr); //简单选择排序 --选择排序
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
