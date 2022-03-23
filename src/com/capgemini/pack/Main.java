package com.capgemini.pack;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Event Name: ");
        String name = sc.nextLine();
        System.out.println("Enter the cost per day");
        double cost = sc.nextDouble();
        System.out.println("Enter Number of Days");
        int num = sc.nextInt();
        System.out.println("Enter Your Choice");
        System.out.println("1.Exhibition");
        System.out.println("2.Stage Event");
        int i = sc.nextInt();
        if(i==1){
            System.out.println("Enter number of Stalls");
            int stalls = sc.nextInt();
            Exhibition e = new Exhibition(name,"Exhibition",cost,num,stalls);
            System.out.println(e);
        }
        else if(i==2){
            System.out.println("Enter number of Seats");
            int stalls = sc.nextInt();
            StageEvent s = new StageEvent(name,"Stage Event",cost,num,stalls);
            System.out.println(s);
        }
        else{
            System.out.println("Invalid Input");
        }
    }
}
