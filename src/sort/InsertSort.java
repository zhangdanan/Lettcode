package sort;

/**
 * @Authorz; sloth
 * @Description:
 * @Data:Create in 19:48 2020/6/16
 * @Modificd By;
 */

/*
* 将第一待排序序列第一个元素看做一个有序序列，把第二个元素到最后一个元素当成是未排序序列。

从头到尾依次扫描未排序序列，将扫描到的每个元素插入有序序列的适当位置。（如果待插入的元素与有序序列中的某个元素相等，则将待插入元素插入到相等元素的后面。）
* */
public class InsertSort {
    public static void main(String[] args) {
        int[] arr = {4 , 5 , 8 , 9 , 3 , 6 , 3};
        for (int i = 1; i < arr.length; i++) {
            // 记录要插入的数据
            int tmp = arr[i];
            // 从已经排序的序列最右边的开始比较，找到比其小的数
            int j = i;
            while (j > 0 && tmp < arr[j - 1]) {
                arr[j] = arr[j - 1];
                j--;
            }
            // 存在比其小的数，插入
            if (j != i) {
                arr[j] = tmp;
            }
        }
        System.out.println( "从小到大排序后的结果是:" );
        for (int i = 0; i < arr.length; i++) {
            System.out.print( arr[i] + " " );
        }
    }
}
