package sort;

/**
 * @Author zou18846936743
 * @Date 2020/12/11 下午2:45
 * @Version 1.0
 */
public class BubbleSort {
    /**
     * todo 冒泡排序 从第一个数据开始，与第二个数字进行比较 如果arr【1】 > arr[2] ，则交换位置，直到最后一个数字
     * 时间复杂度   O(n^2)
     * 空间复杂度    O(1)
     * 稳定排序
     * 10万数据测试  15s  (太垃圾)  交换次数多
     * 100万数据测试  超过3分钟
     */
    public static void BubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            //优化排序，如果冒泡的数据排序后没有数据发生变化，则跳出排序
            boolean flag = true;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    flag = false;
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            if (flag) {
                break;
            }
        }
    }
}
