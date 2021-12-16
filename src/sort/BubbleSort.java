package sort;


/**
 * @Authorz; sloth
 * @Description:
 * @Data:Create in 18:55 2020/6/16
 * @Modificd By;
 */

/*
冒泡排序，
比较相邻的元素。如果第一个比第二个大，就交换他们两个。

对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对。这步做完后，最后的元素会是最大的数。

针对所有的元素重复以上的步骤，除了最后一个。

持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较。
* */
public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {4 , 5 , 8 , 9 , 3 , 6 , 3};
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int tem = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tem;

                }
            }
        }
        System.out.println( "从小到大排序后的结果是:" );
        for (int i = 0; i < array.length; i++) {
            System.out.print( array[i] + " " );
        }
    }
}

