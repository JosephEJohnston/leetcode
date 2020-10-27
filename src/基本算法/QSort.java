package 基本算法;

import java.util.HashMap;
import java.util.Map;

public class QSort {
    public static void main(String[] args) {
        int[] a = new int[]{2, 8, 7, 1, 3, 5, 6, 4};
        QSort qSort = new QSort();
        qSort.sort(a);

        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();

        Map<String, Long> map = new HashMap<>(100, 0.75f);
    }

    public void sort(int[] a) {
        quickSort(a, 0, a.length - 1);
    }


    public void quickSort(int[] a, int p, int r) {
        if (p < r) {
            int q = partition(a, p, r);
            // 对上一轮排序中轴之外的数字排序
            quickSort(a, p, q - 1);
            quickSort(a, q + 1, r);
        }
    }

    public int partition(int[] a, int p, int r) {
        int x = a[r];
        // 左指针，将所有小于 x 的值置于左指针指向位置
        int i = p - 1;
        for (int j = p; j < r; j++) {
            if (a[j] <= x) {
                i = i + 1;

                // swap(a[i], a[j])
                int tmp = a[i];
                a[i] = a[j];
                a[j] = tmp;
            }
        }
        // swap(a[i + 1], a[r])
        // 此时所有小于 x 的值都在 i + 1 之前，故将 x 置于位置 i + 1
        int tmp = a[i + 1];
        a[i + 1] = a[r];
        a[r] = tmp;

        // 传回 x 所在位置，以此进行下一轮排序
        return i + 1;
    }
}
