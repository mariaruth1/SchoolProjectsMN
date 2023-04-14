package org.exercise1;

import java.util.Objects;

public class Customer {

    private int phoneNumber;
    private String name;
    private String address;
    private String email;

    public Customer(int phoneNumber, String name, String address, String email) {
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.address = address;
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Customer customer = (Customer) o;

        if (phoneNumber != customer.phoneNumber) return false;
        if (!Objects.equals(name, customer.name)) return false;
        if (!Objects.equals(address, customer.address)) return false;
        return Objects.equals(email, customer.email);
    }



    @Override
    public int hashCode() {
        int result = phoneNumber;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        return result;
    }
}
