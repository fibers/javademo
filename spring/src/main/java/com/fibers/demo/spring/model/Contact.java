package com.fibers.demo.spring.model;

public class Contact {
    private String email;
    private String cellphone;

    public Contact(String email, String cellphone) {
        this.email = email;
        this.cellphone = cellphone;
    }

    public Contact(){

    }

    @Override
    public String toString() {
        return "Contact{" +
                "email='" + email + '\'' +
                ", cellphone='" + cellphone + '\'' +
                '}';
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }
}
