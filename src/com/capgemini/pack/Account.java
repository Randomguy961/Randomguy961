package com.capgemini.pack;

public class Account {
    String name;
    String tranType;
    String accNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTranType() {
        return tranType;
    }

    public void setTranType(String tranType) {
        this.tranType = tranType;
    }

    public String getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(String accNumber) {
        this.accNumber = accNumber;
    }

    public static void main(String[] args) {
        Account ob=new Account();
        // ob.name="Akshata";
        ob.setName("Akshata");
        ob.setTranType("debit");
//        ob.tranType="debit";
        ob.setAccNumber("0000054789");
//        ob.accNumber="0000054789";

        Account ob2=new Account();
        ob2.setName("Prasad");
//        ob2.name="Prasad";
        ob2.setTranType("debit");
//        ob2.tranType="debit";

        ob2.setAccNumber("2765346900");
//        ob2.accNumber="2765346900";

        System.out.println(ob.getName());
        System.out.println(ob.getTranType());
        System.out.println(ob.getAccNumber());

        System.out.println("=============================================================");
        System.out.println("Name = "+ob2.getName());
        System.out.println("Account Number = "+ob2.getAccNumber());
        System.out.println("Trans Type ="+ob2.getTranType());
}
}
