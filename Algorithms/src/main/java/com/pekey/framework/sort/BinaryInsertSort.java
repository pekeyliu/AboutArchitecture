package com.pekey.framework.sort;

public class BinaryInsertSort {
    public static void main(String[] args) {
        int[] a = { 49, 38, 65, 97, 176, 213, 227, 49, 78, 34, 12, 164, 11, 18, 1 };
        System.out.println("排序之前：");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ", ");
        }

        sort(a);
        System.out.println();
        System.out.println("排序之后：");

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ", ");
        }
    }

    public static void sort(int[] a){
        for (int i = 0; i < a.length; i++) {
            int temp = a[i];
            int left = 0;
            int right = i - 1;
            int mid = 0;
            //通过二分法来快速查找temp元素应插入的位置
            while (left <= right){
                mid = (left + right)/2;
                if (temp < a[mid]){
                    right = mid - 1;
                }else {
                    left = mid + 1;
                }
            }
            //将大于temp元素的值统一向后移动一位
            for (int j = i-1; j >= left ; j--) {
                a[j+1] = a[j];
            }
            //在查找到合适的位置插入temp元素
            if (left != temp){
                a[left] = temp;
            }

        }
    }
}
