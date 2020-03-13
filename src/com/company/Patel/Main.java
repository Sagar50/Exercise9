//Sagar Patel, 3/13/2020, CSCI1660

package com.company.Patel;

abstract class AbsContact {
    private String email;
    private int phoneNumber;

    public AbsContact(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public AbsContact(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    abstract void contact();
}

class EmailContact extends AbsContact {

    public EmailContact(String email) {
        super(email);
    }

    @Override
    void contact() {
        System.out.println("Emailing " + getEmail());
    }
}

class PhoneContact extends AbsContact {

    public PhoneContact(int phoneNumber) {
        super(phoneNumber);
    }

    @Override
    void contact() {
        String phoneNumber = Integer.toString(getPhoneNumber());
        String phoneThree = phoneNumber.substring(0, 3);
        phoneThree = phoneThree + "-";
        String phoneSix = phoneNumber.substring(3, 6);
        phoneSix = phoneSix + "-";
        String phoneNum = phoneThree + phoneSix + phoneNumber.substring(6, 10);
        System.out.println("Calling " + phoneNum);
    }

}
public class Main {

    public static void main(String[] args) {

        EmailContact emailContact = new EmailContact("083401@swcsd.us");
        PhoneContact phoneContact = new PhoneContact(1231231234);

        emailContact.contact();
        phoneContact.contact();

    }

}
