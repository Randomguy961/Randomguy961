package com.capgemini.pack;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i,j;
        n*=2;
        for(i=1;i<=n;i++){
            for(j=0;j<(n-i);j++){
                System.out.print(" ");
            }
            for(j=0;j<i;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(i=n-1;i>0;i--){
            for(j=0;j<(n-i);j++){
                System.out.print(" ");
            }
            for(j=0;j<i;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
