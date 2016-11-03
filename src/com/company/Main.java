package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
        String instr=sc.next();
        int baseN=sc.nextInt();
        int baseM=sc.nextInt();
        String out="";
        int help=1;
        int inint=0;
        for(int i=instr.length()-1;i>=0;i--){
            if(instr.charAt(i)>='0'&&instr.charAt(i)<='9')inint+=(instr.charAt(i)-48)*help;
            else inint+=(instr.charAt(i)-55)*help;
            help*=baseN;
        }
        for(;inint>0;inint/=baseM)if(inint%baseM>=0&&inint%baseM<=9)out=(char)(inint%baseM+48)+out;
            else out=(char)(inint%baseM+55)+out;
        System.out.println(out);
    }
}
