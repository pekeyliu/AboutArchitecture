package com.pekey.framework.stack;

import java.util.Stack;

/**
 * 栈的应用：
 * 1、符号匹配
 * 2、中缀表达式转换为后缀表达式
 * 3、计算后缀表达式
 * 4、实现函数的嵌套调用
 * 5、HTML和XML文件中的标签匹配
 * 6、网页浏览器中已访问页面的历史记录
 */
public class CheckExpression {

    public static String isValid(String expstr) {
        Stack<String> stack = new Stack<String>();
        int i = 0;
        while (i < expstr.length()){
            char ch = expstr.charAt(i);
            i++;
            switch (ch){
                case '(':
                    stack.push(ch + "");
                    break;
                case  ')':
                    if (stack.isEmpty() || !stack.pop().equals("("))
                        return "(";
            }
        }
        if (stack.isEmpty()){
            return "check pass";
        }else {
            return "check exception!";
        }
    }

    public static void main(String[] args) {
        String expstr="2/((6-1)*3)";
        System.out.println(expstr+"  "+isValid(expstr));


        //1+3*(9-2)+9        转化前的中缀表达式
        //1 3 9 2 - * + 9 +  转化后的后缀表达式
    }

}
