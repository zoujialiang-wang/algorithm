package sort;

/**
 * @Author zou18846936743
 * @Date 2020/12/11 下午2:15
 * @Version 1.0
 */
public class InsertionSort {
    /**
     * todo: 插入排序：想象扑克牌排序
     * 时间复杂度   O(n^2)
     * 空间复杂度    O(1)
     * 稳定排序
     * 10万数据测试  3.5s  遍历次数少
     * 100万数据测试  超过3分钟
     */
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            //保存即将插入的元素
            int temp = arr[i];
            //将该元素与前面每一个元素比较，如果比前面的元素小，就把此元素右移
            for (int j = i; j > 0; j--) {
                if (temp < arr[j - 1]) {
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }
}
