package sort;

/**
 * @Authorz; sloth
 * @Description:
 * @Data:Create in 19:14 2020/6/16
 * @Modificd By;
 */

/*
选择排序
* 首先在未排序序列中找到最小（大）元素，存放到排序序列的起始位置

再从剩余未排序元素中继续寻找最小（大）元素，然后放到已排序序列的末尾。

重复第二步，直到所有元素均排序完毕。*/
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4 , 8 , 3 , 7 , 9 , 1 , 5 , 6};
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            // 每轮需要比较的次数 N-i
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    // 记录目前能找到的最小值元素的下标
                    min = j;
                }
            }
            // 将找到的最小值和i位置所在的值进行交换
            if (i != min) {
                int tmp = arr[i];
                arr[i] = arr[min];
                arr[min] = tmp;
            }
        }
        System.out.println( "从小到大排序后的结果是:" );
        for (int i = 0; i < arr.length; i++) {
            System.out.print( arr[i] + " " );
        }
    }
}