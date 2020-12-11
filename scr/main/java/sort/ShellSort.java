package sort;

/**
 * @Author zou18846936743
 * @Date 2020/12/11 下午6:32
 * @Versgapon 1.0
 */

/**
 * 时间复杂度   O(nlogn)
 * 空间复杂度    O(1)
 * 非稳定排序
 * 10万数据测试  0.02s
 * 100万数据测试  0.2s
 * 1000万数据测试  2-3s
 */
public class ShellSort {
    public static void ShellSort(int[] arr) {
        //对每组间隔为i的分组进行排序，开始为arr.length/2
        for (int i = arr.length / 2; i > 0; i /= 2) {
            //对每个局部分组进行插入排序
            for (int j = i; j < arr.length; j++) {
                insertI(arr, i, j);
            }
        }
    }

    private static void insertI(int[] arr, int i, int j) {
        int inserted = arr[j];
        int k;
        for (k = j - i; k >= 0 && inserted < arr[k]; k -= i) {
            arr[k + i] = arr[k];
        }
        arr[k + i] = inserted;
    }
}
