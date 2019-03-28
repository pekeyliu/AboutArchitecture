package com.pekey.framework.stack;

import java.util.Stack;

/**
 * 代码实现计算器（带表达式）
 *
 */
public class Calculator {
    public static String toPostfix(String expstr) {
        SeqStack<String> stack = new SeqStack<String>(expstr.length());

        String postFix = "";

        int i = 0;
        while (i < expstr.length()) {
            char ch = expstr.charAt(i);
            switch (ch){
                case '+':
                case '-':
                    while (!stack.isEmpty() && !stack.pop().equals("(")){
                        postFix += stack.pop();
                    }
                    stack.push(ch + "");
                    i++;
                    break;
                case '*':
                case '/':
                    while (!stack.isEmpty() && (stack.peek().equals("*") || stack.peek().equals("/"))){
                        postFix += stack.pop();
                    }
                    stack.push(ch + "");
                    i++;
                    break;
                case '(':
                    stack.push(ch + "");
                    i++;
                    break;
                case ')':

                    while (!stack.isEmpty() && !stack.peek().equals("(")){
                        postFix += stack.pop();
                    }
                    i++;
                    break;
                default:
                    while (ch >= '0' && ch <= '9'){
                        postFix += ch;
                        i++;
                        if (i < expstr.length()){
                            ch = expstr.charAt(i);
                        }else {
                            ch = '=';
                        }
                    }
                    postFix += " ";
                    break;
            }
        }

        while (!stack.isEmpty()){
            postFix += stack.pop();
        }
        return postFix;
    }
    /**
     * 计算后缀表达式的值
     * @param postfix 传入后缀表达式
     * @return
     */
    public static int calculatePostfixValue(String postfix)
    {
        //栈用于存储操作数,协助运算
        Stack<Integer> stack = new Stack<>();
        int i=0, result=0;
        while (i<postfix.length())
        {
            char ch=postfix.charAt(i);
            if (ch>='0' && ch<='9')
            {
                result=0;
                while (ch!=' ')
                {
                    //将整数字符转为整数值ch=90
                    result = result*10 + Integer.parseInt(ch+"");
                    i++;
                    ch = postfix.charAt(i);
                }
                i++;
                stack.push(result);//操作数入栈
            }
            else
            {  //ch 是运算符,出栈栈顶的前两个元素
                int y= stack.pop();
                int x= stack.pop();
                switch (ch)
                {   //根据情况进行计算
                    case '+': result=x+y; break;
                    case '-': result=x-y; break;
                    case '*': result=x*y; break;
                    case '/': result=x/y; break;   //注意这里并没去判断除数是否为0的情况
                }
                //将运算结果入栈
                stack.push(result);
                i++;
            }
        }
        //将最后的结果出栈并返回
        return stack.pop();
    }

    public static void main(String[] args) {
        System.out.println("原始表达式：15/(6-1)*3 ; 转换后的表达式：" + toPostfix("15/(6-1)*3"));
        System.out.println("表达式计算结果：" + calculatePostfixValue(toPostfix("15/(6-1)*3")));
    }
}
