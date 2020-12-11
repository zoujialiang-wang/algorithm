package sort;

/**
 * @Author zou18846936743
 * @Date 2020/12/11 下午1:52
 * @Version 1.0
 */
public class SelectionSort {
    /**
     * TODO 选择排序：首先，找到数组中最小的那个元素，然后将它和数组的第一个元素交换位置(如果第一个元素就是最小元素那么它就和自己交换)
     * 时间复杂度   O(n^2)
     * 空间复杂度    O(1)
     * 非稳定排序
     * 10万数据测试  3.9s   只改变索引  交换了n次
     * 100万数据测试  超过3分钟
     */
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            //最小值索引
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                //如果后面的值小于最小值，更改最小索引
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            //将最小值数据与i索引数据交换
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
}
