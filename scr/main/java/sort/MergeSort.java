package sort;

/**
 * @Author zou18846936743
 * @Date 2020/12/12 上午9:22
 * @Version 1.0
 */
public class MergeSort {

    /**
     * 时间复杂度   O(nlogn)
     * 空间复杂度    O(n)
     * 稳定排序
     * 10万数据测试  0.02s
     * 100万数据测试  0.13s
     * 1000万数据测试  1.3s
     */
    // 归并排序（Java-递归版）
    static void merge_sort_recursive(int[] arr, int[] result, int start, int end) {
        if (start >= end)
            return;
        int len = end - start, mid = (len >> 1) + start;
        int start1 = start, end1 = mid;
        int start2 = mid + 1, end2 = end;
        merge_sort_recursive(arr, result, start1, end1);
        merge_sort_recursive(arr, result, start2, end2);
        int k = start;
        while (start1 <= end1 && start2 <= end2)
            result[k++] = arr[start1] < arr[start2] ? arr[start1++] : arr[start2++];
        while (start1 <= end1)
            result[k++] = arr[start1++];
        while (start2 <= end2)
            result[k++] = arr[start2++];
        for (k = start; k <= end; k++)
            arr[k] = result[k];
    }
}
