package sort;

/**
 * @Author zou18846936743
 * @Date 2020/12/12 上午10:28
 * @Version 1.0
 */
public class QuickSort {

    public static void quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = partition(arr, left, right);
        }
    }

    private static int partition(int[] arr, int left, int right) {
        int i = left + 1;
        int j = right;
        while (true) {
            while (i <= j && arr[i] < arr[left]) i++;
            while (i <= j && arr[j] > arr[left]) j--;
            if (i >= j) {
                break;
            }
//交换两个元素的位置，使得左边的元素不大于pivot,右边的不小于pivot
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        arr[left] = arr[j];
        // 使中轴元素处于有序的位置
        arr[j] = arr[left];
        return j;
    }
}
