package com.pekey.framework.kmp;

import java.util.ArrayList;

public class KMP {
    //主串
    static String str = "BBC ABCDAB ABCDABCDABDE";
    //模式串
    static String ch = "ABCDABD";
    static int next[] = new int[20];

    public static void main(String[] args) {
        setNext();
        ArrayList<Integer> arr = getKmp();
        if (arr.size() != 0) {
            for (int i = 0; i < arr.size(); i++) {
                System.out.println("匹配发生在:" + arr.get(i));
            }
        } else {
            System.out.println("匹配不成功");
        }
    }

    private static void setNext() {
        // TODO Auto-generated method stub
        int lenCh = ch.length();
        next[0] = 0;
        next[1] = 1;
        //k表示next[i-1]的值
        int k = 0;
        for (int i = 2; i <= lenCh; i++) {
            k = next[k];
            /*
             * 这个while循环的作用找个例子看看就好理解了
             * 我认为是每次找最长，一旦成功就停止，保证找到的是当前最长
             */
            while (k != 0 && ch.charAt(i - 1) != ch.charAt(k)) {
                k = next[k];
            }
            if (ch.charAt(i - 1) == ch.charAt(k)) {
                k++;
            }//else就是k=0
            //不是next[k] = k，i表示有几个字符的前缀
            next[i] = k;
        }
    }

    private static ArrayList<Integer> getKmp() {
        // TODO Auto-generated method stub
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int lenStr = str.length();
        int lenCh = ch.length();
        //主串开始的匹配位置
        int pos = 0;
        //模式串每次匹配位置
        int k = 0;
        //循环条件不是k<lenCh,这样的话可能死循环(没有匹配发生)
        while (pos < lenStr) {
            /*
             * 首次进入没什么大作用，做要是为提高以后的匹配效率
             * 写在最后一行也行
             */
            k = next[k];
            while (k < lenCh && str.charAt(pos) == ch.charAt(k)) {
                pos++;
                k++;
            }
            if (lenCh == k) {
                arr.add(pos - k);
            } else if (0 == k) {
                /*
                 * 不加这一句死循环
                 * 因为next[0] = 0
                 * 比如abcd和abce，到de不匹配，此时执行k = next[k](k=3),
                 * k变为0，发现d和a不匹配，此时k还是0，重复执行以上步骤，那么死循环了
                 */
                pos++;
            }//实际上else就是k = next[k]，所以才说k = next[k]写在最后一行也行
        }
        return arr;
    }
}
