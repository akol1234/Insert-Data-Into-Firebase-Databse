package com.example.insertintofirebasedatabse;

public class StudentDetails {

    private String country;
    private String name;
    private String phoneNumber;

    public StudentDetails() {
        // This is default constructor.
    }
    public String getStudentCountry() {

        return country;
    }
    public void setStudentCountry(String country) {

        this.country = country;
    }

    public String getStudentName() {

        return name;
    }

    public void setStudentName(String name) {

        this.name = name;
    }

    public String getStudentPhoneNumber() {

        return phoneNumber;
    }

    public void setStudentPhoneNumber(String phonenumber) {

        this.phoneNumber = phonenumber;
    }

}

