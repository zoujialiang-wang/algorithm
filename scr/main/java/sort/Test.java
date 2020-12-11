package sort;

import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @Author zou18846936743
 * @Date 2020/12/11 下午2:02
 * @Version 1.0
 */
public class Test {

    public static void main(String[] args) throws InterruptedException {
        int[] arr = new int[100000];
        Random random = new Random();
        for (int i = 0; i < 100000; i++) {
            arr[i] = random.nextInt(100000);
        }
        long l = System.currentTimeMillis();
        ShellSort.ShellSort(arr);
        long l1 = System.currentTimeMillis();
        System.out.println(Thread.currentThread().getName() + "执行时间为：" + (l1 - l));

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }
}
