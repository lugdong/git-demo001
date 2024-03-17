package com.atguigu.git;

import java.util.Scanner;

public class Gongyushu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c =a%b;
        if (c==0){
            System.out.println("最大公约数为:"+b);
        }else{
            a=b;
            b=c;
        }



    }
}
