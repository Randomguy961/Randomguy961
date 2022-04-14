package com.capgemini.pack;

import java.util.Scanner;

public class SubStringPlaindrome {
    public boolean isPalindrome(String str){
        int i, n;
        n = str.length();
        if(n==0||n==1){
            return true;
        }
        StringBuilder res= new StringBuilder();
        for(i=n-1;i>=0;i--) res.append(str.charAt(i));
        return str.equalsIgnoreCase(res.toString());
    }
    public int subString(String str){
        int i,j,count=0,n=str.length();
        for(i=0;i<n;i++){
            for(j=i+1;j<=n;j++){
                if(isPalindrome(str.substring(i,j))){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        SubStringPlaindrome s = new SubStringPlaindrome();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter hello String:");
        String str = sc.nextLine();
        System.out.println("The number of substring palindromes are:"+s.subString(str));
    }
}
