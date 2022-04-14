package com.capgemini.assessment;

import java.util.Scanner;
import java.util.Arrays;

public class Array1 {
    public static int getMaxValue(int[] numbers){
        int maxValue = numbers[0];
        for(int i=1;i < numbers.length;i++){
            if(numbers[i] > maxValue){
                maxValue = numbers[i];
            }
        }
        return maxValue;
    }

    public static int getMinValue(int[] numbers){
        int minValue = numbers[0];
        for(int i=1;i<numbers.length;i++){
            if(numbers[i] < minValue){
                minValue = numbers[i];
            }
        }
        return minValue;
    }
    public static void getSortedArray(int[] numbers){
        int i,j,temp;
        for(i=0;i<10;i++){
            for(j=0;j<10;j++){
                if(numbers[i]>numbers[j]){
                    temp=numbers[i];
                    numbers[i]=numbers[j];
                    numbers[j]=temp;
                }
            }
        }
        System.out.println("Sorted String: "+Arrays.toString(numbers));
    }
    public static void getReverseArray(int[] numbers){
        int[] reverse = new int[10];
        for (int i=0;i<10;i++) {
            reverse[9-i] = numbers[i];
        }
        System.out.println("Reversed String: "+Arrays.toString(reverse));
    }
    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);
        int a,i,max,min;
        for(i=0;i<10;i++){
            a = sc.nextInt();
            arr[i]=a;
        }
        max = getMaxValue(arr);
        min = getMinValue(arr);
        getReverseArray(arr);
        getSortedArray(arr);
        System.out.println("min = " + min);
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        sc.close();
    }
}
