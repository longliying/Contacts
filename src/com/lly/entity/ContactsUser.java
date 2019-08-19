package com.lly.entity;

public class ContactsUser {
    private String name;
    private String password;
    private int phone;
    private String address;

    public ContactsUser() {
    }

    public ContactsUser(String name, String password, int phone, String address) {
        this.name = name;
        this.password = password;
        this.phone = phone;
        this.address = address;
    }
    public ContactsUser(String name, int phone, String address) {
        this.name = name;
        this.phone = phone;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "ContactsUser{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", phone=" + phone +
                ", address='" + address + '\'' +
                '}';
    }
}
