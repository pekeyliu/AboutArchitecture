package com.pekey.framework;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println(sum(10));

    }

    public static int sum(int a){
        if(a == 0) return 0;
        return sum(a-1) + a;
    }
}
