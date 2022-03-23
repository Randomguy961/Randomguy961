package com.capgemini.pack;

import java.util.Scanner;

public class Donor extends Person{
    private String bloodBankName;
    private String donorType;
    private String donationDate;

    public String getBloodBankName() {
        return bloodBankName;
    }

    public void setBloodBankName(String bloodBankName) {
        this.bloodBankName = bloodBankName;
    }

    public String getDonorType() {
        return donorType;
    }

    public void setDonorType(String donorType) {
        this.donorType = donorType;
    }

    public String getDonationDate() {
        return donationDate;
    }

    public void setDonationDate(String donationDate) {
        this.donationDate = donationDate;
    }

    public void displayDonationDetails(){
        System.out.println();
        System.out.println("Donation Details: ");
        System.out.println("Name : " + super.getName());
        System.out.println("Date Of Birth : " + super.getDateOfBirth());
        System.out.println("Gender : " + super.getGender());
        System.out.println("Mobile Number : " + super.getMobileNumber());
        System.out.println("Blood Group : " + super.getBloodGroup());
        System.out.println("Blood Bank Name : " + bloodBankName);
        System.out.println("Donor Type : " + donorType);
        System.out.println("Donation Date : " + donationDate);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Donor d = new Donor();
        System.out.println("Enter the name:");
        d.setName(sc.nextLine());
        System.out.println("Enter Date of Birth");
        d.setDateOfBirth(sc.nextLine());
        System.out.println("Enter Gender");
        d.setGender(sc.nextLine());
        System.out.println("Enter Mobile Number");
        d.setMobileNumber(sc.nextLine());
        System.out.println("Enter Blood Group");
        d.setBloodGroup(sc.nextLine());
        System.out.println("Enter Blood Bank Name");
        d.setBloodBankName(sc.nextLine());
        System.out.println("Enter Donor Type");
        d.setDonorType(sc.nextLine());
        System.out.println("Enter Donation Date");
        d.setDonationDate(sc.nextLine());
        d.displayDonationDetails();
    }
}
