package com.pekey.framework.sort;

/**
 * 直接排序
 * 将每一个值插入到前面排序好的队列中
 */
public class DirectInsertSort {
    public static void main(String[] args) {
        int[] a = { 49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 1 };
        System.out.println("排序之前：");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ", ");
        }

        //直接排序
        for (int i = 0; i < a.length; i++) {
            //待插入元素
            int temp = a[i];
            int j;

            for (j = i - 1; j >=0 ; j--) {
                //若后面的值小于前一位的值，则和前一位的值替换,直到插入到最合适的位置
                if (a[j] > temp){
                    a[j+1] = a[j];
                }else{
                    break;
                }
            }
            a[j+1] = temp;
        }

        System.out.println();
        System.out.println("排序之后：");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ", ");
        }
    }
}
